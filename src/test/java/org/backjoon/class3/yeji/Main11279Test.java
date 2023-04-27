package org.backjoon.class3.yeji;

import static org.backjoon.class3.yeji.Main11279.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName( "최대 힙 - 예지" )
class Main11279Test {

    @Test
    @DisplayName( "최대 힙 케이스1" )
    void test_case_1 () throws IOException {
        // given
        String compare = "0\n" + "2\n" + "1\n" + "3\n" + "2\n" + "1\n" + "0\n" + "0\n";
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class3/11279/test_case1.txt" );
        // when
        String solution = solution( reader );

        // then
        assertEquals( compare, solution );
    }
}