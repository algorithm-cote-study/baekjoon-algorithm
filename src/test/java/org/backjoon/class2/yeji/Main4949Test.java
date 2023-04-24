package org.backjoon.class2.yeji;

import static org.backjoon.class2.yeji.Main4949.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName( "균형잡힌 세상 - 예지" )
class Main4949Test {

    @Test
    @DisplayName( "균형잡힌 세상 테스트1" )
    void test_case_1 () throws IOException {
        // given
        String compare = "yes" + "\n" + "yes" + "\n" + "no" + "\n" + "no" + "\n" + "no" + "\n" + "yes" + "\n" + "yes" + "\n";
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class2/4949/test_case1.txt" );
        // when
        String solution = solution( reader );
        // then
        assertEquals( compare, solution );
    }

}