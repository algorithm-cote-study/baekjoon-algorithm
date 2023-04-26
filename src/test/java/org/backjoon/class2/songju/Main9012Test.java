package org.backjoon.class2.songju;

import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName( "괄호 - 송주" )
class Main9012Test {

    @Test
    @DisplayName( "괄호 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class2/9012/test_case1.txt" );
        String solution = Main9012.solution( reader );
        assertEquals( "NO\n" +
                "NO\n" +
                "YES\n" +
                "NO\n" +
                "YES\n" +
                "NO\n", solution );

    }

    @Test
    @DisplayName( "괄호 테스트 케이스 2" )
    void test_case_2 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class2/9012/test_case2.txt" );
        String solution = Main9012.solution( reader );
        assertEquals( "NO\n" +
                "NO\n" +
                "NO\n", solution );

    }
}