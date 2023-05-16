package org.backjoon.class3.seunggu;

import static org.backjoon.class3.seunggu.Main1541.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("잃어버린 괄호 - 승구")
class Main1541Test {

    @Test
    @DisplayName("잃어버린 괄호 케이스 1")
    void test_case_1() throws IOException {
        // given
        int solution = getSolution("testcase/class3/1541/test_case1.txt");
        // then
        assertEquals(-35, solution);
    }

    private int getSolution(String fileName) throws IOException {
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), fileName);
        // when
        return solution(reader);
    }

    @Test
    @DisplayName("잃어버린 괄호 케이스 2")
    void test_case_2() throws IOException {
        // given
        int solution = getSolution("testcase/class3/1541/test_case2.txt");
        // then
        assertEquals(100, solution);
    }

    @Test
    @DisplayName("잃어버린 괄호 케이스 3")
    void test_case_3() throws IOException {
        // given
        int solution = getSolution("testcase/class3/1541/test_case3.txt");
        // then
        assertEquals(0, solution);
    }

}