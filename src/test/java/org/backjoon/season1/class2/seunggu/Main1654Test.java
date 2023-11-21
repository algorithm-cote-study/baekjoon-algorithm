package org.backjoon.season1.class2.seunggu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import org.backjoon.common.TestFileUtil;
import org.backjoon.season1.class2.seunggu.Main1654;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("랜선 자르기 - 승구")
class Main1654Test {

    @Test
    @DisplayName("랜선 자르기 테스트 케이스 1")
    void test_case_1() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class2/1654/test_case1.txt");
        // when
        long solution = Main1654.solution(reader);

        // then
        assertEquals(200, solution);
    }

}