package org.backjoon.season1.class6.songju;

import org.backjoon.common.TestFileUtil;
import org.backjoon.season1.class6.songju.Main1021;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("회전하는 큐 - 송주")
class Main1021Test {

    @Test
    @DisplayName( "회전하는 큐 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class6/1021/test_case1.txt");
        int solution = Main1021.solution(reader );
        assertEquals( 0, solution );
    }

    @Test
    @DisplayName( "회전하는 큐 테스트 케이스 2" )
    void test_case_2 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class6/1021/test_case2.txt");
        int solution = Main1021.solution( reader );
        assertEquals( 8, solution );
    }

    @Test
    @DisplayName( "회전하는 큐 테스트 케이스 3" )
    void test_case_3 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class6/1021/test_case3.txt");
        int solution = Main1021.solution( reader );
        assertEquals( 59, solution );
    }

    @Test
    @DisplayName( "회전하는 큐 테스트 케이스 4" )
    void test_case_4 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class6/1021/test_case4.txt");
        int solution = Main1021.solution( reader );
        assertEquals( 14, solution );
    }
}