package com.kosho.ssql.elasticsearch.sharding.utils;

import com.google.common.collect.Range;
import com.kosho.ssql.core.exception.SsqlException;

import java.lang.reflect.Field;

/**
 * Range工具类
 *
 * @author Kosho
 * @since 2021-08-27
 */
public class RangeUtils {
    private static final Field LOWER_BOUND_FIELD;

    private static final Field UPPER_BOUND_FIELD;

    static {
        try {
            LOWER_BOUND_FIELD = Range.class.getDeclaredField("lowerBound");
            LOWER_BOUND_FIELD.setAccessible(true);
            UPPER_BOUND_FIELD = Range.class.getDeclaredField("upperBound");
            UPPER_BOUND_FIELD.setAccessible(true);
        } catch (NoSuchFieldException e) {
            throw new SsqlException(e);
        }
    }

    public static boolean isCloseConnected(Range<?> left, Range<?> right) {
        return getLowerBound(left).compareTo(getUpperBound(right)) < 0
                && getLowerBound(right).compareTo(getUpperBound(left)) < 0;
    }

    @SuppressWarnings("unchecked")
    private static Comparable<Object> getLowerBound(Range<?> range) {
        try {
            return (Comparable<Object>) LOWER_BOUND_FIELD.get(range);
        } catch (IllegalAccessException e) {
            throw new SsqlException(e);
        }
    }

    @SuppressWarnings("unchecked")
    private static Comparable<Object> getUpperBound(Range<?> range) {
        try {
            return (Comparable<Object>) UPPER_BOUND_FIELD.get(range);
        } catch (IllegalAccessException e) {
            throw new SsqlException(e);
        }
    }
}
