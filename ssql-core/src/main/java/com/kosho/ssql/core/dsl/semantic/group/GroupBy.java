package com.kosho.ssql.core.dsl.semantic.group;

import com.kosho.ssql.core.dsl.semantic.value.Value;
import com.kosho.ssql.core.dsl.semantic.SsqlSegment;
import com.kosho.ssql.core.dsl.semantic.constants.SegmentType;

import java.util.List;
import java.util.stream.Collectors;

/**
 * GroupBy表达式
 *
 * @author Kosho
 * @since 2021-07-10
 */
public class GroupBy implements SsqlSegment {
    private List<Value> groupItems;

    private Having having;

    public List<Value> getGroupItems() {
        return groupItems;
    }

    public void setGroupItems(List<Value> groupItems) {
        this.groupItems = groupItems;
    }

    public Having getHaving() {
        return having;
    }

    public void setHaving(Having having) {
        this.having = having;
    }

    @Override
    public SegmentType type() {
        return SegmentType.GROUP_BY;
    }

    @Override
    public String toString() {
        return "group by " + groupItems.stream().map(Object::toString).collect(Collectors.joining(", "))
                + (having == null ? "" : having.toString());
    }
}
