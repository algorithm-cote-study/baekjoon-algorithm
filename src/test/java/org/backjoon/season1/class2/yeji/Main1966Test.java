package org.backjoon.season1.class2.yeji;

import static org.backjoon.season1.class2.yeji.Main1966.solution;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.io.BufferedReader;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName( "프린터 큐 - 예지" )
class Main1966Test {

    @Test
    @DisplayName( "프린터 큐 케이스 1" )
    void test_case_1 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class2/1966/test_case1.txt" );
        // when
        int[] solution = solution( reader );
        // then
        assertArrayEquals( new int[]{ 1, 2, 5 }, solution );
    }

}