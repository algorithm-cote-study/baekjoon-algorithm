package org.backjoon.class3.songju;

import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("계단 오르기 - 송주")
class Main2579Test {

    @Test
    @DisplayName( "계단 오르기 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class3/2579/test_case1.txt");
        int solution = Main2579.solution( reader );
        assertEquals( 75, solution );
    }
}