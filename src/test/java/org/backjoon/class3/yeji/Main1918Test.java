package org.backjoon.class3.yeji;

import static org.backjoon.class3.yeji.Main1918.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("후위 표기식 - 예지")
class Main1918Test {

    @Test
    @DisplayName("후위 표기식 케이스1")
    void test_case_1() throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class3/1918/test_case1.txt");
        // when
        String solution = solution(reader);

        // then
        assertEquals("ABC+*", solution);

    }

    @Test
    @DisplayName("후위 표기식 케이스2")
    void test_case_2() throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class3/1918/test_case2.txt");
        // when
        String solution = solution(reader);

        // then
        assertEquals("AB+", solution);

    }

    @Test
    @DisplayName("후위 표기식 케이스3")
    void test_case_3() throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class3/1918/test_case3.txt");
        // when
        String solution = solution(reader);

        // then
        assertEquals("ABC*+", solution);

    }

    @Test
    @DisplayName("후위 표기식 케이스4")
    void test_case_4() throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class3/1918/test_case4.txt");
        // when
        String solution = solution(reader);

        // then
        assertEquals("ABC*+DE/-", solution);

    }
}