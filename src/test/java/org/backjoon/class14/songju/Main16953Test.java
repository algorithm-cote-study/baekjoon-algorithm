package org.backjoon.class14.songju;

import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("A → B - 송주")
class Main16953Test {

    @Test
    @DisplayName( "A → B 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class14/16953/test_case1.txt");
        int solution = Main16953.solution( reader );
        assertEquals( 5, solution );
    }

    @Test
    @DisplayName( "A → B 테스트 케이스 2" )
    void test_case_2 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class14/16953/test_case2.txt");
        int solution = Main16953.solution( reader );
        assertEquals( -1, solution );
    }

    @Test
    @DisplayName( "A → B 테스트 케이스 3" )
    void test_case_3 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class14/16953/test_case3.txt");
        int solution = Main16953.solution( reader );
        assertEquals( 5, solution );
    }
}