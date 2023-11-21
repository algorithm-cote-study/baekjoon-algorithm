package org.backjoon.season1.class3.yeji;

import static org.backjoon.season1.class3.yeji.Main2447.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName( "별찍기 10 - 예지" )
class Main2447Test {

    @Test
    @DisplayName( "별찍기 케이스 1" )
    void test_case_1 () throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class3/2447/test_case1.txt" );
        // when
        String solution = solution( reader );
        assertEquals( """
                          ***************************
                          * ** ** ** ** ** ** ** ** *
                          ***************************
                          ***   ******   ******   ***
                          * *   * ** *   * ** *   * *
                          ***   ******   ******   ***
                          ***************************
                          * ** ** ** ** ** ** ** ** *
                          ***************************
                          *********         *********
                          * ** ** *         * ** ** *
                          *********         *********
                          ***   ***         ***   ***
                          * *   * *         * *   * *
                          ***   ***         ***   ***
                          *********         *********
                          * ** ** *         * ** ** *
                          *********         *********
                          ***************************
                          * ** ** ** ** ** ** ** ** *
                          ***************************
                          ***   ******   ******   ***
                          * *   * ** *   * ** *   * *
                          ***   ******   ******   ***
                          ***************************
                          * ** ** ** ** ** ** ** ** *
                          ***************************                
                          """.trim(), solution.trim() );
    }
}