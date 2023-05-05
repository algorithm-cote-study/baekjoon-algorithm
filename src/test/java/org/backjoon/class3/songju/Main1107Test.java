package org.backjoon.class3.songju;

import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("리모컨 - 송주")
class Main1107Test {

    @Test
    @DisplayName( "리모컨 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class3/1107/test_case1.txt");
        int solution = Main1107.solution( reader );
        assertEquals( 6, solution );
    }

    @Test
    @DisplayName( "리모컨 테스트 케이스 2" )
    void test_case_2 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class3/1107/test_case2.txt");
        int solution = Main1107.solution( reader );
        assertEquals( 0, solution );
    }

    @Test
    @DisplayName( "리모컨 테스트 케이스 3" )
    void test_case_3 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class3/1107/test_case3.txt");
        int solution = Main1107.solution( reader );
        assertEquals( 11117, solution );
    }

    @Test
    @DisplayName( "리모컨 테스트 케이스 4" )
    void test_case_4 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class3/1107/test_case4.txt");
        int solution = Main1107.solution( reader );
        assertEquals( 0, solution );
    }

    @Test
    @DisplayName( "리모컨 테스트 케이스 5" )
    void test_case_5 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class3/1107/test_case5.txt");
        int solution = Main1107.solution( reader );
        assertEquals( 5, solution );
    }

    @Test
    @DisplayName( "리모컨 테스트 케이스 6" )
    void test_case_6 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class3/1107/test_case6.txt");
        int solution = Main1107.solution( reader );
        assertEquals( 2, solution );
    }

    @Test
    @DisplayName( "리모컨 테스트 케이스 7" )
    void test_case_7 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class3/1107/test_case7.txt");
        int solution = Main1107.solution( reader );
        assertEquals( 2228, solution );
    }
}