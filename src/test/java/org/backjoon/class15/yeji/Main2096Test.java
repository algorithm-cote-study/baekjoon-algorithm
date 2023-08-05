package org.backjoon.class15.yeji;

import static org.backjoon.class15.yeji.Main2096.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("내려가기 - 예지")
class Main2096Test {


    @Test
    @DisplayName("내려가기 - 케이스1")
    void test_case_1() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class15/2096/test_case1.txt");
        // when
        String solution = solution(reader);
        // then
        assertEquals("18 6", solution);
    }

    @Test
    @DisplayName("내려가기 - 케이스2")
    void test_case_2() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class15/2096/test_case2.txt");
        // when
        String solution = solution(reader);
        // then
        assertEquals("0 0", solution);
    }
}