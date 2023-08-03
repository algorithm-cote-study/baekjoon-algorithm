package org.backjoon.class15.songju;

import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("회전초밥 - 송주")
class Main2531Test {
    @Test
    @DisplayName("회전초밥 - 케이스1")
    void test_case_1() throws Exception {
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class15/2531/test_case1.txt");
        int solution = Main2531.solution(reader);
        assertEquals(5, solution);
    }

    @Test
    @DisplayName("회전초밥 - 케이스2")
    void test_case_2() throws Exception {
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class15/2531/test_case2.txt");
        int solution = Main2531.solution(reader);
        assertEquals(4, solution);
    }

}