package org.backjoon.class12.yeji;

import static org.backjoon.class12.yeji.Main1700.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("멀티탭 스케쥴링 - 예지")
class Main1700Test {


    @Test
    @DisplayName("멀티탭 스케쥴링 - 케이스1")
    void test_case_1() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class12/1700/test_case1.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(2, solution);
    }
}
