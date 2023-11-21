package org.backjoon.season1.class2.yeji;

import static org.backjoon.season1.class2.yeji.Main11866.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName( "요세푸스 문제 0 - 예지" )
class Main11866Test {

    @Test
    @DisplayName( "요세푸스 문제 0 케이스 1" )
    void test_case_1 () throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class2/11866/test_case1.txt" );
        // when
        String solution = solution( reader );
        // then
        assertEquals( "<3, 6, 2, 7, 5, 1, 4>", solution );

    }
}