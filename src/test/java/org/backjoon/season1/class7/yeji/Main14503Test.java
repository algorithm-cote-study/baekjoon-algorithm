package org.backjoon.season1.class7.yeji;

import static org.backjoon.season1.class7.yeji.Main14503.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("로봇청소기 - 예지")
class Main14503Test {

    @Test
    @DisplayName("로봇청소기 케이스1")
    void test_case_1() throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class7/14503/test_case1.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(1, solution);
    }

    @Test
    @DisplayName("로봇청소기 케이스2")
    void test_case_2() throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class7/14503/test_case2.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(57, solution);
    }
}