package org.backjoon.season1.class10.yeji;

import static org.backjoon.season1.class10.yeji.Main2331.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("반복수열 - 예지")
class Main2331Test {


    @Test
    @DisplayName("반복수열 - 케이스1")
    void test_case_1() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class10/2331/test_case1.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(4, solution);
    }
}