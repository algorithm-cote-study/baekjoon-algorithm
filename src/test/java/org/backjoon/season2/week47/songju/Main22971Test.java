package org.backjoon.season2.week47.songju;

import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName( "ZOAC 4 - 송주" )
class Main22971Test {

    @Test
    @DisplayName( "ZOAC 4 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/week47/22971/test_case1.txt" );
        int solution = Main22971.solution(reader );
        assertEquals( 6, solution );
    }

}