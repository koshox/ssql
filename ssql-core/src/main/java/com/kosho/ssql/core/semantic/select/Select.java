package com.kosho.ssql.core.semantic.select;

import com.kosho.ssql.core.semantic.SsqlSegment;
import com.kosho.ssql.core.semantic.constants.SegmentType;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Select表达式
 *
 * @author Kosho
 * @since 2021-07-10
 */
public class Select implements SsqlSegment {
    private boolean star;

    private boolean distinct;

    private List<SelectItem> selectItems;

    public boolean isStar() {
        return star;
    }

    public void setStar(boolean star) {
        this.star = star;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public List<SelectItem> getSelectItems() {
        return selectItems;
    }

    public void setSelectItems(List<SelectItem> selectItems) {
        this.selectItems = selectItems;
    }

    @Override
    public SegmentType type() {
        return SegmentType.SELECT;
    }

    @Override
    public String toString() {
        if (star) {
            return "select *";
        }

        return "select" + (distinct ? " distinct " : " ")
                + selectItems.stream().map(Object::toString).collect(Collectors.joining(", "));
    }
}
