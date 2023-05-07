package org.backjoon.class3.songju;

import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("AC - 송주")
class Main5430Test {

    @Test
    @DisplayName( "AC 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class3/5430/test_case1.txt");
        String solution = Main5430.solution( reader );
        assertEquals( "[2,1]\n" +
                "error\n" +
                "[1,2,3,5,8]\n" +
                "error\n", solution );
    }
}