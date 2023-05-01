package org.backjoon.class2.yeji;

import static org.backjoon.class2.yeji.Main1874.solution;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.io.BufferedReader;
import java.io.IOException;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName( "스택수열 - 예지 " )
class Main1874Test {

    @Test
    @DisplayName( "스택수열 케이스 1" )
    void test_case_1 () throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class2/1874/test_case1.txt" );
        // when
        String[] answer = solution( reader );
        // then
        assertArrayEquals( new String[]{ "+", "+", "+", "+", "-", "-", "+", "+", "-", "+", "+", "-", "-", "-", "-", "-" }, answer );
    }

    @Test
    @DisplayName( "스택수열 케이스 2" )
    void test_case_2 () throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class2/1874/test_case2.txt" );
        // when
        String[] answer = solution( reader );
        // then
        assertArrayEquals( new String[]{ "NO" }, answer );
    }

}