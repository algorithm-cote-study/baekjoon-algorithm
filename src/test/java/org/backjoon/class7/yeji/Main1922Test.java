package org.backjoon.class7.yeji;

import static org.backjoon.class7.yeji.Main1922.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("네트워크 연결 - 예지")
class Main1922Test {

    @Test
    @DisplayName("네트워크 연결 케이스1")
    void test_case_1() throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class7/1922/test_case1.txt");
        // when
        int solution = solution(reader);
        // then
        assertEquals(23, solution);
    }
}