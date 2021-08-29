package com.kosho.ssql.elasticsearch.sharding.algorithm.hash;

import com.kosho.ssql.core.spi.Spi;

import java.nio.charset.StandardCharsets;

/**
 * FNV-1a 32 hash
 *
 * @author Kosho
 * @since 2021-08-29
 */
@Spi("Fnv1a")
public class Fnv1aHasher implements Hasher {
    private static final int FNV1_32_INIT = 0x811c9dc5;

    private static final int FNV1_32_PRIME = 16777619;

    @Override
    public int hash(String value) {
        byte[] bytes = value.getBytes(StandardCharsets.UTF_8);

        int hash = FNV1_32_INIT;
        for (byte b : bytes) {
            hash ^= (b & 0xff);
            hash *= FNV1_32_PRIME;
        }

        return hash;
    }
}
