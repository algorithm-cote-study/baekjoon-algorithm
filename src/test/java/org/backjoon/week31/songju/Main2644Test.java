package org.backjoon.week31.songju;

import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("촌수계산 - 송주")
class Main2644Test {
    @Test
    @DisplayName("촌수계산 - 케이스1")
    void test_case_1() throws Exception {
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/week31/2644/test_case1.txt");
        int solution = Main2644.solution(reader);
        assertEquals(3, solution);
    }

    @Test
    @DisplayName("촌수계산 - 케이스2")
    void test_case_2() throws Exception {
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/week31/2644/test_case2.txt");
        int solution = Main2644.solution(reader);
        assertEquals(-1, solution);
    }

}