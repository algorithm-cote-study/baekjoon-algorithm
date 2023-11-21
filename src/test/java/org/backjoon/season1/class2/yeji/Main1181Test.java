package org.backjoon.season1.class2.yeji;

import static org.backjoon.season1.class2.yeji.Main1181.solution;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.io.BufferedReader;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName( "단어정렬 - 예지" )
class Main1181Test {

    @Test
    @DisplayName( "단어정렬 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class2/1181/test_case1.txt" );
        // when
        String[] solution = solution( reader );
        String[] compare = { "i", "im", "it", "no", "but", "more", "wait", "wont", "yours", "cannot", "hesitate" };

        // then
        assertArrayEquals( compare, solution );

    }

}