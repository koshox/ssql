package com.kosho.ssql.elasticsearch.walker;

import com.kosho.ssql.core.dsl.semantic.Ssql;

/**
 * Ssql2Eql表达式遍历者
 *
 * @author Kosho
 * @since 2021-07-16
 */
public interface Ssql2EqlAstWalker {
    /**
     * 遍历
     *
     * @param ssql ssql表达式
     */
    void walk(Ssql ssql);
}
