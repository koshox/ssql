package com.kosho.ssql.elasticsearch.sharding;

import com.kosho.ssql.core.spi.Spi;
import com.kosho.ssql.elasticsearch.sharding.algorithm.hash.Hasher;
import org.apache.commons.lang3.StringUtils;

/**
 * @author Kosho
 * @since 2021-08-29
 */
@Spi(value = "Mock", order = Spi.ORDER_HIGHEST)
public class MockHasher implements Hasher {
    @Override
    public int hash(String value) {
        if (value.startsWith("Kosho")) {
            return Integer.parseInt(StringUtils.removeStart(value, "Kosho"));
        }

        return 0;
    }
}
