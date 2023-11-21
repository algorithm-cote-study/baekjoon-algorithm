package org.backjoon.season1.class15.songju;

import org.backjoon.common.TestFileUtil;
import org.backjoon.season1.class15.songju.Main2096;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("내려가기 - 송주")
class Main2096Test {
    @Test
    @DisplayName("내려가기 - 케이스1")
    void test_case_1() throws Exception {
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class15/2096/test_case1.txt");
        String solution = Main2096.solution(reader);
        assertEquals("18 6", solution);
    }

    @Test
    @DisplayName("내려가기 - 케이스2")
    void test_case_2() throws Exception {
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class15/2096/test_case2.txt");
        String solution = Main2096.solution(reader);
        assertEquals("0 0", solution);
    }

}