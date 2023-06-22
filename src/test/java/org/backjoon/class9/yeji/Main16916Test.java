package org.backjoon.class9.yeji;

import static org.backjoon.class9.yeji.Main16916.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("부분 문자열 - 예지")
class Main16916Test {


    @Test
    @DisplayName("부분 문자열 케이스1")
    void test_case_1() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class9/16916/test_case1.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(1, solution);
    }


    @Test
    @DisplayName("부분 문자열 케이스2")
    void test_case_2() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class9/16916/test_case2.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(0, solution);
    }

    @Test
    @DisplayName("부분 문자열 케이스3")
    void test_case_3() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class9/16916/test_case3.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(1, solution);
    }

}