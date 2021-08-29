package com.kosho.ssql.elasticsearch.sharding.route;

import com.kosho.ssql.elasticsearch.sharding.meta.ShardingTable;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 分片路由结果
 *
 * @author Kosho
 * @since 2021-08-27
 */
public class ShardingRouteResult {
    private final Set<ShardingTable> tables;

    private ShardingRouteResult(Set<ShardingTable> tables) {
        this.tables = tables;
    }

    public static ShardingRouteResult of(List<ShardingTable> result) {
        return new ShardingRouteResult(new HashSet<>(result));
    }

    public static ShardingRouteResult empty() {
        return new ShardingRouteResult(Collections.emptySet());
    }

    public Set<ShardingTable> getTables() {
        return tables;
    }
}
