package com.kosho.ssql.elasticsearch;

import com.kosho.ssql.core.exception.SsqlException;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.common.bytes.BytesReference;
import org.elasticsearch.common.xcontent.ToXContent;
import org.elasticsearch.common.xcontent.XContentBuilder;
import org.elasticsearch.common.xcontent.XContentType;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.script.Script;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.elasticsearch.search.fetch.subphase.FetchSourceContext;
import org.elasticsearch.search.sort.SortBuilder;

import java.io.IOException;
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

    private final List<SortBuilder<?>> orderBy = new ArrayList<>();

    private final Map<String, Script> scriptFields = new HashMap<>();

    private QueryBuilder condition;

    private SearchSourceBuilder searchSourceBuilder;

    /**
     * 转换为SearchRequest对象
     *
     * @return SearchRequest
     */
    public SearchRequest toSearchRequest() {
        if (indices.isEmpty()) {
            throw new SsqlException("Indices can not be empty");
        }

        SearchRequest searchRequest = new SearchRequest();
        searchRequest.indices(indices.toArray(new String[0]));
        searchRequest.source(toSearchRequestBuilder());
        return searchRequest;
    }

    /**
     * 转换为ES Query DSL
     *
     * @return DSL
     */
    public String toDsl() {
        return toSearchRequestBuilder().toString();
    }

    /**
     * 转换为格式化ES Query DSL
     *
     * @return 格式化DSL
     */
    public String toPrettyDsl() {
        SearchSourceBuilder toXContent = toSearchRequestBuilder();
        try (XContentBuilder builder = XContentBuilder.builder(XContentType.JSON.xContent())) {
            builder.humanReadable(true).prettyPrint();
            toXContent.toXContent(builder, ToXContent.EMPTY_PARAMS);
            return BytesReference.bytes(builder).utf8ToString();
        } catch (IOException e) {
            throw new SsqlException(e);
        }
    }

    private SearchSourceBuilder toSearchRequestBuilder() {
        if (searchSourceBuilder != null) {
            return searchSourceBuilder;
        }

        searchSourceBuilder = new SearchSourceBuilder();
        searchSourceBuilder.from(from);
        searchSourceBuilder.size(size);
        searchSourceBuilder.trackTotalHits(trackTotalHits);
        searchSourceBuilder.query(condition);
        searchSourceBuilder.fetchSource(new FetchSourceContext(fetchSource, includes.toArray(new String[0]), excludes.toArray(new String[0])));

        orderBy.forEach(searchSourceBuilder::sort);
        scriptFields.forEach(searchSourceBuilder::scriptField);
        return searchSourceBuilder;
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

    public List<SortBuilder<?>> getOrderBy() {
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
