package org.backjoon.season1.class2.seunggu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import org.backjoon.common.TestFileUtil;
import org.backjoon.season1.class2.seunggu.Main10845;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("큐 - 승구")
class Main10845Test {

    @Test
    @DisplayName("큐 테스트 케이스 1")
    void test_case_1() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class2/10845/test_case1.txt");
        // when

        String solution = Main10845.solution(reader).trim();

        // then
        assertEquals("""
            1
            2
            2
            0
            1
            2
            -1
            0
            1
            -1
            0
            3
            """.trim(), solution);

    }
}