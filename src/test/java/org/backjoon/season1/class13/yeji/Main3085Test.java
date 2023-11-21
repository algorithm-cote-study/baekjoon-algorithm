package org.backjoon.season1.class13.yeji;

import static org.backjoon.season1.class13.yeji.Main3085.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("사탕게임 - 예지")
class Main3085Test {
    
    @Test
    @DisplayName("사탕게임 - 케이스1")
    void test_case_1() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class13/3085/test_case1.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(3, solution);
    }

    @Test
    @DisplayName("사탕게임 - 케이스2")
    void test_case_2() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class13/3085/test_case2.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(4, solution);
    }

    @Test
    @DisplayName("사탕게임 - 케이스3")
    void test_case_3() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class13/3085/test_case3.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(4, solution);
    }
}