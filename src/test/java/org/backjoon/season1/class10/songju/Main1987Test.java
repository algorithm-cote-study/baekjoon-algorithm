package org.backjoon.season1.class10.songju;

import org.backjoon.common.TestFileUtil;
import org.backjoon.season1.class10.songju.Main1987;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("알파벳 - 송주")
class Main1987Test {

    @Test
    @DisplayName( "알파벳 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class10/1987/test_case1.txt");
        int solution = Main1987.solution(reader );
        assertEquals( 3, solution );
    }

    @Test
    @DisplayName( "알파벳 테스트 케이스 2" )
    void test_case_2 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class10/1987/test_case2.txt");
        int solution = Main1987.solution( reader );
        assertEquals( 6, solution );
    }

    @Test
    @DisplayName( "알파벳 테스트 케이스 3" )
    void test_case_3 () throws Exception {
        BufferedReader reader =  TestFileUtil.getReader( this.getClass(), "testcase/class10/1987/test_case3.txt");
        int solution = Main1987.solution( reader );
        assertEquals( 10, solution );
    }
}