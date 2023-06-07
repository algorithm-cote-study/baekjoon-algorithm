package org.backjoon.class8.songju;

import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("K번째 수 - 송주")
class Main1300Test {

    @Test
    @DisplayName( "K번째 수 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class8/1300/test_case1.txt");
        int solution = Main1300.solution( reader );
        assertEquals( 6, solution );
    }
}