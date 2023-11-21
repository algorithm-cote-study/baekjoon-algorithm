package org.backjoon.season1.class12.yeji;

import static org.backjoon.season1.class12.yeji.Main1806.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("부분합 - 예지")
class Main1806Test {

    @Test
    @DisplayName("부분합 케이스1")
    void test_case_1() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class12/1806/test_case1.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(2, solution);

    }
}