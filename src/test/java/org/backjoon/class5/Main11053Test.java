package org.backjoon.class5;

import static org.backjoon.class5.Main11053.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("가장 긴 증가하는 수열 - 예지")
class Main11053Test {

    @Test
    @DisplayName("가장 긴 증가하는 수열 케이스1")
    void test_case_1() throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class5/11053/test_case1.txt");

        // when
        int solution = solution(reader);

        // then
        assertEquals(4, solution);
    }
}