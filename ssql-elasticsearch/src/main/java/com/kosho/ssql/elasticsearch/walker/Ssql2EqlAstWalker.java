package com.kosho.ssql.elasticsearch.walker;

import com.kosho.ssql.core.semantic.Ssql;

/**
 * Ssql2Eql表达式遍历者
 *
 * @author Kosho
 * @since 2021-07-16
 */
public interface Ssql2EqlAstWalker {
    void walk(Ssql ssql);
}
