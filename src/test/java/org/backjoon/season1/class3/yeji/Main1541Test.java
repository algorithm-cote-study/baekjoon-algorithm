package org.backjoon.season1.class3.yeji;

import static org.backjoon.season1.class3.yeji.Main1541.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName( "잃어버린 괄호 - 예지" )
class Main1541Test {

    @Test
    @DisplayName( "잃어버린 괄호 케이스 1" )
    void test_case_1 () throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class3/1541/test_case1.txt" );
        // when
        int solution = solution( reader );

        // then
        assertEquals( -35, solution );
    }

    @Test
    @DisplayName( "잃어버린 괄호 케이스 2" )
    void test_case_2 () throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class3/1541/test_case2.txt" );
        // when
        int solution = solution( reader );

        // then
        assertEquals( 100, solution );
    }

    @Test
    @DisplayName( "잃어버린 괄호 케이스 3" )
    void test_case_3 () throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class3/1541/test_case3.txt" );
        // when
        int solution = solution( reader );

        // then
        assertEquals( 0, solution );
    }
}