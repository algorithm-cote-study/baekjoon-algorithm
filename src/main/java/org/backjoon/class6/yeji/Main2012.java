package org.backjoon.class6.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 등수매기기
 */
public class Main2012 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static long solution(BufferedReader br) throws IOException {
        long answer = 0;
        int n = Integer.parseInt(br.readLine());
        List<Integer> expectedRankes = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            expectedRankes.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(expectedRankes);

        for (int i = expectedRankes.size() - 1; i >= 0; i--) {
            answer += Math.abs(expectedRankes.get(i) - (i + 1));
        }

        return answer;
    }
}
