package org.backjoon.season1.class8.songju;

import org.backjoon.common.TestFileUtil;
import org.backjoon.season1.class8.songju.Main10815;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("숫자 카드 - 송주")
class Main10815Test {

    @Test
    @DisplayName( "숫자 카드 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class8/10815/test_case1.txt");
        String solution = Main10815.solution(reader );
        assertEquals( "1 0 0 1 1 0 0 1 ", solution );
    }
}