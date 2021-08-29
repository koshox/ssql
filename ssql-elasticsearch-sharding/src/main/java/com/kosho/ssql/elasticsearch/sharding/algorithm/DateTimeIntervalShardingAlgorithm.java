package com.kosho.ssql.elasticsearch.sharding.algorithm;

import com.kosho.ssql.core.spi.Spi;
import com.kosho.ssql.elasticsearch.sharding.meta.ShardingTableRule;
import org.apache.commons.lang3.StringUtils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 时间区间分片算法
 *
 * @author Kosho
 * @since 2021-08-29
 */
@Spi("DateTimeInterval")
public class DateTimeIntervalShardingAlgorithm extends AbstractIntervalShardingAlgorithm {
    private static final DateTimeFormatter DEFAULT_INPUT_DATE_FMT = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    private static final DateTimeFormatter DEFAULT_NUMBER_DATE_FMT = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");

    private static final Map<String, DateTimeFormatter> DATE_TIME_FORMATTER_MAP = new ConcurrentHashMap<>();

    private static final String INPUT_DATE_FORMAT_KEY = "date-format";

    @Override
    protected Long determineShardingValueNum(ShardingTableRule shardingTableRule, Comparable<?> shardingValue) {
        DateTimeFormatter inputFormatter = getInputDateFormatter(shardingTableRule);

        String numDateStr;
        try {
            LocalDateTime inputDate = LocalDateTime.parse(shardingValue.toString(), inputFormatter);
            numDateStr = DEFAULT_NUMBER_DATE_FMT.format(inputDate);
        } catch (RuntimeException e) {
            return null;
        }

        return Long.parseLong(numDateStr);
    }

    private DateTimeFormatter getInputDateFormatter(ShardingTableRule shardingTableRule) {
        Properties properties = shardingTableRule.getShardingStrategy().getProperties();
        if (properties == null) {
            return DEFAULT_INPUT_DATE_FMT;
        }

        String dataFormatStr = properties.getProperty(INPUT_DATE_FORMAT_KEY);
        if (StringUtils.isEmpty(dataFormatStr)) {
            return DEFAULT_INPUT_DATE_FMT;
        }

        return DATE_TIME_FORMATTER_MAP.computeIfAbsent(dataFormatStr, DateTimeFormatter::ofPattern);
    }
}
