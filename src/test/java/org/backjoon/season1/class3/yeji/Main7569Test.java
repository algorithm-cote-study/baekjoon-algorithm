package org.backjoon.season1.class3.yeji;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import org.backjoon.season1.class3.yeji.main7569.Main7569;
import org.backjoon.season1.class3.yeji.main7569.Main7569Success;
import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName( "토마토 - 예지" )
class Main7569Test {

    private Main7569 main7569 = new Main7569Success();

    @Test
    @DisplayName( "토마토 케이스1" )
    void test_case_1 () throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class3/7569/test_case1.txt" );
        // when
        int solution = main7569.solution( reader );

        // then
        assertEquals( -1, solution );
    }

    @Test
    @DisplayName( "토마토 케이스2" )
    void test_case_2 () throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class3/7569/test_case2.txt" );
        // when
        int solution = main7569.solution( reader );

        // then
        assertEquals( 4, solution );
    }

    @Test
    @DisplayName( "토마토 케이스3" )
    void test_case_3 () throws IOException {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(), "testcase/class3/7569/test_case3.txt" );
        // when
        int solution = main7569.solution( reader );

        // then
        assertEquals( 0, solution );
    }
}