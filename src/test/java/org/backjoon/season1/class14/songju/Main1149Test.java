package org.backjoon.season1.class14.songju;

import org.backjoon.common.TestFileUtil;
import org.backjoon.season1.class14.songju.Main1149;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("RGB거리 - 송주")
class Main1149Test {

    @Test
    @DisplayName( "RGB거리 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class14/1149/test_case1.txt");
        int solution = Main1149.solution(reader );
        assertEquals( 96, solution );
    }

    @Test
    @DisplayName( "RGB거리 테스트 케이스 2" )
    void test_case_2 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class14/1149/test_case2.txt");
        int solution = Main1149.solution( reader );
        assertEquals( 3, solution );
    }

    @Test
    @DisplayName( "RGB거리 테스트 케이스 3" )
    void test_case_3 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class14/1149/test_case3.txt");
        int solution = Main1149.solution( reader );
        assertEquals( 102, solution );
    }

    @Test
    @DisplayName( "RGB거리 테스트 케이스 4" )
    void test_case_4 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class14/1149/test_case4.txt");
        int solution = Main1149.solution( reader );
        assertEquals( 208, solution );
    }

    @Test
    @DisplayName( "RGB거리 테스트 케이스 5" )
    void test_case_5 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class14/1149/test_case5.txt");
        int solution = Main1149.solution( reader );
        assertEquals( 253, solution );
    }
}