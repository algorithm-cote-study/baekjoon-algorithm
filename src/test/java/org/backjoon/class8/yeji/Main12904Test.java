package org.backjoon.class8.yeji;

import static org.backjoon.class8.yeji.Main12904.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("A와B - 예지")
class Main12904Test {


    @Test
    @DisplayName("A와B 케이스1")
    void test_case_1() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class8/12904/test_case1.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(1, solution);
    }

    @Test
    @DisplayName("A와B 케이스2")
    void test_case_2() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class8/12904/test_case2.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(0, solution);
    }
}