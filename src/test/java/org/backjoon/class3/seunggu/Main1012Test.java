package org.backjoon.class3.seunggu;

import static org.backjoon.class3.seunggu.Main1012.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("유기농 배추 - 승구")
class Main1012Test {

    @Test
    @DisplayName("유기농 배추 케이스 1")
    void test_case_1() throws IOException {
        // given
        String solution = getSolution("testcase/class3/1012/test_case1.txt").trim();
        // then
        assertEquals("""
            5
            1
            """.trim(), solution);
    }

    private String getSolution(String fileName) throws IOException {
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), fileName);
        // when
        return solution(reader);
    }

    @Test
    @DisplayName("유기농 배추 케이스 2")
    void test_case_2() throws IOException {
        // given
        String solution = getSolution("testcase/class3/1012/test_case2.txt").trim();
        // then
        assertEquals("2".trim(), solution);
    }
}