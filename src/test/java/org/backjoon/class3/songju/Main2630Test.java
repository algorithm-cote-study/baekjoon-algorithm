package org.backjoon.class3.songju;

import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("색종이 만들기 - 송주")
class Main2630Test {

    @Test
    @DisplayName( "색종이 만들기 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class3/2630/test_case1.txt");
        String solution = Main2630.solution( reader );
        assertEquals( "9\n" +
                "7", solution );
    }
}