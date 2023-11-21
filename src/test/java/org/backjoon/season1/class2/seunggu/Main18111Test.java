package org.backjoon.season1.class2.seunggu;

import static org.backjoon.season1.class2.seunggu.Main18111.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import org.backjoon.season1.class2.seunggu.Main18111.Result;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("마인크래프트 - 승군")
class Main18111Test {

    @Test
    @DisplayName("마인크래프트 케이스 1")
    void test_case_1() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class2/18111/test_case1.txt");
        // when
        Result solution = solution(reader);

        // then
        assertEquals(new Result(2, 0), solution);

    }

    @Test
    @DisplayName("마인크래프트 케이스 2")
    void test_case_2() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class2/18111/test_case2.txt");
        // when
        Result solution = solution(reader);

        // then
        assertEquals(new Result(1, 64), solution);

    }

    @Test
    @DisplayName("마인크래프트 케이스 3")
    void test_case_3() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class2/18111/test_case3.txt");
        // when
        Result solution = solution(reader);

        // then
        assertEquals(new Result(22, 63), solution);

    }

}