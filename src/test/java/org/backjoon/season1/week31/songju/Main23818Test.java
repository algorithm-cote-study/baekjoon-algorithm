package org.backjoon.season1.week31.songju;

import org.backjoon.common.TestFileUtil;
import org.backjoon.season1.week31.songju.Main23818;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("원수의 원수 - 송주")
class Main23818Test {
    @Test
    @DisplayName("원수의 원수 - 케이스1")
    void test_case_1() throws Exception {
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/week31/23818/test_case1.txt");
        String solution = Main23818.solution(reader);
        assertEquals("Friend\n" +
                "Enemy\n" +
                "Friend\n" +
                "Friend\n", solution);
    }

    @Test
    @DisplayName("원수의 원수 - 케이스2")
    void test_case_2() throws Exception {
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/week31/23818/test_case2.txt");
        String solution = Main23818.solution(reader);
        assertEquals("Unknown\n" +
                "Error\n" +
                "Error\n", solution);
    }

}