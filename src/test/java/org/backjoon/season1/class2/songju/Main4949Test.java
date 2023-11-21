package org.backjoon.season1.class2.songju;

import org.backjoon.common.TestFileUtil;
import org.backjoon.season1.class2.songju.Main4949;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName( "균형잡힌 세상 - 송주" )
class Main4949Test {

    @Test
    @DisplayName( "균형잡힌 세상 테스트1" )
    void test_case_1 () throws IOException {
       BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class2/4949/test_case1.txt" );
        String solution = Main4949.solution(reader );
        assertEquals( "yes\n" +
                "yes\n" +
                "no\n" +
                "no\n" +
                "no\n" +
                "yes\n" +
                "yes\n", solution );
    }

}