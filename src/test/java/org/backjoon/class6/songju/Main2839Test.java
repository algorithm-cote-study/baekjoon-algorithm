package org.backjoon.class6.songju;

import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("설탕 배달 - 송주")
class Main2839Test {

    @Test
    @DisplayName( "설탕 배달 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class6/2839/test_case1.txt");
        int solution = Main2839.solution( reader );
        assertEquals( 4, solution );
    }

    @Test
    @DisplayName( "설탕 배달 테스트 케이스 2" )
    void test_case_2 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class6/2839/test_case2.txt");
        int solution = Main2839.solution( reader );
        assertEquals( -1, solution );
    }

    @Test
    @DisplayName( "설탕 배달 테스트 케이스 3" )
    void test_case_3 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class6/2839/test_case3.txt");
        int solution = Main2839.solution( reader );
        assertEquals( 2, solution );
    }

    @Test
    @DisplayName( "설탕 배달 테스트 케이스 4" )
    void test_case_4 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class6/2839/test_case4.txt");
        int solution = Main2839.solution( reader );
        assertEquals( 3, solution );
    }

    @Test
    @DisplayName( "설탕 배달 테스트 케이스 5" )
    void test_case_5 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class6/2839/test_case5.txt");
        int solution = Main2839.solution( reader );
        assertEquals( 3, solution );
    }
}