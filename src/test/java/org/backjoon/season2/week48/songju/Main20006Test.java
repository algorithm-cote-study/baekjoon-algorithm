package org.backjoon.season2.week48.songju;

import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName( "랭킹전 대기열 - 송주" )
class Main20006Test {

    @Test
    @DisplayName( "랭킹전 대기열 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/week48/20006/test_case1.txt" );
        String solution = Main20006.solution(reader );
        assertEquals( "Started!\n" +
                "10 a\n" +
                "15 b\n" +
                "20 c\n" +
                "17 f\n" +
                "18 g\n" +
                "Started!\n" +
                "25 d\n" +
                "30 e\n" +
                "26 h\n" +
                "24 i\n" +
                "28 j\n", solution );
    }

}