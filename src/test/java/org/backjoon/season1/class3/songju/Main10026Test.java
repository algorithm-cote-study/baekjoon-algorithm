package org.backjoon.season1.class3.songju;

import org.backjoon.common.TestFileUtil;
import org.backjoon.season1.class3.songju.Main10026;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("적록색약 - 송주")
class Main10026Test {

    @Test
    @DisplayName( "적록색약 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class3/10026/test_case1.txt");
        String solution = Main10026.solution(reader );
        assertEquals( "4 3", solution );
    }
}