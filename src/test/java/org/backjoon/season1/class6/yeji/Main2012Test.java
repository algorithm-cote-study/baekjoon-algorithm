package org.backjoon.season1.class6.yeji;

import static org.backjoon.season1.class6.yeji.Main2012.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("등수 매기기 - 예지")
class Main2012Test {

    @Test
    @DisplayName("등수 매기기 케이스1")
    void test_case_1() throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class6/2012/test_case1.txt");
        // when
        long solution = solution(reader);
        // then
        assertEquals(3, solution);
    }
}