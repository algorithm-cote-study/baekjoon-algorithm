package org.backjoon.season1.week31.yeji;

import static org.backjoon.season1.week31.yeji.Main17220.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("마약수사대 - 예지")
class Main17220Test {


    @Test
    @DisplayName("마약수사대 - 케이스1")
    void test_case_1() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/week31/17220/test_case1.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(4, solution);
    }

    @Test
    @DisplayName("마약수사대 - 케이스2")
    void test_case_2() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/week31/17220/test_case2.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(2, solution);
    }

    @Test
    @DisplayName("마약수사대 - 케이스3")
    void test_case_3() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/week31/17220/test_case3.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(5, solution);
    }
}