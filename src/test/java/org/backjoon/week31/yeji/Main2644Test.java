package org.backjoon.week31.yeji;

import static org.backjoon.week31.yeji.Main2644.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("촌수계산 - 예지")
class Main2644Test {


    @Test
    @DisplayName("촌수계산 - 케이스1")
    void test_case_1() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/week31/2644/test_case1.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(3, solution);
    }

    @Test
    @DisplayName("촌수계산 - 케이스2")
    void test_case_2() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/week31/2644/test_case2.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(-1, solution);
    }

    @Test
    @DisplayName("촌수계산 - 케이스3")
    void test_case_3() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/week31/2644/test_case3.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(1, solution);
    }

    @Test
    @DisplayName("촌수계산 - 케이스4")
    void test_case_4() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/week31/2644/test_case4.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(2, solution);
    }
}