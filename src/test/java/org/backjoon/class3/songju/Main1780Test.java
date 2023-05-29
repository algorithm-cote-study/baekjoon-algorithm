package org.backjoon.class3.songju;

import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("종이의 개수 - 송주")
class Main1780Test {

    @Test
    @DisplayName( "종이의 개수 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class3/1780/test_case1.txt");
        String solution = Main1780.solution( reader );
        assertEquals( "10\n" +
                "12\n" +
                "11\n", solution );
    }
}