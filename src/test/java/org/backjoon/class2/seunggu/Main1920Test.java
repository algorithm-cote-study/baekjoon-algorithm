package org.backjoon.class2.seunggu;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("수 찾기 - 승구")
class Main1920Test {

    @Test
    @DisplayName( "수 찾기 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class2/1920/test_case1.txt");
        // when
        String solution = Main1920.solution( reader );

        // then
        assertEquals("""
                              1
                              1
                              0
                              0
                              1
                              """, solution );

    }
}