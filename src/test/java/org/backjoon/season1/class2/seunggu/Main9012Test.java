package org.backjoon.season1.class2.seunggu;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import org.backjoon.common.TestFileUtil;
import org.backjoon.season1.class2.seunggu.Main9012;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("괄호 - 승구")
class Main9012Test {
    @Test
    @DisplayName( "괄호 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class2/9012/test_case1.txt");
        // when
        String solution = Main9012.solution(reader );

        // then
        assertEquals("""
                              NO
                              NO
                              YES
                              NO
                              YES
                              NO
                              """, solution );

    }

    @Test
    @DisplayName( "괄호 테스트 케이스 2" )
    void test_case_2 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class2/9012/test_case2.txt");
        // when
        String solution = Main9012.solution( reader );

        // then
        assertEquals("""
                              NO
                              NO
                              NO
                              """, solution );

    }
}