package com.kosho.ssql.elasticsearch;

import com.kosho.ssql.core.dsl.semantic.value.Value;
import org.apache.commons.lang3.tuple.Pair;

import java.util.HashMap;
import java.util.Map;

/**
 * Ssql编译Eql上下文
 *
 * @author Kosho
 * @since 2021-07-16
 */
public class Ssql2EqlContext {
    private final Ssql2EqlResult ssql2EqlResult = new Ssql2EqlResult();

    private final Map<String, String> selectAliases = new HashMap<>();

    private final Map<String, Pair<String, Value>> selectValues = new HashMap<>();

    private Ssql2EqlParams ssql2EqlParams;

    private String tableName;

    private String tableAlias;

    public Ssql2EqlResult getSsql2EqlResult() {
        return ssql2EqlResult;
    }

    public Map<String, String> getSelectAliases() {
        return selectAliases;
    }

    public Map<String, Pair<String, Value>> getSelectValues() {
        return selectValues;
    }

    public Ssql2EqlParams getSsql2EqlParams() {
        return ssql2EqlParams;
    }

    public void setSsql2EqlParams(Ssql2EqlParams ssql2EqlParams) {
        this.ssql2EqlParams = ssql2EqlParams;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getTableAlias() {
        return tableAlias;
    }

    public void setTableAlias(String tableAlias) {
        this.tableAlias = tableAlias;
    }

    public Ssql2EqlRewriter getRewriter() {
        return ssql2EqlParams.getRewriter();
    }
}
