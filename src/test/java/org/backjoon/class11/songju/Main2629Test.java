package org.backjoon.class11.songju;

import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("양팔저울 - 송주")
class Main2629Test {

    @Test
    @DisplayName( "양팔저울 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class11/2629/test_case1.txt");
        String solution = Main2629.solution( reader );
        assertEquals( "Y N ", solution );
    }

    @Test
    @DisplayName( "양팔저울 테스트 케이스 2" )
    void test_case_2 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class11/2629/test_case2.txt");
        String solution = Main2629.solution( reader );
        assertEquals( "Y Y N ", solution );
    }
}