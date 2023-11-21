package org.backjoon.season1.class16.yeji;

import static org.backjoon.season1.class16.yeji.Main2075.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("N번째 큰 수 - 예지")
class Main2075Test {


    @Test
    @DisplayName("N번째 큰 수 - 케이스1")
    void test_case_1() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class16/2075/test_case1.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(35, solution);
    }
}