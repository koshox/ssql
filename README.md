# Simple SQL Framework (通用SQL框架)

SSQL是类SQL语法的一个数据查询、操作框架，主要目标是屏蔽不同数据源的差异，能够使用同一套SQL语法操作不同的数据源，
比如MySQL，Elasticsearch，ClickHouse，以及更近一步的分库分表等等。后续会增加更多功能和数据源实现。

![SSQL AST](http://media.kosho.tech/blog/ssql/ssql-ast.png)

## ssql-core
核心模块，主要包括：
1. SQL解析，将SQL解析为AST
2. SPI扩展，加载不同名称、优先级的自定义SPI

```java
// SQL表达式编译为SSQL语法树
Ssql ssql = Ssql.compile("select * from t_user order by name");

// SQL表达式参数化编译
Map<String, Object> params = new HashMap<>();
params.put("name", "kosho");
params.put("age", 25);
Ssql ssql = Ssql.compile("select * from t_user where name = $name and age = $age");

// 加载优先级最高的Hasher SPI实现
Hasher hasher = SpiLoader.of(Hasher.class).loadHighestPriority();
```

## ssql-elasticsearch
SQL转换ElasticSearch DSL模块

```java
// SQL编译为Elasticsearch查询DSL
Ssql2EqlResult ssql2EqlResult = Ssql2EqlCompiler.compile("select * from t_user where name = 'kosho' and age > 25 limit 100");

// 编译结果
ES索引: "t_user"

ES查询DSL:
{
  "from": 0,
  "size": 100,
  "query": {
    "bool": {
      "must": [{
          "term": {
            "name": {
              "value": "kosho"
            }
          }
        },
        {
          "range": {
            "age": {
              "from": 25,
              "include_lower": false,
              "include_upper": true
            }
          }
        }
      ],
      "adjust_pure_negative": true
    }
  }
}
```

支持通过SPI或者参数的方式自定义Rewriter，可以改写编译结果的字段名，索引等。 

## ssql-elasticsearch-sharding
SQL ElasticSearch分片模块，在ssql-elasticsearch基础上，支持elasticsearch的分索引，类似于ShardingSphere RDB的分库分表
```java
// SQL编译为Elasticsearch查询DSL
Ssql2EqlResult ssql2EqlResult = Ssql2EqlCompiler.compile("select * from t_user where age < 25 or age = 65");
System.out.println(ssql2EqlResult.getIndices());

// 构建数字间隔分片规则, 按照[0,20) -> t_user_1, [20,40) -> t_user_2 ...分为6个索引
void useNumberIntervalRule() {
    // 构建分片规则
    ShardingTableRule rule = new ShardingTableRule();
    rule.setLogicalTableName("t_user");

    // 使用NumberInterval分片策略, age作为分片字段
    ShardingStrategy strategy = new ShardingStrategy();
    strategy.setShardingAlgorithm("NumberInterval");
    strategy.setShardingColumn("age");
    rule.setShardingStrategy(strategy);

    // 构造分片表
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

    // 添加分片规则
    ShardingRuleManager.getInstance().addRule(rule);
}

// 编译结果
ES索引: ["t_user_1", "t_user_2", "t_user_4"]
```

支持通过SPI的方式扩展自定义分片算法 <br>
当前已支持：
1. NumberInterval   数字间隔分片
2. DateTimeInterval 时间日期间隔分片
3. HashMod          Hash取模分片
4. Mod              数字取模分片

扩展示例：
```java
@Spi("Custom")
public class HashModShardingAlgorithm implements ShardingAlgorithm {
    @Override
    public Optional<ShardingTable> doPreciseSharding(ShardingTableRule rule, Comparable<?> shardingValue) {
        ...
    }

    @Override
    public List<ShardingTable> doRangeSharding(ShardingTableRule rule, Range<Comparable<?>> shardingRange) {
        ...
    }
}
```
