package org.backjoon.season1.class2.songju;

import org.backjoon.common.TestFileUtil;
import org.backjoon.season1.class2.songju.Main2798;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("블랙잭 - 송주")
class Main2798Test {

    @Test
    @DisplayName( "블랙잭 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class2/2798/test_case1.txt");
        int solution = Main2798.solution(reader );
        assertEquals( 21, solution );
    }

    @Test
    @DisplayName( "블랙잭 테스트 케이스 2" )
    void test_case_2 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class2/2798/test_case2.txt");
        int solution = Main2798.solution( reader );
        assertEquals( 497, solution );
    }
}