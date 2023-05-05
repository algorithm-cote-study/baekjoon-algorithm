package org.backjoon.class3.songju;

import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("토마토 - 송주")
class Main7569Test {

    @Test
    @DisplayName( "토마토 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class3/7569/test_case1.txt");
        int solution = Main7569.solution( reader );
        assertEquals( -1, solution );
    }

    @Test
    @DisplayName( "토마토 테스트 케이스 2" )
    void test_case_2 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class3/7569/test_case2.txt");
        int solution = Main7569.solution( reader );
        assertEquals( 4, solution );
    }

    @Test
    @DisplayName( "토마토 테스트 케이스 3" )
    void test_case_3 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class3/7569/test_case3.txt");
        int solution = Main7569.solution( reader );
        assertEquals( 0, solution );
    }
}