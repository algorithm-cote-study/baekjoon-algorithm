package org.backjoon.class13.yeji;

import static org.backjoon.class13.yeji.Main3568.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("iSharp - 예지")
class Main3568Test {


    @Test
    @DisplayName("iSharp - 테스트케이스1")
    void test_case_1() throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class13/3568/test_case1.txt");
        // when
        String solution = solution(reader);
        // then
        assertEquals("""
            int&&[]* a;
            int& b;
            int&* c;            
            """.trim(), solution);
    }
}