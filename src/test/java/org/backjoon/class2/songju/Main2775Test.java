package org.backjoon.class2.songju;

import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("부녀회장이 될테야 - 송주")
class Main2775Test {

   @Test
    @DisplayName( "부녀회장이 될테야 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class2/2775/test_case1.txt");
        String solution = Main2775.solution( reader );
        assertEquals( "6\n10", solution );

    }
}