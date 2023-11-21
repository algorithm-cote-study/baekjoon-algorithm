package org.backjoon.season1.class6.yeji;

import static org.backjoon.season1.class6.yeji.Main2195.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("문자열 복사 - 예지")
class Main2195Test {

    @Test
    @DisplayName("문자열 복사 케이스1")
    void test_case_1() throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class6/2195/test_case1.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(10, solution);

    }
}