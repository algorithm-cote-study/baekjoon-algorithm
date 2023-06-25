package org.backjoon.class10.yeji;

import static org.backjoon.class10.yeji.Main1994.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("등차수열 - 예지")
class Main1994Test {


    @Test
    @DisplayName("등차수열 케이스1")
    void test_case_1() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/section9/main1/test_case1.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(4, solution);
    }
}