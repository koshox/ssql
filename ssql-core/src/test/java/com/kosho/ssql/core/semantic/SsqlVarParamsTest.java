package com.kosho.ssql.core.semantic;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.*;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * 参数化变量替换测试
 *
 * @author Kosho
 * @since 2021-07-15
 */
public class SsqlVarParamsTest {
    private static Map<String, Object> params = new HashMap<>();

    @BeforeAll
    static void setUp() {
        params.put("name", "kosho");
        params.put("age", 18);
        params.put("age1", 19);
        params.put("age2", 20);
        params.put("ageArr", Arrays.asList(18, 19, 20));
    }

    @ParameterizedTest
    @MethodSource("varReplaceTestParamGen")
    void testSsqlCompile(String input, String expect) {
        Ssql ssql = Ssql.compile(input, params);
        assertEquals(expect, ssql.toString());
    }

    private static Stream<Arguments> varReplaceTestParamGen() {
        List<Arguments> arguments = new ArrayList<>();

        arguments.add(Arguments.of("select * from t_user where name = $name", "select * from t_user where name = 'kosho'"));
        arguments.add(Arguments.of("select * from t_user where age > $age", "select * from t_user where age > 18"));
        arguments.add(Arguments.of("select * from t_user where name = $name and age = $age", "select * from t_user where name = 'kosho' and age = 18"));

        arguments.add(Arguments.of("select * from t_user where age in $ageArr", "select * from t_user where age in (18, 19, 20)"));
        arguments.add(Arguments.of("select * from t_user where age in ($age1, $age2)", "select * from t_user where age in (19, 20)"));

        arguments.add(Arguments.of("select * from t_user where name = $foo", "select * from t_user where name = null"));
        return arguments.stream();
    }
}
