package org.backjoon.class16.songju;

import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("List of Unique Numbers - 송주")
class Main13144Test {

    @Test
    @DisplayName( "List of Unique Numbers 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class16/13144/test_case1.txt");
        long solution = Main13144.solution( reader );
        assertEquals( 15, solution );
    }

    @Test
    @DisplayName( "List of Unique Numbers 테스트 케이스 2" )
    void test_case_2 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class16/13144/test_case2.txt");
        long solution = Main13144.solution( reader );
        assertEquals( 12, solution );
    }

    @Test
    @DisplayName( "List of Unique Numbers 테스트 케이스 3" )
    void test_case_3 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class16/13144/test_case3.txt");
        long solution = Main13144.solution( reader );
        assertEquals( 5, solution );
    }
}