package org.backjoon.season1.class15.songju;

import org.backjoon.common.TestFileUtil;
import org.backjoon.season1.class15.songju.Main2003;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("수들의 합 2 - 송주")
class Main2003Test {
    @Test
    @DisplayName("수들의 합 2 - 케이스1")
    void test_case_1() throws Exception {
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class15/2003/test_case1.txt");
        int solution = Main2003.solution(reader);
        assertEquals(3, solution);
    }

    @Test
    @DisplayName("수들의 합 2 - 케이스2")
    void test_case_2() throws Exception {
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class15/2003/test_case2.txt");
        int solution = Main2003.solution(reader);
        assertEquals(3, solution);
    }

}