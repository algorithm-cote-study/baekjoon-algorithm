package org.backjoon.class3.yeji;


import static org.backjoon.class3.yeji.Main2606.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("바이러스 - 예지")
class Main2606Test {

    @Test
    @DisplayName("바이러스 케이스 1")
    void test_case_1() throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class3/2606/test_case1.txt");
        // when
        int solution = solution(reader);

        assertEquals(4, solution);
    }
}