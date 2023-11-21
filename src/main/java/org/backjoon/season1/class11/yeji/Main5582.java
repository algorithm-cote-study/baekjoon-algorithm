package org.backjoon.season1.class11.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 공통 부분 문자열 (골드5)
 */
public class Main5582 {


    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int solution(BufferedReader br) throws IOException {
        String first = br.readLine();
        String compare = br.readLine();

        return commonArrays(first.split(""), compare.split(""));
    }

    private static int commonArrays(String[] first, String[] compare) {
        int answer = 0;
        int[][] map = new int[first.length][compare.length];

        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < compare.length; j++) {
                if (first[i].equals(compare[j])) {
                    map[i][j] = 1;
                    if (i >= 1 && j >= 1) {
                        map[i][j] += map[i - 1][j - 1];
                    }
                    answer = Math.max(answer, map[i][j]);
                }
            }
        }
        return answer;
    }
}
