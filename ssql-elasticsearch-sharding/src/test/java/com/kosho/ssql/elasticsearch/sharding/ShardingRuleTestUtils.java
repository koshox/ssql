package com.kosho.ssql.elasticsearch.sharding;

import com.kosho.ssql.elasticsearch.sharding.meta.ShardingRuleManager;
import com.kosho.ssql.elasticsearch.sharding.meta.ShardingStrategy;
import com.kosho.ssql.elasticsearch.sharding.meta.ShardingTable;
import com.kosho.ssql.elasticsearch.sharding.meta.ShardingTableRule;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ShardingRuleTestUtils {
    public static void useNumberIntervalRule() {
        ShardingTableRule rule = new ShardingTableRule();
        rule.setLogicalTableName("t_user");

        ShardingStrategy strategy = new ShardingStrategy();
        strategy.setShardingAlgorithm("NumberInterval");
        strategy.setShardingColumn("age");
        rule.setShardingStrategy(strategy);

        List<ShardingTable> shardingTables = new ArrayList<>();
        rule.setShardingTables(shardingTables);

        int interval = 20;
        for (int i = 0; i < 120; i += interval) {
            ShardingTable table = new ShardingTable();
            table.setTableName("t_user_" + (i / interval + 1));
            table.setLowerShardingValue((long) i);
            table.setUpperShardingValue((long) (i + interval));
            shardingTables.add(table);
        }

        ShardingRuleManager.getInstance().addRule(rule);
    }

    public static void useDateIntervalRule() {
        ShardingTableRule rule = new ShardingTableRule();
        rule.setLogicalTableName("t_user");

        ShardingStrategy strategy = new ShardingStrategy();
        strategy.setShardingAlgorithm("DateTimeInterval");
        strategy.setShardingColumn("birth");
        rule.setShardingStrategy(strategy);

        List<ShardingTable> shardingTables = new ArrayList<>();
        rule.setShardingTables(shardingTables);

        LocalDateTime dateTime = LocalDateTime.of(2000, 1, 1, 0, 0, 0);
        DateTimeFormatter numDateTimeFormatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");

        for (int i = 0; i < 6; i++) {
            ShardingTable table = new ShardingTable();
            table.setTableName("t_user_" + (i + 1));
            table.setLowerShardingValue(Long.parseLong(numDateTimeFormatter.format(dateTime)));
            dateTime = dateTime.plusYears(1);
            table.setUpperShardingValue(Long.parseLong(numDateTimeFormatter.format(dateTime)));
            shardingTables.add(table);
        }

        ShardingRuleManager.getInstance().addRule(rule);
    }

    public static void useHashModRule() {
        ShardingTableRule rule = buildModRule();
        ShardingStrategy strategy = new ShardingStrategy();
        strategy.setShardingAlgorithm("HashMod");
        strategy.setShardingColumn("name");
        rule.setShardingStrategy(strategy);

        ShardingRuleManager.getInstance().addRule(rule);
    }

    public static void useModRule() {
        ShardingTableRule rule = buildModRule();
        ShardingStrategy strategy = new ShardingStrategy();
        strategy.setShardingAlgorithm("Mod");
        strategy.setShardingColumn("age");
        rule.setShardingStrategy(strategy);

        ShardingRuleManager.getInstance().addRule(rule);
    }

    private static ShardingTableRule buildModRule() {
        ShardingTableRule rule = new ShardingTableRule();
        rule.setLogicalTableName("t_user");

        List<ShardingTable> shardingTables = new ArrayList<>();
        rule.setShardingTables(shardingTables);

        for (int i = 0; i < 6; i++) {
            ShardingTable table = new ShardingTable();
            table.setTableName("t_user_" + (i + 1));
            shardingTables.add(table);
        }

        return rule;
    }
}
