package com.kosho.ssql.elasticsearch;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kosho.ssql.core.exception.SsqlException;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Ssql编译Eql测试
 *
 * @author Kosho
 * @since 2021-08-23
 */
class Ssql2EqlTest {
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    @ParameterizedTest
    @MethodSource("testSelectDsl")
    void testSelectDsl(String ssql, String expectDsl) throws JsonProcessingException {
        assertEquals(expectDsl, compile2Dsl(ssql));
    }

    private static Stream<Arguments> testSelectDsl() {
        return loadTestCases("SelectTestCase");
    }

    @ParameterizedTest
    @MethodSource("testFromDsl")
    void testFromDsl(String ssql, String expectDsl) throws JsonProcessingException {
        assertEquals(expectDsl, compile2Dsl(ssql));
    }

    private static Stream<Arguments> testFromDsl() {
        return loadTestCases("FromTestCase");
    }

    @ParameterizedTest
    @MethodSource("testWhereDsl")
    void testWhereDsl(String ssql, String expectDsl) throws JsonProcessingException {
        assertEquals(expectDsl, compile2Dsl(ssql));
    }

    private static Stream<Arguments> testWhereDsl() {
        return loadTestCases("WhereTestCase");
    }

    @ParameterizedTest
    @MethodSource("testOrderByDsl")
    void testOrderByDsl(String ssql, String expectDsl) throws JsonProcessingException {
        assertEquals(expectDsl, compile2Dsl(ssql));
    }

    private static Stream<Arguments> testOrderByDsl() {
        return loadTestCases("OrderByTestCase");
    }

    @ParameterizedTest
    @MethodSource("testLimitDsl")
    void testLimitDsl(String ssql, String expectDsl) throws JsonProcessingException {
        assertEquals(expectDsl, compile2Dsl(ssql));
    }

    private static Stream<Arguments> testLimitDsl() {
        return loadTestCases("LimitTestCase");
    }

    private String compile2Dsl(String ssql) throws JsonProcessingException {
        Ssql2EqlResult ssql2EqlResult = Ssql2EqlCompiler.compile(ssql);
        return OBJECT_MAPPER.readTree(ssql2EqlResult.toDsl()).toPrettyString();
    }

    private static Stream<Arguments> loadTestCases(String name) {
        List<Arguments> argumentsList = new ArrayList<>();
        try (InputStream inputStream = Ssql2EqlTest.class.getResourceAsStream("/testcase/" + name + ".json")) {
            JsonNode testCases = OBJECT_MAPPER.readTree(inputStream);
            for (JsonNode testCase : testCases) {
                String ssql = testCase.get("ssql").textValue();
                String expectDsl = OBJECT_MAPPER.writerWithDefaultPrettyPrinter().writeValueAsString(testCase.get("expectDsl"));
                Arguments arguments = Arguments.of(ssql, expectDsl);
                argumentsList.add(arguments);
            }

            return argumentsList.stream();
        } catch (IOException e) {
            throw new SsqlException(e);
        }
    }
}