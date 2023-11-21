package org.backjoon.season1.class10.songju;

import org.backjoon.season1.class10.songju.Main10451;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("순열 사이클 - 송주")
class Main10451Test {

    @Test
    @DisplayName( "순열 사이클 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class10/10451/test_case1.txt");
        String solution = Main10451.solution(reader );
        assertEquals( "3\n" +
                "7\n", solution );
    }
}