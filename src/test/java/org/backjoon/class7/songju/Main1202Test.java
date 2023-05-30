package org.backjoon.class7.songju;

import org.backjoon.class6.songju.Main11047;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("보석 도둑 - 송주")
class Main1202Test {

    @Test
    @DisplayName( "보석 도둑 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class7/1202/test_case1.txt");
        long solution = Main1202.solution( reader );
        assertEquals( 10, solution );
    }

    @Test
    @DisplayName( "보석 도둑 테스트 케이스 2" )
    void test_case_2 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class7/1202/test_case2.txt");
        long solution = Main1202.solution( reader );
        assertEquals( 164, solution );
    }
}