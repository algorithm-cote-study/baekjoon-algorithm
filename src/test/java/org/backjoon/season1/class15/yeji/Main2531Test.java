package org.backjoon.season1.class15.yeji;

import static org.backjoon.season1.class15.yeji.Main2531.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("회전초밥 - 예지")
class Main2531Test {


    @Test
    @DisplayName("회전초밥 - 케이스1")
    void test_case_1() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class15/2531/test_case1.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(5, solution);
    }

    @Test
    @DisplayName("회전초밥 - 케이스2")
    void test_case_2() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class15/2531/test_case2.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(4, solution);
    }
    
}