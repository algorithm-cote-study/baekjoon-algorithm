package org.backjoon.class8.songju;

import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("DSLR - 송주")
class Main9019Test {

    @Test
    @DisplayName( "DSLR 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class8/9019/test_case1.txt");
        String solution = Main9019.solution( reader );
        assertEquals( "LL\n" +
                "L\n" +
                "DDDD\n", solution );
    }
}