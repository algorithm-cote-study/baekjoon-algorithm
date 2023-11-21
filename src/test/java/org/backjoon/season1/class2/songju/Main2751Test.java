package org.backjoon.season1.class2.songju;

import org.backjoon.common.TestFileUtil;
import org.backjoon.season1.class2.songju.Main2751;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName( "수 정렬하기 2 - 송주" )
class Main2751Test {

    @Test
    @DisplayName( "수 정렬하기 2 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class2/2751/test_case1.txt" );
        String solution = Main2751.solution(reader );
        assertEquals( "1\n" +
                "2\n" +
                "3\n" +
                "4\n" +
                "5\n", solution );

    }

}