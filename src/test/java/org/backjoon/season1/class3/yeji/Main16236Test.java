package org.backjoon.season1.class3.yeji;

import static org.backjoon.season1.class3.yeji.Main16236.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName( "아기상어 - 예지" )
class Main16236Test {

    @Test
    @DisplayName( "아기상어 케이스1" )
    void test_case_1 () throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class3/16236/test_case1.txt" );
        // when
        int solution = solution( reader );

        // then
        assertEquals( 0, solution );
    }

    @Test
    @DisplayName( "아기상어 케이스2" )
    void test_case_2 () throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class3/16236/test_case2.txt" );
        // when
        int solution = solution( reader );

        // then
        assertEquals( 3, solution );
    }

    @Test
    @DisplayName( "아기상어 케이스3" )
    void test_case_3 () throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class3/16236/test_case3.txt" );
        // when
        int solution = solution( reader );

        // then
        assertEquals( 14, solution );
    }

    @Test
    @DisplayName( "아기상어 케이스4" )
    void test_case_4 () throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class3/16236/test_case4.txt" );
        // when
        int solution = solution( reader );

        // then
        assertEquals( 60, solution );
    }

    @Test
    @DisplayName( "아기상어 케이스5" )
    void test_case_5 () throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class3/16236/test_case5.txt" );
        // when
        int solution = solution( reader );

        // then
        assertEquals( 48, solution );
    }
}