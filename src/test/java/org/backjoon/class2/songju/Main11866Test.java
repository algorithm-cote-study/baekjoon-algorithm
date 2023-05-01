package org.backjoon.class2.songju;

import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName( "요세푸스 문제 0 - 송주" )
class Main11866Test {

    @Test
    @DisplayName( "요세푸스 문제 0 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class2/11866/test_case1.txt" );
        String solution = Main11866.solution( reader );
        assertEquals( "<3, 6, 2, 7, 5, 1, 4>", solution );

    }

}