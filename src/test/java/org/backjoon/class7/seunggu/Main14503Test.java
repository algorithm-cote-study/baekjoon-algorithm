package org.backjoon.class7.seunggu;

import static org.backjoon.class7.seunggu.Main14503.solution;
import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("로봇테스트 - 승구")
class Main14503Test {

    @Test
    @DisplayName("로봇테스트 테스트 케이스 1")
    void test_case_1 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class7/14503/test_case1.txt" );
        // when
        int solution = solution( reader );
        // then
        assertEquals( 1, solution );
    }
    
    @Test
    @DisplayName("로봇테스트 테스트 케이스 2")
    void test_case_2 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class7/14503/test_case2.txt" );
        // when
        int solution = solution( reader );
        // then
        assertEquals( 57, solution );
    }

}