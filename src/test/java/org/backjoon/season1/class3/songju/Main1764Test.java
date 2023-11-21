package org.backjoon.season1.class3.songju;

import org.backjoon.common.TestFileUtil;
import org.backjoon.season1.class3.songju.Main1764;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("듣보잡 - 송주")
class Main1764Test {

    @Test
    @DisplayName( "듣보잡 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class3/1764/test_case1.txt");
        String solution = Main1764.solution(reader );
        assertEquals( "2\n" +
                "baesangwook\n" +
                "ohhenrie\n", solution );
    }
}