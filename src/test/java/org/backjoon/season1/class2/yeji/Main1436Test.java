package org.backjoon.season1.class2.yeji;

import static org.backjoon.season1.class2.yeji.Main1436.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName( "영화감독 숌 - 예지" )
class Main1436Test {

    @Test
    @DisplayName( "영화감독 숌 케이스 1" )
    void test_case_1 () throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class2/1436/test_case1.txt" );
        // when
        int n = solution( reader );
        // then
        assertEquals( 1666, n );
    }

    @Test
    @DisplayName( "영화감독 숌 케이스 2" )
    void test_case_2 () throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class2/1436/test_case2.txt" );
        // when
        int n = solution( reader );
        // then
        assertEquals( 2666, n );
    }

    @Test
    @DisplayName( "영화감독 숌 케이스 3" )
    void test_case_3 () throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class2/1436/test_case3.txt" );
        // when
        int n = solution( reader );
        // then
        assertEquals( 5666, n );
    }

    @Test
    @DisplayName( "영화감독 숌 케이스 4" )
    void test_case_4 () throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class2/1436/test_case4.txt" );
        // when
        int n = solution( reader );
        // then
        assertEquals( 66666, n );
    }

    @Test
    @DisplayName( "영화감독 숌 케이스 5" )
    void test_case_5 () throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class2/1436/test_case5.txt" );
        // when
        int n = solution( reader );
        // then
        assertEquals( 166699, n );
    }
}