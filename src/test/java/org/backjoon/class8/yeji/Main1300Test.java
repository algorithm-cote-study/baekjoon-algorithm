package org.backjoon.class8.yeji;

import static org.backjoon.class8.yeji.Main1300.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("K번째 수 - 예지")
class Main1300Test {


    @Test
    @DisplayName("K번째 수 케이스1")
    void test_case_1() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class8/1300/test_case1.txt");
        // when
        long solution = solution(reader);
        // then
        assertEquals(6, solution);
    }

    @Test
    @DisplayName("K번째 수 케이스2")
    void test_case_2() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class8/1300/test_case2.txt");
        // when
        long solution = solution(reader);
        // then
        assertEquals(1, solution);
    }
}