package org.backjoon.class3.songju;

import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("이중 우선순위 큐 - 송주")
class Main7662Test {

    @Test
    @DisplayName( "이중 우선순위 큐 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class3/7662/test_case1.txt");
        String solution = Main7662.solution( reader );
        assertEquals( "EMPTY\n" +
                "333 -45\n", solution );
    }
}