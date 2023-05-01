package org.backjoon.class3.yeji;

import static org.backjoon.class3.yeji.Main1003.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName( "피보나치 함수 - 예지" )
class Main1003Test {

    @Test
    @DisplayName( "피보나치 함수 케이스1" )
    void test_case_1 () throws IOException {
        // given토
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class3/1003/test_case1.txt" );
        // when
        String solution = solution( reader );

        // then
        assertEquals( """
                          1 0
                          0 1
                          1 2
                          """, solution );
    }

    @Test
    @DisplayName( "피보나치 함수 케이스2" )
    void test_case_2 () throws IOException {
        // given토
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class3/1003/test_case2.txt" );
        // when
        String solution = solution( reader );

        // then
        assertEquals( """
                          5 8
                          10946 17711
                          """, solution );
    }
}