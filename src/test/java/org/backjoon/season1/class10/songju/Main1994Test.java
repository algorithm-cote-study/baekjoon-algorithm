package org.backjoon.season1.class10.songju;

import org.backjoon.common.TestFileUtil;
import org.backjoon.season1.class10.songju.Main1994;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("등차수열 - 송주")
class Main1994Test {

    @Test
    @DisplayName( "등차수열 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class10/1994/test_case1.txt");
        int solution = Main1994.solution(reader );
        assertEquals( 4, solution );
    }
}