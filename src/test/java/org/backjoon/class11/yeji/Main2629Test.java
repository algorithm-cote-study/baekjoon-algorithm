package org.backjoon.class11.yeji;

import static org.backjoon.class11.yeji.Main2629.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("양팔저울 - 예지")
class Main2629Test {


    @Test
    @DisplayName("양팔저울 케이스1")
    void test_case_1() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class11/2629/test_case1.txt");
        // when
        String solution = solution(reader);
        // then
        assertEquals("Y N", solution);
    }

    @Test
    @DisplayName("양팔저울 케이스2")
    void test_case_2() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class11/2629/test_case2.txt");
        // when
        String solution = solution(reader);
        // then
        assertEquals("Y Y N", solution);
    }
}