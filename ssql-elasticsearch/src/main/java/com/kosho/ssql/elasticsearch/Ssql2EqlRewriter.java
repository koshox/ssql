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
    default String rewriteFieldName(String fieldName) {
        return fieldName;
    }

    default List<String> rewriteTableName(String tableName) {
        return Collections.singletonList(tableName);
    }
}
