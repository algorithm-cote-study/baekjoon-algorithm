package org.backjoon.class4.yeji;

import static org.backjoon.class4.yeji.Main11286.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("절댓값 힙 - 예지")
class Main11286Test {

    @Test
    @DisplayName("절댓값 힙 케이스1")
    void test_case_1() throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class3/11286/test_case1.txt");
        // when
        String solution = solution(reader);

        // then
        assertEquals("""
            -1
            1
            0
            -1
            -1
            1
            1
            -2
            2
            0
            """, solution);
    }
}