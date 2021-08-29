package com.kosho.ssql.elasticsearch.sharding.algorithm.hash;

/**
 * Hash接口
 *
 * @author Kosho
 * @since 2021-08-29
 */
public interface Hasher {
    int hash(String value);
}
