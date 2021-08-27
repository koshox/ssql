package com.kosho.ssql.core.dsl.semantic;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Ssql解析器测试
 *
 * @author Kosho
 * @since 2021-07-15
 */
class SsqlParserTest {
    @ParameterizedTest
    @MethodSource("parserTestParamGen")
    void testSsqlCompile(String input, String expect) {
        Ssql ssql = Ssql.compile(input);
        assertEquals(expect, ssql.toString());
    }

    private static Stream<Arguments> parserTestParamGen() {
        List<Arguments> arguments = new ArrayList<>();

        // select
        arguments.add(Arguments.of("select * from t_user", "select * from t_user"));
        arguments.add(Arguments.of("select name from t_user", "select name from t_user"));
        arguments.add(Arguments.of("select name, age from t_user", "select name, age from t_user"));
        arguments.add(Arguments.of("select name n from t_user", "select name as n from t_user"));

        // from
        arguments.add(Arguments.of("select * from t_user t", "select * from t_user t"));
        arguments.add(Arguments.of("select * from t_user1, t_user2", "select * from t_user1, t_user2"));

        // where
        arguments.add(Arguments.of("select * from t_user where name = 'foo'", "select * from t_user where name = 'foo'"));
        arguments.add(Arguments.of("select * from t_user where name = 'foo' or age > 20", "select * from t_user where name = 'foo' or age > 20"));
        arguments.add(Arguments.of("select * from t_user where age in (12, 13, 14)", "select * from t_user where age in (12, 13, 14)"));
        arguments.add(Arguments.of("select * from t_user where name = $name and age = $age", "select * from t_user where name = $name and age = $age"));
        arguments.add(Arguments.of("select * from t_user where name = $name and age in $age", "select * from t_user where name = $name and age in $age"));
        arguments.add(Arguments.of("select * from t_user where name = $name and age in ($age1, $age2)", "select * from t_user where name = $name and age in ($age1, $age2)"));

        // group by
        arguments.add(Arguments.of("select name from t_user group by name", "select name from t_user group by name"));

        // order by
        arguments.add(Arguments.of("select * from t_user order by name desc nulls first", "select * from t_user order by name desc nulls first"));

        // limit
        arguments.add(Arguments.of("select * from t_user limit 10", "select * from t_user limit 10"));
        arguments.add(Arguments.of("select * from t_user limit 1, 10", "select * from t_user limit 1, 10"));

        return arguments.stream();
    }
}