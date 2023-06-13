package org.backjoon.class8.yeji;

import static org.backjoon.class8.yeji.Main9019.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("DSLR - 예지")
class Main9019Test {

    @Test
    @DisplayName("DSLR 케이스1")
    void test_case_1() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class8/9019/test_case1.txt");
        // when
        String solution = solution(reader);
        // then
        assertEquals("""
            LL
            L
            DDDD
            """, solution);
    }
}