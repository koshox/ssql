package com.kosho.ssql.elasticsearch.sharding.algorithm;

import com.kosho.ssql.core.spi.Spi;
import com.kosho.ssql.core.spi.SpiLoader;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 分片算法工厂
 *
 * @author Kosho
 * @since 2021-08-27
 */
public class ShardingAlgorithmFactory {
    private static final Map<String, ShardingAlgorithm> ALGORITHM_MAP = new HashMap<>();

    static {
        List<ShardingAlgorithm> algorithms = SpiLoader.of(ShardingAlgorithm.class).loadAll();
        for (ShardingAlgorithm algorithm : algorithms) {
            Spi spi = algorithm.getClass().getAnnotation(Spi.class);
            if (spi == null || StringUtils.isEmpty(spi.value())) {
                ALGORITHM_MAP.put(algorithm.getClass().getName(), algorithm);
                continue;
            }

            ALGORITHM_MAP.put(spi.value(), algorithm);
        }
    }

    public static ShardingAlgorithm getShardingAlgorithm(String algorithmName) {
        ShardingAlgorithm algorithm = ALGORITHM_MAP.get(algorithmName);
        return Validate.notNull(algorithm, "Algorithm cannot be null, name=[" + algorithmName + "]");
    }
}
