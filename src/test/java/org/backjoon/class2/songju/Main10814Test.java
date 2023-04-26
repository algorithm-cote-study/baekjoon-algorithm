package org.backjoon.class2.songju;

import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName( "나이순 정렬 - 송주" )
class Main10814Test {

    @Test
    @DisplayName( "나이순 정렬 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class2/10814/test_case1.txt" );
        String solution = Main10814.solution( reader );
        assertEquals( "20 Sunyoung\n" +
                "21 Junkyu\n" +
                "21 Dohyun\n", solution );

    }

}