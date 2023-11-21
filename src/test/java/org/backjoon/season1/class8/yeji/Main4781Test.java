package org.backjoon.season1.class8.yeji;

import static org.junit.jupiter.api.Assertions.*;

import static org.backjoon.season1.class8.yeji.Main4781.solution;
import java.io.BufferedReader;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("보석가게 - 예지")
class Main4781Test {
    
    
    @Test
    @DisplayName("보석가게 케이스1")
    void test_case_1 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/class8/4781/test_case1.txt");
        // when
        String solution = solution(reader);
        // then
        assertEquals("""
            796
            798
            """,solution);
    }
}