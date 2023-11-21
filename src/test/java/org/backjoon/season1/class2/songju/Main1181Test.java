package org.backjoon.season1.class2.songju;

import org.backjoon.common.TestFileUtil;
import org.backjoon.season1.class2.songju.Main1181;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName( "단어 정렬 - 송주" )
class Main1181Test {

    @Test
    @DisplayName( "단어 정렬 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class2/1181/test_case1.txt" );
        String solution = Main1181.solution(reader );
        assertEquals( "i\n" +
                "im\n" +
                "it\n" +
                "no\n" +
                "but\n" +
                "more\n" +
                "wait\n" +
                "wont\n" +
                "yours\n" +
                "cannot\n" +
                "hesitate\n", solution );

    }

}