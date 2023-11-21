package org.backjoon.season1.class15.yeji;

import static org.backjoon.season1.class15.yeji.Main2003.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("수들의 합 - 예지")
class Main2003Test {


    @Test
    @DisplayName("수들의 합 - 케이스1")
    void test_case_1() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class15/2003/test_case1.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(3, solution);
    }

    @Test
    @DisplayName("수들의 합 - 케이스2")
    void test_case_2() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class15/2003/test_case2.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(3, solution);
    }

}