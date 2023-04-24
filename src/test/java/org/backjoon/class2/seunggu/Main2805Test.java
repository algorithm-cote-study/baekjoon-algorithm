package org.backjoon.class2.seunggu;

import static org.backjoon.class2.seunggu.Main2805.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("나무 자르기 - 승구")
class Main2805Test {

    @Test
    @DisplayName("나무 자르기 케이스 1")
    void test_case_1() throws IOException {
        // given
        int solution = getSolution("testcase/class2/2805/test_case1.txt");
        // then
        assertEquals(15, solution);
    }

    private int getSolution(String fileName) throws IOException {
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), fileName);
        // when
        return solution(reader);
    }

    @Test
    @DisplayName("나무 자르기 케이스 2")
    void test_case_2() throws IOException {
        // given
        int solution = getSolution("testcase/class2/2805/test_case2.txt");
        // then
        assertEquals(36, solution);
    }

    @Test
    @DisplayName("나무 자르기 케이스 3")
    void test_case_3() throws IOException {
        // given
        int solution = getSolution("testcase/class2/2805/test_case3.txt");
        // then
        assertEquals(3, solution);
    }
}