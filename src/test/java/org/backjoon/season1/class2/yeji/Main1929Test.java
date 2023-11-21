package org.backjoon.season1.class2.yeji;

import static org.backjoon.season1.class2.yeji.Main1929.solution;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.io.BufferedReader;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName( "소수 구하기  - 예지" )
class Main1929Test {

    @Test
    @DisplayName( "소수구하기 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class2/1929/test_case1.txt" );
        // when
        int[] solution = solution( reader );
        int[] compare = { 3, 5, 7, 11, 13 };

        // then
        assertArrayEquals( compare, solution );

    }

}