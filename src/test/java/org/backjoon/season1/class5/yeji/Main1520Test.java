package org.backjoon.season1.class5.yeji;

import static org.backjoon.season1.class5.yeji.Main1520.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("내리막길 - 예지")
class Main1520Test {

    @Test
    @DisplayName("내리막길 케이스1")
    void test_case_1() throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class5/1520/test_case1.txt");

        // when
        long solution = solution(reader);

        // then
        assertEquals(3, solution);
    }

}