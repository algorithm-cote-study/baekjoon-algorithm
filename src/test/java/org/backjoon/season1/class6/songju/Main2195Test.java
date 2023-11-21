package org.backjoon.season1.class6.songju;

import org.backjoon.common.TestFileUtil;
import org.backjoon.season1.class6.songju.Main2195;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("문자열 복사 - 송주")
class Main2195Test {

    @Test
    @DisplayName( "문자열 복사 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class6/2195/test_case1.txt");
        int solution = Main2195.solution(reader );
        assertEquals( 10, solution );
    }
}