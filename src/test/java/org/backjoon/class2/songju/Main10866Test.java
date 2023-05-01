package org.backjoon.class2.songju;

import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("덱 - 송주")
class Main10866Test {

    @Test
    @DisplayName("덱 테스트 케이스 1")
    void test_case_1() throws Exception {
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class2/10866/test_case1.txt");
        String solution = Main10866.solution(reader);
        assertEquals("2\n" +
                "1\n" +
                "2\n" +
                "0\n" +
                "2\n" +
                "1\n" +
                "-1\n" +
                "0\n" +
                "1\n" +
                "-1\n" +
                "0\n" +
                "3\n", solution);
    }

    @Test
    @DisplayName("덱 테스트 케이스 2")
    void test_case_2() throws Exception {
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class2/10866/test_case2.txt");
        String solution = Main10866.solution(reader);
        assertEquals("-1\n" +
                "-1\n" +
                "-1\n" +
                "-1\n" +
                "1\n" +
                "1\n" +
                "2\n" +
                "2\n" +
                "333\n" +
                "10\n" +
                "10\n" +
                "333\n" +
                "20\n" +
                "1234\n" +
                "1234\n" +
                "20\n", solution);
    }
}
