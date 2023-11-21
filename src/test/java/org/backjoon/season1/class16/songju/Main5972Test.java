package org.backjoon.season1.class16.songju;

import org.backjoon.common.TestFileUtil;
import org.backjoon.season1.class16.songju.Main5972;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("택배 배송 - 송주")
class Main5972Test {
    @Test
    @DisplayName("택배 배송 - 케이스1")
    void test_case_1() throws Exception {
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class16/5972/test_case1.txt");
        int solution = Main5972.solution(reader);
        assertEquals(5, solution);
    }
}