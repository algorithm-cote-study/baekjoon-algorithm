package org.backjoon.class3.songju;

import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("ATM - 송주")
class Main11399Test {

    @Test
    @DisplayName( "ATM 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class3/11399/test_case1.txt");
        int solution = Main11399.solution( reader );
        assertEquals( 32, solution );
    }
}