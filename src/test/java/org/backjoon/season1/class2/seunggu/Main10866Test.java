package org.backjoon.season1.class2.seunggu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import org.backjoon.common.TestFileUtil;
import org.backjoon.season1.class2.seunggu.Main10866;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("덱 - 승구")
class Main10866Test {

    @Test
    @DisplayName("덱 테스트 케이스 1")
    void test_case_1() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class2/10866/test_case1.txt");
        // when
        String solution = Main10866.solution(reader);

        // then
        assertEquals("""
            2
            1
            2
            0
            2
            1
            -1
            0
            1
            -1
            0
            3
            """, solution);
    }

    @Test
    @DisplayName("덱 테스트 케이스 2")
    void test_case_2() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class2/10866/test_case2.txt");
        // when
        String solution = Main10866.solution(reader);

        // then
        assertEquals("""
            -1
            -1
            -1
            -1
            1
            1
            2
            2
            333
            10
            10
            333
            20
            1234
            1234
            20
            """, solution);
    }
}