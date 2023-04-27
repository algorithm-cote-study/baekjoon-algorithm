package org.backjoon.class2.songju;

import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName( "좌표 정렬하기 - 송주" )
class Main1650Test {

    @Test
    @DisplayName( "좌표 정렬하기 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class2/11650/test_case1.txt" );
        String solution = Main11650.solution( reader );
        assertEquals( "1 -1\n" +
                "1 1\n" +
                "2 2\n" +
                "3 3\n" +
                "3 4\n", solution );
    }

}