package org.backjoon.season1.class3.yeji;

import static org.backjoon.season1.class3.yeji.Main1927.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("최소힙 - 예지")
class Main1927Test {

    @Test
    @DisplayName("최소힙 케이스1")
    void test_case_1() throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class3/1927/test_case1.txt");
        // when
        String solution = solution(reader);

        // then
        assertEquals("""
            0
            1
            2
            12345678
            0
            """, solution);
    }
}