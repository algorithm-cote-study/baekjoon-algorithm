package org.backjoon.class2.seunggu;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("카드2 - 승구")
class Main2164Test {

    @Test
    @DisplayName( "카드2 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class2/2164/test_case1.txt");
        // when
        int solution = Main2164.solution( reader );

        // then
        assertEquals( 4, solution );

    }

}