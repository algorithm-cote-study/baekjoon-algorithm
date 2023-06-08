package org.backjoon.class6.seunggu;

import static org.backjoon.class6.seunggu.Main3109.solution;
import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("빵집 - 승구")
class Main3109Test {

    @Test
    @DisplayName("문자열 복사 테스트 케이스 1")
    void test_case_1 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class6/3109/test_case1.txt" );
        // when
        int solution = solution( reader );
        // then
        assertEquals( 2, solution );
    }

    @Test
    @DisplayName("문자열 복사 테스트 케이스 2")
    void test_case_2 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class6/3109/test_case2.txt" );
        // when
        int solution = solution( reader );
        // then
        assertEquals( 5, solution );
    }

}