package org.backjoon.season2.week48.songju;

import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("주식 - 송주")
class Main11501Test {

   @Test
    @DisplayName( "주식 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/week48/11501/test_case1.txt");
        String solution = Main11501.solution(reader );
        assertEquals( "0\n" +
                "10\n" +
                "5\n", solution );

    }
}