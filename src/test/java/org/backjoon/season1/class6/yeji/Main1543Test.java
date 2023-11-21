package org.backjoon.season1.class6.yeji;

import static org.backjoon.season1.class6.yeji.Main1543.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("문서 검색 - 예지")
class Main1543Test {

    @Test
    @DisplayName("문서 검색 케이스1")
    void test_case_1() throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class6/1543/test_case1.txt");
        // when
        long solution = solution(reader);
        // then
        assertEquals(2, solution);
    }

    @Test
    @DisplayName("문서 검색 케이스2")
    void test_case_2() throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class6/1543/test_case2.txt");
        // when
        long solution = solution(reader);
        // then
        assertEquals(2, solution);
    }

    @Test
    @DisplayName("문서 검색 케이스3")
    void test_case_3() throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class6/1543/test_case3.txt");
        // when
        long solution = solution(reader);
        // then
        assertEquals(1, solution);
    }

    @Test
    @DisplayName("문서 검색 케이스4")
    void test_case_4() throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class6/1543/test_case4.txt");
        // when
        long solution = solution(reader);
        // then
        assertEquals(3, solution);
    }
}