package org.backjoon.season1.class2.yeji;

import static org.backjoon.season1.class2.yeji.Main1654.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName( "랜선 자르기 - 예지" )
class Main1654Test {

    @Test
    @DisplayName( "랜선 자르기 테스트 1" )
    void test_case_1 () throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class2/1654/test_case1.txt" );
        // when
        long solution = solution( reader );

        // then
        assertEquals( 200L, solution );
    }
}