package org.backjoon.season1.class10.yeji;

import static org.backjoon.season1.class10.yeji.Main1987.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("알파벳 - 예지")
class Main1987Test {


    @Test
    @DisplayName("알파벳 케이스1")
    void test_case_1() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class10/1987/test_case1.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(3, solution);
    }

    @Test
    @DisplayName("알파벳 케이스2")
    void test_case_2() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class10/1987/test_case2.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(6, solution);
    }

    @Test
    @DisplayName("알파벳 케이스3")
    void test_case_3() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class10/1987/test_case3.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(10, solution);
    }
}