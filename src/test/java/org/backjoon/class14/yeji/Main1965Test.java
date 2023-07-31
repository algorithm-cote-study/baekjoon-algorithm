package org.backjoon.class14.yeji;

import static org.backjoon.class14.yeji.Main1965.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("상자넣기 - 예지")
class Main1965Test {


    @Test
    @DisplayName("상자넣기 - 케이스1")
    void test_case_1() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class14/1965/test_case1.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(5, solution);
    }

    @Test
    @DisplayName("상자넣기 - 케이스2")
    void test_case_2() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class14/1965/test_case2.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(10, solution);
    }
}