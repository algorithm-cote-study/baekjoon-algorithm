package org.backjoon.class5.songju;

import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("DFS와 BFS - 송주")
class Main1260Test {

    @Test
    @DisplayName( "DFS와 BFS 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class3/1260/test_case1.txt");
        String solution = Main1260.solution( reader );
        assertEquals( "1 2 4 3 \n" +
                "1 2 3 4 ", solution );
    }

    @Test
    @DisplayName( "DFS와 BFS 테스트 케이스 2" )
    void test_case_2 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class3/1107/test_case2.txt");
        String solution = Main1260.solution( reader );
        assertEquals( "3 1 2 5 4 \n" +
                "3 1 4 2 5 ", solution );
    }

    @Test
    @DisplayName( "DFS와 BFS 테스트 케이스 3" )
    void test_case_3 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class3/1107/test_case3.txt");
        String solution = Main1260.solution( reader );
        assertEquals( "1000 999 \n" +
                "1000 999 ", solution );
    }
}