package org.backjoon.season1.class13.songju;

import org.backjoon.common.TestFileUtil;
import org.backjoon.season1.class13.songju.Main2504;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("괄호의 값 - 송주")
class Main2504Test {

    @Test
    @DisplayName( "괄호의 값 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class13/2504/test_case1.txt");
        int solution = Main2504.solution(reader );
        assertEquals( 28, solution );
    }

    @Test
    @DisplayName( "괄호의 값 테스트 케이스 2" )
    void test_case_2 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class13/2504/test_case2.txt");
        int solution = Main2504.solution( reader );
        assertEquals( 0, solution );
    }
}