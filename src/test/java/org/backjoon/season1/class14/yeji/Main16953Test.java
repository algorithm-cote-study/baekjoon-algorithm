package org.backjoon.season1.class14.yeji;

import static org.backjoon.season1.class14.yeji.Main16953.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("A->B : 예지")
class Main16953Test {


    @Test
    @DisplayName("A->B 케이스1")
    void test_case_1() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class14/16953/test_case1.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(5, solution);
    }

    @Test
    @DisplayName("A->B 케이스2")
    void test_case_2() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class14/16953/test_case2.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(-1, solution);
    }

    @Test
    @DisplayName("A->B 케이스3")
    void test_case_3() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class14/16953/test_case3.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(5, solution);
    }
}   