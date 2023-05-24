package org.backjoon.class5.yeji;

import static org.backjoon.class5.yeji.Main2839.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("설탕 배달 - 예지")
class Main2839Test {

    @Test
    @DisplayName("설탕 배달 케이스1")
    void test_case_1() throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class5/2839/test_case1.txt");

        // when
        int solution = solution(reader);

        // then
        assertEquals(4, solution);
    }

    @Test
    @DisplayName("설탕 배달 케이스2")
    void test_case_2() throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class5/2839/test_case2.txt");

        // when
        int solution = solution(reader);

        // then
        assertEquals(-1, solution);
    }

    @Test
    @DisplayName("설탕 배달 케이스3")
    void test_case_3() throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class5/2839/test_case3.txt");

        // when
        int solution = solution(reader);

        // then
        assertEquals(2, solution);
    }

    @Test
    @DisplayName("설탕 배달 케이스4")
    void test_case_4() throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class5/2839/test_case4.txt");

        // when
        int solution = solution(reader);

        // then
        assertEquals(3, solution);
    }

}