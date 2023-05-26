package org.backjoon.class6.yeji;

import static org.backjoon.class6.yeji.Main3109.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("빵집 - 예지")
class Main3109Test {

    @Test
    @DisplayName("빵집 케이스1")
    void test_case_1() throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class6/3109/test_case1.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(2, solution);
    }

    @Test
    @DisplayName("빵집 케이스2")
    void test_case_2() throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class6/3109/test_case2.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(5, solution);
    }

    @Test
    @DisplayName("빵집 케이스3")
    void test_case_3() throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class6/3109/test_case3.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(4, solution);
    }
}