package org.backjoon.season2.week47.songju;

import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("삼각형과 세변 - 송주")
class Main5073Test {

   @Test
    @DisplayName( "삼각형과 세변 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/week47/5073/test_case1.txt");
        String solution = Main5073.solution(reader );
        assertEquals( "Equilateral\n" +
                "Scalene\n" +
                "Invalid\n" +
                "Isosceles\n", solution );

    }
}