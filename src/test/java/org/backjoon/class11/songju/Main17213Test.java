package org.backjoon.class11.songju;

import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("과일 서리 - 송주")
class Main17213Test {

    @Test
    @DisplayName( "과일 서리 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class11/17213/test_case1.txt");
        int solution = Main17213.solution( reader );
        assertEquals( 36, solution );
    }
}