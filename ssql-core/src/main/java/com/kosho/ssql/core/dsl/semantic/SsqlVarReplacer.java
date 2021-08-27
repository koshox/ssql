package com.kosho.ssql.core.dsl.semantic;

import com.kosho.ssql.core.exception.SsqlException;
import com.kosho.ssql.core.dsl.semantic.constants.Operator;
import com.kosho.ssql.core.dsl.semantic.value.*;
import com.kosho.ssql.core.dsl.semantic.where.Expression;
import com.kosho.ssql.core.dsl.semantic.where.LogicalExpression;
import com.kosho.ssql.core.dsl.semantic.where.OperationExpression;
import com.kosho.ssql.core.dsl.semantic.where.Where;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Ssql参数化变量替换
 *
 * @author Kosho
 * @since 2021-07-15
 */
public class SsqlVarReplacer {
    private final Map<String, Object> params;

    public SsqlVarReplacer(Map<String, Object> params) {
        this.params = params;
    }

    public void replaceVar(Ssql ssql) {
        Where where = ssql.getWhere();
        if (where == null) {
            return;
        }

        // 暂只支持Where条件的参数化
        Expression expression = where.getExpression();
        replaceVar(expression);
    }

    private void replaceVar(Expression expression) {
        if (expression instanceof LogicalExpression) {
            replaceVar(((LogicalExpression) expression).getLeft());
            replaceVar(((LogicalExpression) expression).getRight());
        } else if (expression instanceof OperationExpression) {
            Value value = ((OperationExpression) expression).getValue();
            if (value instanceof VarValue) {
                value = replaceVar((VarValue) value);
                ((OperationExpression) expression).setValue(value);
            } else if (value instanceof ListValue && ((OperationExpression) expression).getOperator() == Operator.IN) {
                replaceVar((ListValue) value);
            }
        }
    }

    private void replaceVar(ListValue listValue) {
        List<Value> values = listValue.getValues();
        for (int i = 0; i < values.size(); i++) {
            Value value = values.get(i);
            if (value instanceof VarValue) {
                values.set(i, replaceVar((VarValue) value));
            }
        }
    }

    private Value replaceVar(VarValue varValue) {
        Object valueObject = params.get(varValue.getName());
        if (valueObject == null) {
            IdentifierValue nullValue = new IdentifierValue();
            nullValue.setValue("null");
            return nullValue;
        }

        return toValue(valueObject);
    }

    private Value toValue(Object valueObject) {
        if (valueObject instanceof String) {
            return new StringValue((String) valueObject);
        }

        if (valueObject instanceof Long || valueObject instanceof Integer) {
            NumberValue numberValue = new NumberValue();
            long longValue = ((Number) valueObject).longValue();
            String valueStr = Long.toString(longValue);
            numberValue.setNegative(longValue < 0);
            numberValue.setValue(numberValue.isNegative() ? valueStr.substring(1, valueStr.length()) : valueStr);
            return numberValue;
        }

        if (valueObject instanceof Float || valueObject instanceof Double) {
            NumberValue numberValue = new NumberValue();
            double doubleValue = ((Number) valueObject).doubleValue();
            String valueStr = Double.toString(doubleValue);
            numberValue.setNegative(doubleValue < 0);
            numberValue.setValue(valueStr);
            numberValue.setValue(numberValue.isNegative() ? valueStr.substring(1, valueStr.length()) : valueStr);
            return numberValue;
        }

        if (valueObject instanceof Boolean) {
            return new BooleanValue((Boolean) valueObject);
        }

        if (valueObject instanceof List) {
            ListValue listValue = new ListValue();
            List<Value> values = new ArrayList<>();
            ((List<?>) valueObject).stream().map(this::toValue).forEach(values::add);
            listValue.setValues(values);
            return listValue;
        }

        throw new SsqlException("Unsupported var value type: " + valueObject.getClass().getName());
    }
}
