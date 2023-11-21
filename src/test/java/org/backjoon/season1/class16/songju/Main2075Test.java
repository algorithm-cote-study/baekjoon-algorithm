package org.backjoon.season1.class16.songju;

import org.backjoon.common.TestFileUtil;
import org.backjoon.season1.class16.songju.Main2075;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("N번째 큰 수 - 송주")
class Main2075Test {
    @Test
    @DisplayName("N번째 큰 수 - 케이스1")
    void test_case_1() throws Exception {
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class16/2075/test_case1.txt");
        int solution = Main2075.solution(reader);
        assertEquals(35, solution);
    }
}