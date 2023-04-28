package org.backjoon.class3.yeji;

import static org.backjoon.class3.yeji.Main2178.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName( "미로탐색 - 예지" )
class Main2178Test {

    @Test
    @DisplayName( "미로탐색 케이스 1" )
    void test_case_1 () throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class3/2178/test_case1.txt" );
        // when
        int solution = solution( reader );

        // then
        assertEquals( 15, solution );
    }

    @Test
    @DisplayName( "미로탐색 케이스 2" )
    void test_case_2 () throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class3/2178/test_case2.txt" );
        // when
        int solution = solution( reader );

        // then
        assertEquals( 9, solution );
    }

    @Test
    @DisplayName( "미로탐색 케이스 3" )
    void test_case_3 () throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class3/2178/test_case3.txt" );
        // when
        int solution = solution( reader );

        // then
        assertEquals( 38, solution );
    }

    @Test
    @DisplayName( "미로탐색 케이스 4" )
    void test_case_4 () throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class3/2178/test_case4.txt" );
        // when
        int solution = solution( reader );

        // then
        assertEquals( 13, solution );
    }
}