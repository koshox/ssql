package com.kosho.ssql.elasticsearch.sharding;

import com.kosho.ssql.elasticsearch.Ssql2EqlContext;
import com.kosho.ssql.elasticsearch.Ssql2EqlRewriter;
import com.kosho.ssql.elasticsearch.sharding.meta.ShardingRuleManager;
import com.kosho.ssql.elasticsearch.sharding.meta.ShardingTable;
import com.kosho.ssql.elasticsearch.sharding.meta.ShardingTableRule;
import com.kosho.ssql.elasticsearch.sharding.route.ShardingRouteResult;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Ssql编译Eql分片改写
 *
 * @author Kosho
 * @since 2021-08-27
 */
public class Ssql2EqlShardingRewriter implements Ssql2EqlRewriter {
    @Override
    public List<String> rewriteTableName(Ssql2EqlContext context, String tableName) {
        ShardingTableRule shardingTableRule = ShardingRuleManager.getInstance().getRule(tableName);
        if (shardingTableRule == null) {
            return Collections.singletonList(tableName);
        }

        ShardingRouteResult shardingRouteResult = Ssql2EqlShardingRouter.getInstance().route(context.getSsql());
        return shardingRouteResult.getTables().stream()
                .map(ShardingTable::getTableName)
                .collect(Collectors.toList());
    }
}
