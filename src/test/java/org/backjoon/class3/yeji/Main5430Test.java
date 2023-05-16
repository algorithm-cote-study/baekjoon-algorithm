package org.backjoon.class3.yeji;

import static org.backjoon.class3.yeji.Main5430.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


@DisplayName("AC - 예지")
class Main5430Test {

    @Test
    @DisplayName("AC 케이스1")
    void test_case_1() throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class3/5430/test_case1.txt");
        // when
        String solution = solution(reader);

        // then
        assertEquals("""
            [2,1]
            error
            [1,2,3,5,8]
            error
            """, solution);
    }
}