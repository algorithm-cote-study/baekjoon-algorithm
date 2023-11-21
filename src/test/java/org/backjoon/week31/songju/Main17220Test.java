package org.backjoon.week31.songju;

import org.backjoon.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("마약수사대 - 송주")
class Main17220Test {
    @Test
    @DisplayName("마약수사대 - 케이스1")
    void test_case_1() throws Exception {
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/week31/17220/test_case1.txt");
        int solution = Main17220.solution(reader);
        assertEquals(4, solution);
    }
}