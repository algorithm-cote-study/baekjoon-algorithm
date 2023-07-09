package org.backjoon.class12.songju;

import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("안전 영역 - 송주")
class Main2468Test {

    @Test
    @DisplayName( "안전 영역 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class12/2468/test_case1.txt");
        int solution = Main2468.solution( reader );
        assertEquals( 5, solution );
    }

    @Test
    @DisplayName( "안전 영역 테스트 케이스 2" )
    void test_case_2 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class12/2468/test_case2.txt");
        int solution = Main2468.solution( reader );
        assertEquals( 6, solution );
    }
}