package org.backjoon.season2.week47.yeji;

import static org.backjoon.season2.week47.yeji.Main5073.solution;
import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("삼각형과 세변 - 예지")
class Main5073Test {

    @Test
    @DisplayName("삼각형과 세변 - 케이스1")
    void test_case_1() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/week47/5073/test_case1.txt");
        // when
        String solution = solution(reader);
        // then
        assertEquals("""
            Equilateral
            Scalene
            Invalid
            Isosceles
            """.trim(), solution);
    }

}