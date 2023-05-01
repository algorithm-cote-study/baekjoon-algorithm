package org.backjoon.class2.songju;

import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName( "영화감독 숌 - 송주" )
class Main1436Test {

    @Test
    @DisplayName( "영화감독 숌 케이스 1" )
    void test_case_1 () throws IOException {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class2/1436/test_case1.txt" );
        int n = Main1436.solution( reader );
        assertEquals( 1666, n );
    }

    @Test
    @DisplayName( "영화감독 숌 케이스 2" )
    void test_case_2 () throws IOException {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class2/1436/test_case2.txt" );
        int n = Main1436.solution( reader );
        assertEquals( 2666, n );
    }

    @Test
    @DisplayName( "영화감독 숌 케이스 3" )
    void test_case_3 () throws IOException {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class2/1436/test_case3.txt" );
        int n = Main1436.solution( reader );
        assertEquals( 5666, n );
    }

    @Test
    @DisplayName( "영화감독 숌 케이스 4" )
    void test_case_4 () throws IOException {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class2/1436/test_case4.txt" );
        int n = Main1436.solution( reader );
        assertEquals( 66666, n );
    }

    @Test
    @DisplayName( "영화감독 숌 케이스 5" )
    void test_case_5 () throws IOException {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class2/1436/test_case5.txt" );
        int n = Main1436.solution( reader );
        assertEquals( 166699, n );
    }
}