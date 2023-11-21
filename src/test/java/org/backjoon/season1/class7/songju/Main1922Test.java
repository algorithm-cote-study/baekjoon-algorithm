package org.backjoon.season1.class7.songju;

import org.backjoon.common.TestFileUtil;
import org.backjoon.season1.class7.songju.Main1922;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("네트워크 연결 - 송주")
class Main1922Test {

    @Test
    @DisplayName( "네트워크 연결 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class7/1922/test_case1.txt");
        int solution = Main1922.solution(reader );
        assertEquals( 23, solution );
    }
}