package com.kosho.ssql.elasticsearch.sharding.meta;

import com.google.common.base.Suppliers;
import com.kosho.ssql.core.dsl.semantic.Ssql;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Supplier;

/**
 * 分片规则管理器
 *
 * @author Kosho
 * @since 2021-08-27
 */
public class ShardingRuleManager {
    private static final Supplier<ShardingRuleManager> INSTANCE = Suppliers.memoize(ShardingRuleManager::new);

    private final Map<String, ShardingTableRule> shardingTableRules = new ConcurrentHashMap<>();

    private ShardingRuleManager() {
    }

    public static ShardingRuleManager getInstance() {
        return INSTANCE.get();
    }

    public void addRule(ShardingTableRule rule) {
        shardingTableRules.put(rule.getLogicalTableName(), rule);
    }

    public ShardingTableRule getRule(String logicTableName) {
        return shardingTableRules.get(logicTableName);
    }

    public ShardingTableRule getRule(Ssql ssql) {
        String logicalTableName = ssql.getFrom().getTables().get(0).getName();
        return shardingTableRules.get(logicalTableName);
    }
}
