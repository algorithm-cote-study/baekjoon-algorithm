package org.backjoon.season2.week47.seunggu;

import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("삼각형과 세 변 - 승구")
class Main5073Test {

    @Test
    @DisplayName("삼각형과 세 변 케이스 1")
    void test_case_1() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/week47/5073/test_case1.txt");
        // when
        String str = Main5073.solution(reader);

        // then
        assertEquals(TestFileUtil.getAnswer(this.getClass(), "testcase/week47/5073/answer1.txt"), str);

    }

}