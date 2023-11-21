package org.backjoon.season1.class2.seunggu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import org.backjoon.common.TestFileUtil;
import org.backjoon.season1.class2.seunggu.Main1966;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("프린터 큐 - 승구")
class Main1966Test {

    @Test
    @DisplayName("프린터 큐 테스트 케이스 1")
    void test_case_1() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class2/1966/test_case1.txt");
        // when
        String solution = Main1966.solution(reader);

        // then
        assertEquals("""
            1
            2
            5
            """, solution);

    }
}