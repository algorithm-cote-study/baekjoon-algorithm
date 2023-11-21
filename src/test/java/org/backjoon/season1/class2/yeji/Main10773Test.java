package org.backjoon.season1.class2.yeji;

import static org.backjoon.season1.class2.yeji.Main10773.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName( "제로 - 예지" )
class Main10773Test {

    @Test
    @DisplayName( "제로 테스트1" )
    void test_case_1 () throws IOException {
        // given
        int compare = 0;
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class2/10773/test_case1.txt" );
        // when
        int solution = solution( reader );
        // then
        assertEquals( compare, solution );
    }

    @Test
    @DisplayName( "제로 테스트2" )
    void test_case_2 () throws IOException {
        // given
        int compare = 7;
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class2/10773/test_case2.txt" );
        // when
        int solution = solution( reader );
        // then
        assertEquals( compare, solution );
    }
}