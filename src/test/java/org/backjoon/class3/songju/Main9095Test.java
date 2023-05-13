package org.backjoon.class3.songju;

import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("1, 2, 3 더하기 - 송주")
class Main9095Test {

    @Test
    @DisplayName( "1, 2, 3 더하기 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class3/9095/test_case1.txt");
        String solution = Main9095.solution( reader );
        assertEquals( "7\n" +
                "44\n" +
                "274\n", solution );
    }
}