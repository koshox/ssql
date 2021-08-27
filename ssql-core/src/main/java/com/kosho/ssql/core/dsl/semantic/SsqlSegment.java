package com.kosho.ssql.core.dsl.semantic;

import com.kosho.ssql.core.dsl.semantic.constants.SegmentType;

/**
 * Ssql子表达式
 *
 * @author Kosho
 * @since 2021-7-10
 */
public interface SsqlSegment {
    SegmentType type();
}
