package org.backjoon.week31.yeji;

import static org.backjoon.week31.yeji.Main23818.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("원수의 원수 - 예지")
class Main23818Test {


    @Test
    @DisplayName("원수의 원수 - 케이스1")
    void test_case_1() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/week31/23818/test_case1.txt");
        // when
        String solution = solution(reader);
        // then
        assertEquals("""
            Friend
            Enemy
            Friend
            Friend
            """, solution);
    }

    @Test
    @DisplayName("원수의 원수 - 케이스2")
    void test_case_2() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/week31/23818/test_case2.txt");
        // when
        String solution = solution(reader);
        // then
        assertEquals("""
            Unknown
            Error
            Error
            """, solution);
    }
}