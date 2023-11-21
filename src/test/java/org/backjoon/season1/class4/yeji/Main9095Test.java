package org.backjoon.season1.class4.yeji;

import static org.backjoon.season1.class4.yeji.Main9095.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("1,2,3 더하기 - 예지")
class Main9095Test {

    @Test
    @DisplayName("1,2,3 더하기 케이스1")
    void test_case_1() throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class4/9095/test_case1.txt");
        // when
        String solution = solution(reader);
        // then
        assertEquals("""
            7
            44
            274
            """.trim(), solution.trim());
    }
}