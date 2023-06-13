package org.backjoon.class8.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 백준 계단오르기 (실버3)
 */
public class Main2579 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int solution(BufferedReader reader) throws IOException {
        int n = Integer.parseInt(reader.readLine());
        int[] stairs = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            stairs[i] = Integer.parseInt(reader.readLine());
        }

        return findMaxScore(stairs, n);
    }

    private static int findMaxScore(int[] stairs, int n) {
        int[] compareStair = new int[n + 1];
        compareStair[1] = stairs[1];
        if (n > 1) {
            compareStair[2] = stairs[1] + stairs[2];
        }

        for (int i = 3; i <= n; i++) {
            compareStair[i] = Math.max((stairs[i] + compareStair[i - 2]), (stairs[i] + stairs[i - 1] + compareStair[i - 3]));
        }

        return compareStair[n];
    }
}
