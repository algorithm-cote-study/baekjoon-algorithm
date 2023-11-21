package org.backjoon.season1.class5.songju;

import org.backjoon.common.TestFileUtil;
import org.backjoon.season1.class5.songju.Main16928;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("뱀과 사다리 게임 - 송주")
class Main16928Test {

    @Test
    @DisplayName( "뱀과 사다리 게임 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class3/16928/test_case1.txt");
        int solution = Main16928.solution(reader );
        assertEquals( 3, solution );
    }

    @Test
    @DisplayName( "뱀과 사다리 게임 테스트 케이스 1" )
    void test_case_2 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class3/16928/test_case2.txt");
        int solution = Main16928.solution( reader );
        assertEquals( 5, solution );
    }
}