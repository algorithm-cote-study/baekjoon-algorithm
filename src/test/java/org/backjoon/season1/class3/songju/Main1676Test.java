package org.backjoon.season1.class3.songju;

import org.backjoon.common.TestFileUtil;
import org.backjoon.season1.class3.songju.Main1676;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("팩토리얼 0의 개수 - 송주")
class Main1676Test {

    @Test
    @DisplayName( "팩토리얼 0의 개수 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class3/1676/test_case1.txt");
        int solution = Main1676.solution(reader );
        assertEquals( 2, solution );
    }

    @Test
    @DisplayName( "팩토리얼 0의 개수 테스트 케이스 2" )
    void test_case_2 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class3/1676/test_case2.txt");
        int solution = Main1676.solution( reader );
        assertEquals( 0, solution );
    }
}