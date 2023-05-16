package org.backjoon.class5;


import static org.backjoon.class5.Main1463.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("1로 만들기 - 예지")
class Main1463Test {

    @Test
    @DisplayName("1로 만들기 케이스1")
    void test_case_1() throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class4/1463/test_case1.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(1, solution);
    }
}