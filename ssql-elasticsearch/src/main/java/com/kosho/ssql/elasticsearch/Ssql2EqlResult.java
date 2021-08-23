package com.kosho.ssql.elasticsearch;

import com.kosho.ssql.core.exception.SsqlException;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.script.Script;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.elasticsearch.search.sort.SortBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Ssql编译Eql结果
 *
 * @author Kosho
 * @since 2021-07-16
 */
public class Ssql2EqlResult {
    private boolean trackTotalHits;

    private int from = 0;

    private int size = 10;

    private boolean fetchSource;

    private final List<String> indices = new ArrayList<>();

    private final List<String> includes = new ArrayList<>();

    private final List<String> excludes = new ArrayList<>();

    private final List<SortBuilder> orderBy = new ArrayList<>();

    private final Map<String, Script> scriptFields = new HashMap<>();

    private QueryBuilder condition;

    private SearchRequest searchRequest;

    public SearchRequest toSearchRequest() {
        if (searchRequest != null) {
            return searchRequest;
        }

        if (indices.isEmpty()) {
            throw new SsqlException("Indices can not be empty");
        }

        searchRequest = new SearchRequest();
        searchRequest.indices(indices.toArray(new String[0]));

        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
        searchSourceBuilder.fetchSource(fetchSource);
        searchSourceBuilder.from(from);
        searchSourceBuilder.size(size);
        searchSourceBuilder.trackTotalHits(trackTotalHits);
        searchSourceBuilder.query(condition);

        orderBy.forEach(searchSourceBuilder::sort);
        scriptFields.forEach(searchSourceBuilder::scriptField);

        searchRequest.source(searchSourceBuilder);

        return searchRequest;
    }

    public boolean isTrackTotalHits() {
        return trackTotalHits;
    }

    public void setTrackTotalHits(boolean trackTotalHits) {
        this.trackTotalHits = trackTotalHits;
    }

    public int getFrom() {
        return from;
    }

    public void setFrom(int from) {
        this.from = from;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isFetchSource() {
        return fetchSource;
    }

    public void setFetchSource(boolean fetchSource) {
        this.fetchSource = fetchSource;
    }

    public List<String> getIndices() {
        return indices;
    }

    public List<String> getIncludes() {
        return includes;
    }

    public List<String> getExcludes() {
        return excludes;
    }

    public List<SortBuilder> getOrderBy() {
        return orderBy;
    }

    public QueryBuilder getCondition() {
        return condition;
    }

    public void setCondition(QueryBuilder condition) {
        this.condition = condition;
    }

    public Map<String, Script> getScriptFields() {
        return scriptFields;
    }
}
