package org.backjoon.class6.songju;

import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("동전 0 - 송주")
class Main11047Test {

    @Test
    @DisplayName( "동전 0 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class6/11047/test_case1.txt");
        int solution = Main11047.solution( reader );
        assertEquals( 6, solution );
    }

    @Test
    @DisplayName( "동전 0 테스트 케이스 2" )
    void test_case_2 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class6/11047/test_case2.txt");
        int solution = Main11047.solution( reader );
        assertEquals( 12, solution );
    }
}