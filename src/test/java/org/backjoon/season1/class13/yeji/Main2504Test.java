package org.backjoon.season1.class13.yeji;

import static org.backjoon.season1.class13.yeji.Main2504.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("괄호의 값")
class Main2504Test {


    @Test
    @DisplayName("괄호의 값 케이스1")
    void test_case_1() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class13/2504/test_case1.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(28, solution);
    }


    @Test
    @DisplayName("괄호의 값 케이스2")
    void test_case_2() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class13/2504/test_case2.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(0, solution);
    }
}