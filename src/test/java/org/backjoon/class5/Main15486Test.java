package org.backjoon.class5;

import static org.backjoon.class5.Main15486.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("퇴사 2 - 예지")
class Main15486Test {

    @Test
    @DisplayName("퇴사 2 케이스1")
    void test_case_1() throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class5/15486/test_case1.txt");

        // when
        int solution = solution(reader);

        // then
        assertEquals(45, solution);
    }

    @Test
    @DisplayName("퇴사 2 케이스2")
    void test_case_2() throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class5/15486/test_case2.txt");

        // when
        int solution = solution(reader);

        // then
        assertEquals(55, solution);
    }

    @Test
    @DisplayName("퇴사 2 케이스3")
    void test_case_3() throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class5/15486/test_case3.txt");

        // when
        int solution = solution(reader);

        // then
        assertEquals(20, solution);
    }

    @Test
    @DisplayName("퇴사 2 케이스4")
    void test_case_4() throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class5/15486/test_case4.txt");

        // when
        int solution = solution(reader);

        // then
        assertEquals(90, solution);
    }
}