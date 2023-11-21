package org.backjoon.season1.class14.songju;

import org.backjoon.common.TestFileUtil;
import org.backjoon.season1.class14.songju.Main1965;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("상자넣기 - 송주")
class Main1965Test {

    @Test
    @DisplayName( "상자넣기 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class14/1965/test_case1.txt");
        int solution = Main1965.solution(reader );
        assertEquals( 5, solution );
    }

    @Test
    @DisplayName( "상자넣기 테스트 케이스 2" )
    void test_case_2 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class14/1965/test_case2.txt");
        int solution = Main1965.solution( reader );
        assertEquals( 10, solution );
    }
}