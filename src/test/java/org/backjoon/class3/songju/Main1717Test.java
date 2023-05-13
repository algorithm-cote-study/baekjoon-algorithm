package org.backjoon.class3.songju;

import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("집합의 표현 - 송주")
class Main1717Test {

    @Test
    @DisplayName( "집합의 표현 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class3/1717/test_case1.txt");
        String solution = Main1717.solution( reader );
        assertEquals( "NO\n" +
                "NO\n" +
                "YES\n", solution );
    }
}