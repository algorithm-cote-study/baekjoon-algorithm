package org.backjoon.season1.class3.songju;

import org.backjoon.common.TestFileUtil;
import org.backjoon.season1.class3.songju.Main1003;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("피보나치 함수 - 송주")
class Main1003Test {

    @Test
    @DisplayName( "피보나치 함수 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class3/1003/test_case1.txt");
        String solution = Main1003.solution(reader );
        assertEquals( "1 0\n" +
                "0 1\n" +
                "1 2\n", solution );
    }

    @Test
    @DisplayName( "피보나치 함수 테스트 케이스 2" )
    void test_case_2 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class3/1003/test_case2.txt");
        String solution = Main1003.solution( reader );
        assertEquals( "5 8\n" +
                "10946 17711\n", solution );
    }
}