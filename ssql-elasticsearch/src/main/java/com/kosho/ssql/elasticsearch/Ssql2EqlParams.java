package com.kosho.ssql.elasticsearch;

import java.util.Map;

/**
 * Ssql编译Eql参数
 *
 * @author Kosho
 * @since 2021-08-22
 */
public class Ssql2EqlParams {
    private static final int DEFAULT_QUERY_LIMIT = 50;

    private static final int DEFAULT_MAX_QUERY_LIMIT = Integer.MAX_VALUE;

    private boolean needTotal = false;

    private int defaultLimit = DEFAULT_QUERY_LIMIT;

    private int maxLimit = DEFAULT_MAX_QUERY_LIMIT;

    private Ssql2EqlRewriter rewriter;

    private Map<String, Object> params;

    public boolean isNeedTotal() {
        return needTotal;
    }

    public void setNeedTotal(boolean needTotal) {
        this.needTotal = needTotal;
    }

    public int getDefaultLimit() {
        return defaultLimit;
    }

    public void setDefaultLimit(int defaultLimit) {
        this.defaultLimit = defaultLimit;
    }

    public int getMaxLimit() {
        return maxLimit;
    }

    public void setMaxLimit(int maxLimit) {
        this.maxLimit = maxLimit;
    }

    public Ssql2EqlRewriter getRewriter() {
        return rewriter;
    }

    public void setRewriter(Ssql2EqlRewriter rewriter) {
        this.rewriter = rewriter;
    }

    public Map<String, Object> getParams() {
        return params;
    }

    public void setParams(Map<String, Object> params) {
        this.params = params;
    }
}
