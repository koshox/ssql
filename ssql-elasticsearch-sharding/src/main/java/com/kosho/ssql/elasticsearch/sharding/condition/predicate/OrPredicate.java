package com.kosho.ssql.elasticsearch.sharding.condition.predicate;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Or Predicate
 *
 * @author Kosho
 * @since 2021-08-27
 */
public class OrPredicate {
    private final List<AndPredicate> andPredicates = new ArrayList<>();

    public void add(AndPredicate andPredicate) {
        this.andPredicates.add(andPredicate);
    }


    public void addAll(List<AndPredicate> andPredicates) {
        this.andPredicates.addAll(andPredicates);
    }

    public List<AndPredicate> getAndPredicates() {
        return andPredicates;
    }

    @Override
    public String toString() {
        if (CollectionUtils.isEmpty(andPredicates)) {
            return StringUtils.EMPTY;
        }

        if (andPredicates.size() == 1) {
            return andPredicates.get(0).toString();
        }

        return andPredicates.stream()
                .map(and -> "(" + and.toString() + ")")
                .collect(Collectors.joining(" or "));
    }
}
