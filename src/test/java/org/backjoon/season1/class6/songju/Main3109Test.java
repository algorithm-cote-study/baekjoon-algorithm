package org.backjoon.season1.class6.songju;

import org.backjoon.common.TestFileUtil;
import org.backjoon.season1.class6.songju.Main3109;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("빵집 - 송주")
class Main3109Test {

    @Test
    @DisplayName( "빵집 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class6/3109/test_case1.txt");
        int solution = Main3109.solution(reader );
        assertEquals( 2, solution );
    }

    @Test
    @DisplayName( "빵집 테스트 케이스 2" )
    void test_case_2 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class6/3109/test_case2.txt");
        int solution = Main3109.solution( reader );
        assertEquals( 5, solution );
    }
}