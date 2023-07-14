package org.backjoon.class12.yeji;

import static org.backjoon.class12.yeji.Main2468.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("안전영역 - 예지")
class Main2468Test {


    @Test
    @DisplayName("안전영역 - 케이스1")
    void test_case_1() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class12/2468/test_case1.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(5, solution);
    }

    @Test
    @DisplayName("안전영역 - 케이스2")
    void test_case_2() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class12/2468/test_case2.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(6, solution);
    }

}