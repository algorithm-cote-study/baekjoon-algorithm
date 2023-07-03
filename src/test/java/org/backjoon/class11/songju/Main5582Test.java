package org.backjoon.class11.songju;

import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("공통 부분 문자열 - 송주")
class Main5582Test {

    @Test
    @DisplayName( "공통 부분 문자열 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class11/5582/test_case1.txt");
        int solution = Main5582.solution( reader );
        assertEquals( 5, solution );
    }

    @Test
    @DisplayName( "공통 부분 문자열 테스트 케이스 2" )
    void test_case_2 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class11/5582/test_case2.txt");
        int solution = Main5582.solution( reader );
        assertEquals( 0, solution );
    }
}