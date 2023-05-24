package org.backjoon.class5.seunggu;

import static org.backjoon.class5.seunggu.Main1260.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("DFS와 BFS - 승구")
class Main1260Test {

    @Test
    @DisplayName("DFS와 BFS 케이스 1")
    void test_case_1() throws IOException {
        // given
        String solution = getSolution("testcase/class3/1260/test_case1.txt").trim();
        // then
        assertEquals("""
            1 2 4 3
            1 2 3 4
            """.trim(), solution);
    }

    private String getSolution(String fileName) throws IOException {
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), fileName);
        // when
        return solution(reader);
    }

    @Test
    @DisplayName("DFS와 BFS 케이스 2")
    void test_case_2() throws IOException {
        // given
        String solution = getSolution("testcase/class3/1260/test_case2.txt").trim();
        // then
        assertEquals("""
            3 1 2 5 4
            3 1 4 2 5
            """.trim(), solution);
    }

    @Test
    @DisplayName("DFS와 BFS 케이스 3")
    void test_case_3() throws IOException {
        // given
        String solution = getSolution("testcase/class3/1260/test_case3.txt").trim();
        // then
        assertEquals("""
            1000 999
            1000 999
            """.trim(), solution);
    }

}