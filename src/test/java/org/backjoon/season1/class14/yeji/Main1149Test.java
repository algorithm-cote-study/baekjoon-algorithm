package org.backjoon.season1.class14.yeji;

import static org.backjoon.season1.class14.yeji.Main1149.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("RGB거리 - 예지")
class Main1149Test {


    @Test
    @DisplayName("RGB거리 - 케이스1")
    void test_case_1() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class14/1149/test_case1.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(96, solution);
    }
}