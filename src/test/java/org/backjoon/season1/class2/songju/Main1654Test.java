package org.backjoon.season1.class2.songju;

import org.backjoon.common.TestFileUtil;
import org.backjoon.season1.class2.songju.Main1654;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName( "랜선 자르기 - 송주" )
class Main1654Test {

    @Test
    @DisplayName( "랜선 자르기 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class2/1181/test_case1.txt" );
        int solution = Main1654.solution(reader );
        assertEquals( "5\n" +
                "3 4\n" +
                "1 1\n" +
                "1 -1\n" +
                "2 2\n" +
                "3 3\n", solution );

    }

}