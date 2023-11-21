package org.backjoon.season1.class4.yeji;

import static org.backjoon.season1.class4.yeji.Main1717.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("집합의 표현 - 예지")
class Main1717Test {

    @Test
    @DisplayName("집합의 표현 케이스1")
    void test_case_1() throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class4/1717/test_case1.txt");
        // when
        String solution = solution(reader);
        // then
        assertEquals("""
            NO
            NO
            YES
            """.trim(), solution.trim());
    }
}