package com.kosho.ssql.elasticsearch.sharding.condition;

import com.kosho.ssql.core.dsl.semantic.where.OperationExpression;

import java.util.Optional;

/**
 * 分片字段提取
 *
 * @author Kosho
 * @since 2021-08-27
 */
public class ShardingColumnExtractor {
    public static Optional<String> extract(OperationExpression expression) {
        return Optional.empty();
    }
}
