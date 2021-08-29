package com.kosho.ssql.elasticsearch.sharding.algorithm.hash;

/**
 * Hash接口
 *
 * @author Kosho
 * @since 2021-08-29
 */
public interface Hasher {
    /**
     * 计算Hash
     *
     * @param value hash对象
     * @return hash值
     */
    int hash(String value);
}
