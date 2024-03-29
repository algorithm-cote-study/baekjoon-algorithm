package org.backjoon.season1.class5.yeji;

import static org.backjoon.season1.class5.yeji.Main16928.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("뱀과 사다리 게임 - 예지")
class Main16928Test {

    @Test
    @DisplayName("뱀과 사다리 게임 케이스1")
    void test_case_1() throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class5/16928/test_case1.txt");

        // when
        int solution = solution(reader);

        // then
        assertEquals(3, solution);

    }


    @Test
    @DisplayName("뱀과 사다리 게임 케이스2")
    void test_case_2() throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class5/16928/test_case2.txt");

        // when
        int solution = solution(reader);

        // then
        assertEquals(5, solution);

    }
}