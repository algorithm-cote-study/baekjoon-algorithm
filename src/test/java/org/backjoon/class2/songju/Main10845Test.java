package org.backjoon.class2.songju;

import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("큐 - 송주")
class Main10845Test {

    @Test
    @DisplayName( "큐 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class2/10845/test_case1.txt");
        String solution = Main10845.solution( reader );
        assertEquals( "1\n" +
                "2\n" +
                "2\n" +
                "0\n" +
                "1\n" +
                "2\n" +
                "-1\n" +
                "0\n" +
                "1\n" +
                "-1\n" +
                "0\n" +
                "3", solution );

    }
}