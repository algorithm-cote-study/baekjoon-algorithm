package org.backjoon.season1.class9.yeji;

import static org.backjoon.season1.class9.yeji.Main1459.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("걷기 - 예지")
class Main1459Test {


    @Test
    @DisplayName("걷기 케이스1")
    void test_case_1() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class9/1459/test_case1.txt");
        // when
        long solution = solution(reader);
        // then
        assertEquals(18, solution);
    }

    @Test
    @DisplayName("걷기 케이스2")
    void test_case_2() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class9/1459/test_case2.txt");
        // when
        long solution = solution(reader);
        // then
        assertEquals(16, solution);
    }

    @Test
    @DisplayName("걷기 케이스3")
    void test_case_3() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class9/1459/test_case3.txt");
        // when
        long solution = solution(reader);
        // then
        assertEquals(20, solution);
    }

    @Test
    @DisplayName("걷기 케이스4")
    void test_case_4() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class9/1459/test_case4.txt");
        // when
        long solution = solution(reader);
        // then
        assertEquals(247, solution);
    }

    @Test
    @DisplayName("걷기 케이스5")
    void test_case_5() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class9/1459/test_case5.txt");
        // when
        long solution = solution(reader);
        // then
        assertEquals(240, solution);
    }

    @Test
    @DisplayName("걷기 케이스6")
    void test_case_6() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class9/1459/test_case6.txt");
        // when
        long solution = solution(reader);
        // then
        assertEquals(41010000000L, solution);
    }

    @Test
    @DisplayName("걷기 케이스7")
    void test_case_7() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class9/1459/test_case7.txt");
        // when
        long solution = solution(reader);
        // then
        assertEquals(3929, solution);
    }

}