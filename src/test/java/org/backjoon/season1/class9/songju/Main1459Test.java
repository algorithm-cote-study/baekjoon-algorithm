package org.backjoon.season1.class9.songju;

import org.backjoon.common.TestFileUtil;
import org.backjoon.season1.class9.songju.Main1459;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("걷기 - 송주")
class Main1459Test {

    @Test
    @DisplayName( "걷기 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class9/1459/test_case1.txt");
        long solution = Main1459.solution(reader );
        assertEquals( 18, solution );
    }

    @Test
    @DisplayName( "걷기 테스트 케이스 2" )
    void test_case_2 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class9/1459/test_case2.txt");
        long solution = Main1459.solution( reader );
        assertEquals( 16, solution );
    }

    @Test
    @DisplayName( "걷기 테스트 케이스 3" )
    void test_case_3 () throws Exception {
        BufferedReader reader =  TestFileUtil.getReader( this.getClass(), "testcase/class9/1459/test_case3.txt");
        long solution = Main1459.solution( reader );
        assertEquals( 20, solution );
    }

    @Test
    @DisplayName( "걷기 테스트 케이스 4" )
    void test_case_4 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class9/1459/test_case4.txt");
        long solution = Main1459.solution( reader );
        assertEquals( 247, solution );
    }

    @Test
    @DisplayName( "걷기 테스트 케이스 5" )
    void test_case_5 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class9/1459/test_case5.txt");
        long solution = Main1459.solution( reader );
        assertEquals( 240, solution );
    }

    @Test
    @DisplayName( "걷기 테스트 케이스 6" )
    void test_case_6 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class9/1459/test_case6.txt");
        long solution = Main1459.solution( reader );
        assertEquals( 41010000000L, solution );
    }

    @Test
    @DisplayName( "걷기 테스트 케이스 7" )
    void test_case_7 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class9/1459/test_case7.txt");
        long solution = Main1459.solution( reader );
        assertEquals( 3929, solution );
    }
}