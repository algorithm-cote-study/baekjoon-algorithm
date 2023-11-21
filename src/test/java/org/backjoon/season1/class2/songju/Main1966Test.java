package org.backjoon.season1.class2.songju;

import org.backjoon.common.TestFileUtil;
import org.backjoon.season1.class2.songju.Main1966;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName( "프린터 큐 - 송주" )
class Main1966Test {

    @Test
    @DisplayName( "프린터 큐 케이스 1" )
    void test_case_1 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class2/1966/test_case1.txt" );
        String solution = Main1966.solution(reader );
        assertEquals( "1\n" +
                "2\n" +
                "5\n", solution );
    }

}