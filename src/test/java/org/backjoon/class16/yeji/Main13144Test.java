package org.backjoon.class16.yeji;

import static org.backjoon.class16.yeji.Main13144.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("List of Unique Numbers - 예지")
class Main13144Test {


    @Test
    @DisplayName("List of Unique Numbers - 케이스1")
    void test_case_1() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class16/13144/test_case1.txt");
        // when
        long solution = solution(reader);
        // then
        assertEquals(15, solution);
    }

    @Test
    @DisplayName("List of Unique Numbers - 케이스2")
    void test_case_2() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class16/13144/test_case2.txt");
        // when
        long solution = solution(reader);
        // then
        assertEquals(12, solution);
    }

    @Test
    @DisplayName("List of Unique Numbers - 케이스3")
    void test_case_3() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class16/13144/test_case3.txt");
        // when
        long solution = solution(reader);
        // then
        assertEquals(5, solution);
    }
}