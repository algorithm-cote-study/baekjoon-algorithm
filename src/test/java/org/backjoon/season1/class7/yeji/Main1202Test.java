package org.backjoon.season1.class7.yeji;


import static org.backjoon.season1.class7.yeji.Main1202.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("보석 도둑 - 예지")
class Main1202Test {

    @Test
    @DisplayName("보석 도둑 케이스1")
    void test_case_1() throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class7/1202/test_case1.txt");
        // when
        long solution = solution(reader);
        // then
        assertEquals(10, solution);
    }

    @Test
    @DisplayName("보석 도둑 케이스2")
    void test_case_2() throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class7/1202/test_case2.txt");
        // when
        long solution = solution(reader);
        // then
        assertEquals(164, solution);
    }
}