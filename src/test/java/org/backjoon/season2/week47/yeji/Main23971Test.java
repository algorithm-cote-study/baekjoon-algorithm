package org.backjoon.season2.week47.yeji;

import static org.backjoon.season2.week47.yeji.Main23971.solution;
import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("ZOAC4 - 예지")
class Main23971Test {

    @Test
    @DisplayName("ZOAC4- 케이스1")
    void test_case_1() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/week47/23971/test_case1.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(6, solution);
    }

}