package com.kosho.ssql.elasticsearch.sharding;

import com.kosho.ssql.elasticsearch.Ssql2EqlCompiler;
import com.kosho.ssql.elasticsearch.Ssql2EqlResult;
import com.kosho.ssql.elasticsearch.sharding.meta.ShardingRuleManager;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

class Ssql2EqlShardingRouterTest {
    @AfterEach
    void tearDown() {
        ShardingRuleManager.getInstance().clean();
    }

    @Test
    void testRouteByNumberInterval() {
        ShardingRuleTestUtils.useNumberIntervalRule();

        assertRoute("select * from t_user where age = 25", "t_user_2");

        assertRoute("select * from t_user where age = 25 or age = 40", "t_user_2", "t_user_3");

        assertRoute("select * from t_user where age < 15 or age > 80", "t_user_1", "t_user_5","t_user_6");

        assertRoute("select * from t_user where age < 25 or age = 40", "t_user_1", "t_user_2", "t_user_3");

        assertRoute("select * from t_user where age < 25 and age = 5", "t_user_1");

        assertRoute("select * from t_user where age in (10, 40, 65)", "t_user_1", "t_user_3", "t_user_4");

        assertRoute("select * from t_user", allShardingTable());

        assertRoute("select * from t_user where name = 'Kosho'", allShardingTable());

        assertRoute("select * from t_user where age = 25 or name = 'Kosho'", allShardingTable());

        assertRoute("select * from t_user where age = 25 and name = 'Kosho'", "t_user_2");

        assertRoute("select * from t_user where age = 25 and age > 45", Collections.emptyList());
    }

    @Test
    void testRouteByDateInterval() {
        ShardingRuleTestUtils.useDateIntervalRule();

        assertRoute("select * from t_user where birth = '2001-03-20 00:00:00'", "t_user_2");

        assertRoute("select * from t_user where birth = '2001-03-20 09:00:00' or birth = '2003-03-20 10:00:00'", "t_user_2", "t_user_4");

        assertRoute("select * from t_user where birth < '2003-03-20 00:00:00'", "t_user_1", "t_user_2", "t_user_3", "t_user_4");

        assertRoute("select * from t_user where birth < '2001-03-20 00:00:00' or birth > '2005-03-20 00:00:00'", "t_user_1", "t_user_2", "t_user_6");

        assertRoute("select * from t_user where birth < '2003-03-20 00:00:00' or name = 'Kosho'", allShardingTable());

        assertRoute("select * from t_user where birth < '2003-03-20 00:00:00' and birth > '2005-03-20 00:00:00'", Collections.emptyList());
    }

    @Test
    void testRouteByMod() {
        ShardingRuleTestUtils.useModRule();

        assertRoute("select * from t_user where age = 3", "t_user_4");

        assertRoute("select * from t_user where age = 3 or age = 65", "t_user_4", "t_user_6");

        assertRoute("select * from t_user where age in (3, 10, 16)", "t_user_4", "t_user_5");

        assertRoute("select * from t_user where age > 25", allShardingTable());

        assertRoute("select * from t_user where age < 25 and age = 45", Collections.emptyList());
    }

    @Test
    void testRouteByHashMod() {
        ShardingRuleTestUtils.useHashModRule();

        assertRoute("select * from t_user where name = 'Kosho1'", "t_user_2");

        assertRoute("select * from t_user where name = 'Kosho1' or name = 'Kosho3'", "t_user_2", "t_user_4");

        assertRoute("select * from t_user where name in ('Kosho1', 'Kosho5')", "t_user_2", "t_user_6");

        assertRoute("select * from t_user where name != 'Kosho'", allShardingTable());

        assertRoute("select * from t_user where name = 'Kosho1' and name = 'Kosho3'", Collections.emptyList());
    }

    private List<String> allShardingTable() {
        return Arrays.asList("t_user_1", "t_user_2", "t_user_3", "t_user_4", "t_user_5", "t_user_6");
    }

    private void assertRoute(String ssqlStr, String... expectShardingTables) {
        assertRoute(ssqlStr, Arrays.asList(expectShardingTables));
    }

    private void assertRoute(String ssqlStr, List<String> expectShardingTables) {
        Ssql2EqlResult ssql2EqlResult = Ssql2EqlCompiler.compile(ssqlStr);
        Assert.assertEquals(new HashSet<>(expectShardingTables), new HashSet<>(ssql2EqlResult.getIndices()));
    }
}