package org.backjoon.class5;

import static org.backjoon.class5.Main2748.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("피보나치 수2 - 예지")
class Main2748Test {

    @Test
    @DisplayName("피보나치 수2 케이스1")
    void test_case_1() throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class5/2748/test_case1.txt");

        // when
        long solution = solution(reader);

        // then
        assertEquals(55L, solution);
    }
}