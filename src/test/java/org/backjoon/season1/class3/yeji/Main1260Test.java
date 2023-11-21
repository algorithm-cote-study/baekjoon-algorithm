package org.backjoon.season1.class3.yeji;

import static org.backjoon.season1.class3.yeji.Main1260.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName( "DFS와BFS - 예지" )
class Main1260Test {

    @Test
    @DisplayName( "DFS와BFS 케이스1" )
    void test_case_1 () throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class3/1260/test_case1.txt" );
        // when
        String solution = solution( reader );
        // then
        assertEquals( """
                          1 2 4 3
                          1 2 3 4
                          """.trim(), solution.trim() );
    }

    @Test
    @DisplayName( "DFS와BFS 케이스2" )
    void test_case_2 () throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class3/1260/test_case2.txt" );
        // when
        String solution = solution( reader );
        // then
        assertEquals( """
                          3 1 2 5 4
                          3 1 4 2 5
                          """.trim(), solution.trim() );
    }

    @Test
    @DisplayName( "DFS와BFS 케이스2" )
    void test_case_3 () throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class3/1260/test_case3.txt" );
        // when
        String solution = solution( reader );
        // then
        assertEquals( """
                          1000 999
                          1000 999
                          """.trim(), solution.trim() );
    }
}