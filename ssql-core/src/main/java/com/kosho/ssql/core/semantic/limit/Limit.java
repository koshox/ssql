package com.kosho.ssql.core.semantic.limit;

import com.kosho.ssql.core.semantic.SsqlSegment;
import com.kosho.ssql.core.semantic.constants.SegmentType;

/**
 * Limit表达式
 *
 * @author Kosho
 * @since 2021-07-10
 */
public class Limit implements SsqlSegment {
    private Integer start;

    private Integer limit;

    public Limit(Integer limit) {
        this.limit = limit;
    }

    public Limit(Integer start, Integer limit) {
        this.start = start;
        this.limit = limit;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public SegmentType type() {
        return SegmentType.LIMIT;
    }

    @Override
    public String toString() {
        if (start == null) {
            return "limit " + limit;
        }

        return "limit " + start + ", " + limit;
    }
}
