package org.backjoon.class2.songju;

import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName( "카드2 - 송주" )
class Main2164Test {

    @Test
    @DisplayName( "카드2 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class2/2164/test_case1.txt" );
        int solution = Main2164.solution( reader );
        assertEquals( 4, solution );
    }

}