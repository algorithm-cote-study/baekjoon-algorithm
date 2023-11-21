package org.backjoon.season1.class3.songju;

import org.backjoon.common.TestFileUtil;
import org.backjoon.season1.class3.songju.Main14500;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("테트로미노 - 송주")
class Main14500Test {

    @Test
    @DisplayName( "테트로미노 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class3/14500/test_case1.txt");
        int solution = Main14500.solution(reader );
        assertEquals( 19, solution );
    }

    @Test
    @DisplayName( "테트로미노 테스트 케이스 2" )
    void test_case_2 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class3/14500/test_case2.txt");
        int solution = Main14500.solution( reader );
        assertEquals( 20, solution );
    }

    @Test
    @DisplayName( "테트로미노 테스트 케이스 3" )
    void test_case_3 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class3/14500/test_case3.txt");
        int solution = Main14500.solution( reader );
        assertEquals( 7, solution );
    }
}