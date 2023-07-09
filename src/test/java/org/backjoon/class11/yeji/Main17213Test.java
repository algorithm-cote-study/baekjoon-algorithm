package org.backjoon.class11.yeji;

import static org.backjoon.class11.yeji.Main17213.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("과일 서리 - 예지")
class Main17213Test {


    @Test
    @DisplayName("과일 서리 케이스1")
    void test_case_1() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class11/17213/test_case1.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(36, solution);
    }
}