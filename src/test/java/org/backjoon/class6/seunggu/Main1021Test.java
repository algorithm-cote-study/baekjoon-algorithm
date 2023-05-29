package org.backjoon.class6.seunggu;

import static org.backjoon.class6.seunggu.Main2195.solution;
import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("회전하는큐 - 승구")
class Main1021Test {

    @Test
    @DisplayName("회전하는큐 테스트 케이스 1")
    void test_case_1 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class6/1021/test_case1.txt" );
        // when
        int solution = solution( reader );
        // then
        assertEquals( 0, solution );
    }

    @Test
    @DisplayName("회전하는큐 테스트 케이스 2")
    void test_case_2 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class6/1021/test_case2.txt" );
        // when
        int solution = solution( reader );
        // then
        assertEquals( 8, solution );
    }

    @Test
    @DisplayName("회전하는큐 테스트 케이스 3")
    void test_case_3 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class6/1021/test_case3.txt" );
        // when
        int solution = solution( reader );
        // then
        assertEquals( 59, solution );
    }

    @Test
    @DisplayName("회전하는큐 테스트 케이스 4")
    void test_case_4 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class6/1021/test_case4.txt" );
        // when
        int solution = solution( reader );
        // then
        assertEquals( 14, solution );
    }

}