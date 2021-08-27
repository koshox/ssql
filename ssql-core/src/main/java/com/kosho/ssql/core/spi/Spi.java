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
    String value() default "";

    boolean isSingleton() default true;

    boolean isDefault() default false;

    int order() default 0;

    int ORDER_HIGHEST = Integer.MIN_VALUE;

    int ORDER_LOWEST = Integer.MAX_VALUE;
}
