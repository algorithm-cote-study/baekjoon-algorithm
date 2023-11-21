package org.backjoon.season1.class7.songju;

import org.backjoon.common.TestFileUtil;
import org.backjoon.season1.class7.songju.Main14503;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("로봇 청소기 - 송주")
class Main14503Test {

    @Test
    @DisplayName( "로봇 청소기 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class7/14503/test_case1.txt");
        int solution = Main14503.solution(reader );
        assertEquals( 1, solution );
    }

    @Test
    @DisplayName( "로봇 청소기 테스트 케이스 2" )
    void test_case_2 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class7/14503/test_case2.txt");
        int solution = Main14503.solution( reader );
        assertEquals( 57, solution );
    }
}