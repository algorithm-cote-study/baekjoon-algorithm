package org.backjoon.season1.class2.yeji;

import static org.backjoon.season1.class2.yeji.Main1259.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName( "팰린드롬 수 - 예지" )
class Main1259Test {

    @Test
    @DisplayName( "프린터 큐 케이스 1" )
    void test_case_1 () throws Exception {
        // given
        String sb = new StringBuilder().append( "yes" ).append( "\n" ).append( "no" ).append( "\n" ).append( "yes" ).append( "\n" ).toString();
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class2/1259/test_case1.txt" );
        // when
        String solution = solution( reader );
        // then
        assertEquals( sb, solution );
    }
}