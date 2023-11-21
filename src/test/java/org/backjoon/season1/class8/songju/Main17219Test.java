package org.backjoon.season1.class8.songju;

import org.backjoon.common.TestFileUtil;
import org.backjoon.season1.class8.songju.Main17219;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("비밀번호 찾기 - 송주")
class Main17219Test {

    @Test
    @DisplayName( "비밀번호 찾기 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class8/17219/test_case1.txt");
        String solution = Main17219.solution(reader );
        assertEquals( "THEKINGOD\n" +
                "UAENA\n" +
                "IU\n" +
                "ADREAMER\n", solution );
    }
}