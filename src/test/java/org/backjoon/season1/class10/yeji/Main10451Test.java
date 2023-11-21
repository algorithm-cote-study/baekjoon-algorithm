package org.backjoon.season1.class10.yeji;

import static org.backjoon.season1.class10.yeji.Main10451.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("순열 사이클 - 예지")
class Main10451Test {


    @Test
    @DisplayName("순열 사이클 케이스1")
    void test_case_1() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class10/10451/test_case1.txt");
        // when
        String solution = solution(reader);
        // then
        assertEquals("""
            3
            7
            """, solution);
    }
}