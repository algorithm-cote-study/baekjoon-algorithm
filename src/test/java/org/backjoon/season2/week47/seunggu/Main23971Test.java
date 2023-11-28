package org.backjoon.season2.week47.seunggu;

import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("ZOAC 4 - 승구")
class Main23971Test {

    @Test
    @DisplayName("ZOAC 4 케이스 1")
    void test_case_1() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/week47/23971/test_case1.txt");
        // when
        int number = Main23971.solution(reader);

        // then
        assertEquals(6, number);

    }

}