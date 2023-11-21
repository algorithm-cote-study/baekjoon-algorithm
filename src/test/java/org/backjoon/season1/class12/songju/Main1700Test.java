package org.backjoon.season1.class12.songju;

import org.backjoon.common.TestFileUtil;
import org.backjoon.season1.class12.songju.Main1700;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("멀티탭 스케줄링 - 송주")
class Main1700Test {

    @Test
    @DisplayName( "멀티탭 스케줄링 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class12/1700/test_case1.txt");
        int solution = Main1700.solution(reader );
        assertEquals( 2, solution );
    }
}