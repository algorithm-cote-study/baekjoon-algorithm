package org.backjoon.season1.class2.songju;

import org.backjoon.common.TestFileUtil;
import org.backjoon.season1.class2.songju.Main7568;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName( "덩치 - 송주" )
class Main7568Test {

    @Test
    @DisplayName( "덩치 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class2/7568/test_case1.txt" );
        String solution = Main7568.solution(reader );
        assertEquals( "2 2 1 2 5 ", solution );
    }

}