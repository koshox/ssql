package com.kosho.ssql.core.semantic.from;

import com.kosho.ssql.core.semantic.SsqlSegment;
import com.kosho.ssql.core.semantic.constants.SegmentType;

import java.util.List;
import java.util.stream.Collectors;

/**
 * From表达式
 *
 * @author Kosho
 * @since 2021-07-10
 */
public class From implements SsqlSegment {
    private List<Table> tables;

    public From(List<Table> tables) {
        this.tables = tables;
    }

    public List<Table> getTables() {
        return tables;
    }

    public void setTables(List<Table> tables) {
        this.tables = tables;
    }

    @Override
    public SegmentType type() {
        return SegmentType.FROM;
    }

    @Override
    public String toString() {
        return "from " + tables.stream().map(Object::toString).collect(Collectors.joining(", "));
    }
}
