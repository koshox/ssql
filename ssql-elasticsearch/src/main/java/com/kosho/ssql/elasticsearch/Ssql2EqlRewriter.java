package com.kosho.ssql.elasticsearch;

import java.util.Collections;
import java.util.List;

/**
 * Ssql翻译Eql改写接口
 *
 * @author Kosho
 * @since 2021-08-22
 */
public interface Ssql2EqlRewriter {
    /**
     * 改写分片字段名
     *
     * @param context   上下文
     * @param fieldName 字段名
     * @return 字段名
     */
    default String rewriteFieldName(Ssql2EqlContext context, String fieldName) {
        return fieldName;
    }

    /**
     * 改写分片表
     *
     * @param context   上下文
     * @param tableName 表名
     * @return 表名
     */
    default List<String> rewriteTableName(Ssql2EqlContext context, String tableName) {
        return Collections.singletonList(tableName);
    }
}
