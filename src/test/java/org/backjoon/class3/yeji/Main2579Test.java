package org.backjoon.class3.yeji;

import static org.backjoon.class3.yeji.Main2579.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName( "계단 오르기 - 예지" )
class Main2579Test {

    @Test
    @DisplayName( "계단 오르기 케이스1" )
    void test_case_1 () throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class3/2579/test_case1.txt" );
        // when
        int solution = solution( reader );

        // then
        assertEquals( 75, solution );
    }

}