package com.kosho.ssql.elasticsearch.sharding.condition;

import com.kosho.ssql.core.dsl.semantic.Ssql;

/**
 * 分片条件解析器工厂
 *
 * @author Kosho
 * @since 2021-08-27
 */
public class ShardingConditionParserFactory {
    public static ShardingConditionParser<Ssql> getSsqlConditionParser(Ssql ssql) {
        // where condition parser
        return SsqlQueryShardingConditionParser.INSTANCE;
    }
}
