package org.backjoon.class6.seunggu;

import static org.junit.jupiter.api.Assertions.*;
import static org.backjoon.class6.seunggu.Main2195.solution;
import java.io.BufferedReader;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("문자열 복사 - 승구")
class Main2195Test {


    @Test
    @DisplayName("문자열 복사 테스트 케이스 1")
    void test_case_1 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class6/2195/test_case1.txt" );
        // when
        int solution = solution( reader );
        // then
        assertEquals( 15, solution );
    }
}