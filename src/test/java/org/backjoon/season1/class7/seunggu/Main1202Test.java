package org.backjoon.season1.class7.seunggu;

import static org.backjoon.season1.class7.seunggu.Main1202.solution;
import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("보석 도둑")
class Main1202Test {

    @Test
    @DisplayName("보석 도둑 테스트 케이스 1")
    void test_case_1 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class7/1202/test_case1.txt" );
        // when
        long solution = solution( reader );
        // then
        assertEquals( 10, solution );
    }

    @Test
    @DisplayName("보석 도둑 테스트 케이스 2")
    void test_case_2 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class7/1202/test_case2.txt" );
        // when
        long solution = solution( reader );
        // then
        assertEquals( 164, solution );
    }

}