package org.backjoon.class3.yeji;

import static org.backjoon.class3.yeji.Main2630.solution;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.io.BufferedReader;
import java.io.IOException;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName( "색종이 만들기 - 예지" )
class Main2630Test {

    @Test
    @DisplayName( "색종이 만들기 케이스1" )
    void test_case_1 () throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class3/2630/test_case1.txt" );
        // when
        int[] solution = solution( reader );
        // then
        assertArrayEquals( new int[]{ 9, 7 }, solution );
    }
}