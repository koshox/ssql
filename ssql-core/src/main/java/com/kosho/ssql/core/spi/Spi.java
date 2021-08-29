package com.kosho.ssql.core.spi;

import java.lang.annotation.*;

/**
 * Ssql Spi注解.
 *
 * @author Kosho
 * @since 2021-08-27
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface Spi {
    /**
     * SPI名称
     */
    String value() default "";

    /**
     * 是否单例
     */
    boolean isSingleton() default true;

    /**
     * 是否默认
     */
    boolean isDefault() default false;

    /**
     * 优先级
     */
    int order() default 0;

    /**
     * 最高优先级
     */
    int ORDER_HIGHEST = Integer.MIN_VALUE;

    /**
     * 最低优先级
     */
    int ORDER_LOWEST = Integer.MAX_VALUE;
}
