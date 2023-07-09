package org.backjoon.class12.songju;

import org.backjoon.class11.songju.Main17213;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("부분합 - 송주")
class Main1806Test {

    @Test
    @DisplayName( "부분합 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class12/1806/test_case1.txt");
        int solution = Main1806.solution( reader );
        assertEquals( 2, solution );
    }
}