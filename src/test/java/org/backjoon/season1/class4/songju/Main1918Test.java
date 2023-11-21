package org.backjoon.season1.class4.songju;

import org.backjoon.season1.class4.songju.Main1918;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("후위 표기식 - 송주")
class Main1918Test {

    @Test
    @DisplayName( "후위 표기식 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class3/1918/test_case1.txt");
        String solution = Main1918.solution( reader );
        assertEquals( "ABC+*", solution );
    }

    @Test
    @DisplayName( "후위 표기식 테스트 케이스 2" )
    void test_case_2 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class3/1918/test_case2.txt");
        String solution = Main1918.solution( reader );
        assertEquals( "AB+", solution );
    }

    @Test
    @DisplayName( "후위 표기식 테스트 케이스 3" )
    void test_case_3 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class3/1918/test_case3.txt");
        String solution = Main1918.solution( reader );
        assertEquals( "ABC*+", solution );
    }

    @Test
    @DisplayName( "후위 표기식 테스트 케이스 4" )
    void test_case_4 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class3/1918/test_case4.txt");
        String solution = Main1918.solution( reader );
        assertEquals( "ABC*+DE/-", solution );
    }
}