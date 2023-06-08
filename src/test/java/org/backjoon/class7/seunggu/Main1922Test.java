package org.backjoon.class7.seunggu;

import static org.backjoon.class7.seunggu.Main1922.solution;
import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("네트워크 연결 - 승구")
class Main1922Test {

    @Test
    @DisplayName("네트워크 연결 테스트 케이스 1")
    void test_case_1 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class7/1922/test_case1.txt" );
        // when
        int solution = solution( reader );
        // then
        assertEquals( 23, solution );
    }

}