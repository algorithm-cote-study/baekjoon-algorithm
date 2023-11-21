package org.backjoon.season1.class2.yeji;

import static org.backjoon.season1.class2.yeji.Main2805.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName( "나무 자르기 - 예지" )
class Main2805Test {

    @Test
    @DisplayName( "나무 자르기 케이스 1" )
    void test_case_1 () throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class2/2805/test_case1.txt" );
        // when
        int solution = solution( reader );
        // then
        assertEquals( 15, solution );
    }

    @Test
    @DisplayName( "나무 자르기 케이스 2" )
    void test_case_2 () throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class2/2805/test_case2.txt" );
        // when
        int solution = solution( reader );
        // then
        assertEquals( 36, solution );
    }

    @Test
    @DisplayName( "나무 자르기 케이스 3" )
    void test_case_3 () throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class2/2805/test_case3.txt" );
        // when
        int solution = solution( reader );
        // then
        assertEquals( 3, solution );
    }
}