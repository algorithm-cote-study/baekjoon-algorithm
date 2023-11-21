package org.backjoon.season1.class3.seunggu;

import static org.backjoon.season1.class3.seunggu.Main7662.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("이중 우선순위 큐 - 승구")
class Main7662Test {

    @Test
    @DisplayName("이중 우선순위 큐  테스트 케이스 1")
    void test_case_1() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class3/7662/test_case1.txt");
        // when
        String solution = solution(reader);

        // then
        assertEquals("""
            EMPTY
            333 -45""", solution);

    }

}