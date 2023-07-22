package org.backjoon.class13.songju;

import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("iSharp - 송주")
class Main3568Test {

    @Test
    @DisplayName( "iSharp 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class13/3568/test_case1.txt");
        String solution = Main3568.solution( reader );
        assertEquals( "int&&[]* a;\n" +
                "int& b;\n" +
                "int&* c;\n", solution );
    }
}