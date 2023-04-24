package org.backjoon.class2.seunggu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("체스판 다시 칠하기 - 승구")
class Main1018Test {

    @Test
    @DisplayName( "체스판 다시 칠하기 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class2/1018/test_case1.txt");
        // when
        int solution = Main1018.solution( reader );

        // then
        assertEquals( 1, solution );

    }

    @Test
    @DisplayName( "체스판 다시 칠하기 테스트 케이스 2" )
    void test_case_2 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class2/1018/test_case2.txt");

        // when
        int solution = Main1018.solution( reader );

        // then
        assertEquals( 12, solution );

    }

    @Test
    @DisplayName( "체스판 다시 칠하기 테스트 케이스 3" )
    void test_case_3 () throws Exception {
        // given
        BufferedReader reader =  TestFileUtil.getReader( this.getClass(), "testcase/class2/1018/test_case3.txt");
        // when
        int solution = Main1018.solution( reader );

        // then
        assertEquals( 0, solution );

    }

    @Test
    @DisplayName( "체스판 다시 칠하기 테스트 케이스 4" )
    void test_case_4 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class2/1018/test_case4.txt");

        // when
        int solution = Main1018.solution( reader );

        // then
        assertEquals( 31, solution );

    }

    @Test
    @DisplayName( "체스판 다시 칠하기 테스트 케이스 5" )
    void test_case_5 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class2/1018/test_case5.txt");

        // when
        int solution = Main1018.solution( reader );

        // then
        assertEquals( 0, solution );
    } 
    
    @Test
    @DisplayName( "체스판 다시 칠하기 테스트 케이스 6" )
    void test_case_6 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class2/1018/test_case6.txt");

        // when
        int solution = Main1018.solution( reader );

        // then
        assertEquals( 2, solution );
    }
    
    @Test
    @DisplayName( "체스판 다시 칠하기 테스트 케이스 7" )
    void test_case_7 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class2/1018/test_case7.txt");

        // when
        int solution = Main1018.solution( reader );

        // then
        assertEquals( 15, solution );
    }
}