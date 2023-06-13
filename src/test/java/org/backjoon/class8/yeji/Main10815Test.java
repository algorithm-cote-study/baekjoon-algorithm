package org.backjoon.class8.yeji;

import static org.backjoon.class8.yeji.Main10815.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("숫자카드 - 예지")
class Main10815Test {

    @Test
    @DisplayName("숫자카드 케이스1")
    void test_case_1() throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class8/10815/test_case1.txt");
        // when
        String solution = solution(reader);
        // then
        assertEquals("1 0 0 1 1 0 0 1", solution);
    }
}