package org.backjoon.season1.class5.songju;

import org.backjoon.common.TestFileUtil;
import org.backjoon.season1.class5.songju.Main2178;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("미로 탐색 - 송주")
class Main2178Test {

    @Test
    @DisplayName( "미로 탐색 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class3/2178/test_case1.txt");
        int solution = Main2178.solution(reader );
        assertEquals( 15, solution );
    }

    @Test
    @DisplayName( "미로 탐색 테스트 케이스 2" )
    void test_case_2 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class3/2178/test_case2.txt");
        int solution = Main2178.solution( reader );
        assertEquals( 9, solution );
    }

    @Test
    @DisplayName( "미로 탐색 테스트 케이스 3" )
    void test_case_3 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class3/2178/test_case3.txt");
        int solution = Main2178.solution( reader );
        assertEquals( 38, solution );
    }

    @Test
    @DisplayName( "미로 탐색 테스트 케이스 4" )
    void test_case_4 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class3/2178/test_case4.txt");
        int solution = Main2178.solution( reader );
        assertEquals( 13, solution );
    }
}