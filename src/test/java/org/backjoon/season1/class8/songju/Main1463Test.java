package org.backjoon.season1.class8.songju;

import org.backjoon.common.TestFileUtil;
import org.backjoon.season1.class8.songju.Main1463;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("1로 만들기 - 송주")
class Main1463Test {

    @Test
    @DisplayName( "1로 만들기 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class8/1463/test_case1.txt");
        int solution = Main1463.solution(reader );
        assertEquals( 1, solution );
    }

    @Test
    @DisplayName( "1로 만들기 테스트 케이스 2" )
    void test_case_2 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class8/1463/test_case2.txt");
        int solution = Main1463.solution( reader );
        assertEquals( 3, solution );
    }
}