package org.backjoon.class13.songju;

import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("사탕 게임 - 송주")
class Main3085Test {

    @Test
    @DisplayName( "사탕 게임 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class13/3085/test_case1.txt");
        int solution = Main3085.solution( reader );
        assertEquals( 3, solution );
    }

    @Test
    @DisplayName( "사탕 게임 테스트 케이스 2" )
    void test_case_2 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class13/3085/test_case2.txt");
        int solution = Main3085.solution( reader );
        assertEquals( 4, solution );
    }

    @Test
    @DisplayName( "사탕 게임 테스트 케이스 3" )
    void test_case_3 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class13/3085/test_case3.txt");
        int solution = Main3085.solution( reader );
        assertEquals( 4, solution );
    }
}