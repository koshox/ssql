package com.kosho.ssql.core.spi;

import com.kosho.ssql.core.exception.SsqlException;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;

/**
 * Ssql自定义SPI实现
 *
 * @author Kosho
 * @since 2021-08-27
 */
@SuppressWarnings("unchecked")
public class SpiLoader<S> {
    private static final String SPI_CFG_PREFIX = "META-INF/services/";

    private static final Map<Class<?>, SpiLoader> SPI_LOADERS = new ConcurrentHashMap<>();

    private final List<Class<? extends S>> classList = Collections.synchronizedList(new ArrayList<>());

    private final ConcurrentHashMap<String, Class<? extends S>> spiName2Class = new ConcurrentHashMap<>();

    private final ConcurrentHashMap<String, S> className2Singleton = new ConcurrentHashMap<>();

    private final AtomicBoolean loaded = new AtomicBoolean(false);

    private Class<? extends S> defaultClass = null;

    private Class<S> service;

    private SpiLoader(Class<S> service) {
        this.service = service;
    }

    /**
     * 创建SPI加载器
     *
     * @param service SPI接口
     * @param <T> SPI泛型
     * @return SPI加载器
     */
    public static <T> SpiLoader<T> of(Class<T> service) {
        Validate.notNull(service, "Spi class cannot be null");
        Validate.isTrue(service.isInterface(), "Spi class[" + service.getName() + "] must be interface");

        return SPI_LOADERS.computeIfAbsent(service, key -> new SpiLoader(service));
    }

    /**
     * 按照名称加载SPI实现
     *
     * @param name SPI名称
     * @return SPI impl
     */
    public S loadInstance(String name) {
        Validate.notEmpty(name, "SPI name cannot be empty");

        load();

        Class<? extends S> clazz = spiName2Class.get(name);
        if (clazz == null) {
            throw new SsqlException("no Provider class's aliasName is " + name);
        }

        return createInstance(clazz);
    }

    /**
     * 加载默认SPI实现
     *
     * @return default SPI impl
     */
    public S loadDefaultInstance() {
        load();

        if (defaultClass == null) {
            return null;
        }

        return createInstance(defaultClass);
    }

    /**
     * 加载优先级最高的SPI实现
     *
     * @return SPI impl
     */
    public S loadInstanceByPriority() {
        load();

        if (classList.isEmpty()) {
            return null;
        }

        return createInstance(classList.get(0));
    }

    /**
     * 加载所有SPI实现
     *
     * @return SPI impl list
     */
    public List<S> loadAllInstances() {
        load();

        return createInstances(classList);
    }

    private void load() {
        if (!loaded.compareAndSet(false, true)) {
            return;
        }

        String fullFileName = SPI_CFG_PREFIX + service.getName();
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        if (classLoader == null) {
            classLoader = ClassLoader.getSystemClassLoader();
        }

        Enumeration<URL> urls;
        try {
            urls = classLoader.getResources(fullFileName);
        } catch (IOException e) {
            throw new SsqlException("Error locating SPI configuration file, filename=" + fullFileName + ", classloader=" + classLoader, e);
        }

        if (urls == null || !urls.hasMoreElements()) {
            return;
        }

        while (urls.hasMoreElements()) {
            URL url = urls.nextElement();
            try (InputStream in = url.openStream();
                 BufferedReader br = new BufferedReader(new InputStreamReader(in, StandardCharsets.UTF_8))) {
                String line;
                while ((line = br.readLine()) != null) {
                    if (StringUtils.isBlank(line)) {
                        continue;
                    }

                    line = line.trim();
                    int commentIndex = line.indexOf("#");
                    if (commentIndex == 0) {
                        continue;
                    }

                    if (commentIndex > 0) {
                        line = line.substring(0, commentIndex);
                        line = line.trim();
                    }

                    load(classLoader, line, fullFileName);
                }
            } catch (IOException e) {
                throw new SsqlException("error reading SPI configuration file", e);
            }
        }

        classList.sort((class1, class2) -> {
            Spi spi1 = class1.getAnnotation(Spi.class);
            int order1 = spi1 == null ? 0 : spi1.order();

            Spi spi2 = class2.getAnnotation(Spi.class);
            int order2 = spi2 == null ? 0 : spi2.order();

            return Integer.compare(order1, order2);
        });
    }

    private void load(ClassLoader classLoader, String implClazzName, String fullFileName) {
        Class<S> clazz;
        try {
            clazz = (Class<S>) Class.forName(implClazzName, false, classLoader);
        } catch (ClassNotFoundException e) {
            throw new SsqlException("class " + implClazzName + " not found", e);
        }

        if (!service.isAssignableFrom(clazz)) {
            throw new SsqlException("class " + clazz.getName() + "is not implement of " + service.getName() + ", SPI configuration file=" + fullFileName);
        }

        classList.add(clazz);
        Spi spi = clazz.getAnnotation(Spi.class);
        String spiName = (spi == null || StringUtils.isEmpty(spi.value()))
                ? clazz.getName()
                : spi.value();
        if (spiName2Class.containsKey(spiName)) {
            Class<? extends S> existClass = spiName2Class.get(spiName);
            throw new SsqlException("Found repeat SPI name for " + clazz.getName() + " and "
                    + existClass.getName() + ",SPI configuration file=" + fullFileName);
        }
        spiName2Class.put(spiName, clazz);

        if (spi != null && spi.isDefault()) {
            if (defaultClass != null) {
                throw new SsqlException("Found more than one default Provider, SPI configuration file=" + fullFileName);
            }
            defaultClass = clazz;
        }
    }

    private List<S> createInstances(List<Class<? extends S>> clazzList) {
        if (CollectionUtils.isEmpty(clazzList)) {
            return Collections.emptyList();
        }

        return clazzList.stream().map(this::createInstance).collect(Collectors.toList());
    }

    private S createInstance(Class<? extends S> clazz) {
        Spi spi = clazz.getAnnotation(Spi.class);
        boolean singleton = spi == null || spi.isSingleton();

        if (!singleton) {
            return createInstance0(clazz);
        }

        return className2Singleton.computeIfAbsent(clazz.getName(), key -> createInstance0(clazz));
    }

    private S createInstance0(Class<? extends S> clazz) {
        try {
            return service.cast(clazz.newInstance());
        } catch (Exception e) {
            throw new SsqlException(clazz.getName() + " could not be instantiated");
        }
    }
}
