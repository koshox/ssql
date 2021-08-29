package com.kosho.ssql.elasticsearch.sharding.condition;

import com.kosho.ssql.core.dsl.semantic.value.FieldValue;
import com.kosho.ssql.core.dsl.semantic.value.IdentifierValue;
import com.kosho.ssql.core.dsl.semantic.value.Value;
import com.kosho.ssql.core.dsl.semantic.where.OperationExpression;

import java.util.Optional;

/**
 * 分片字段提取
 *
 * @author Kosho
 * @since 2021-08-27
 */
public class ShardingColumnExtractor {
    public static Optional<String> extract(OperationExpression expression) {
        Value field = expression.getField();

        switch (field.type()) {
            case FIELD:
                return Optional.of(((FieldValue) field).getValue().getValue());

            case IDENTIFIER:
                return Optional.of(((IdentifierValue) field).getValue());
        }

        return Optional.empty();
    }
}
