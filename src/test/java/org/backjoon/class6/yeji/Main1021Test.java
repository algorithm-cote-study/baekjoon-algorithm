package org.backjoon.class6.yeji;

import static org.backjoon.class6.yeji.Main1021.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("회전하는 큐 - 예지")
class Main1021Test {

    @Test
    @DisplayName("회전하는 큐 케이스1")
    void test_case_1() throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class6/1021/test_case1.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(0, solution);
    }

    @Test
    @DisplayName("회전하는 큐 케이스2")
    void test_case_2() throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class6/1021/test_case2.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(8, solution);
    }

    @Test
    @DisplayName("회전하는 큐 케이스3")
    void test_case_3() throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class6/1021/test_case3.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(59, solution);
    }

    @Test
    @DisplayName("회전하는 큐 케이스4")
    void test_case_4() throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class6/1021/test_case4.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(14, solution);
    }


}