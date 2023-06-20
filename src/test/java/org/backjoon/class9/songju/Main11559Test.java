package org.backjoon.class9.songju;

import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Puyo Puyo - 송주")
class Main11559Test {

    @Test
    @DisplayName( "Puyo Puyo 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class9/11559/test_case1.txt");
        int solution = Main11559.solution( reader );
        assertEquals( 3, solution );
    }
}