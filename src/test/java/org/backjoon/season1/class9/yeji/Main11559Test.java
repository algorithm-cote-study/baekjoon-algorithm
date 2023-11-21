package org.backjoon.season1.class9.yeji;

import static org.backjoon.season1.class9.yeji.Main11559.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Puyo Puyo - 예지")
class Main11559Test {


    @Test
    @DisplayName("Puyo Puyo - 케이스1")
    void test_case_1() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class9/11559/test_case1.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(3, solution);
    }
}