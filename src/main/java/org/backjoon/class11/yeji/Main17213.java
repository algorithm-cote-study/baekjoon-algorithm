package org.backjoon.class11.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 과일서리 실버2
 */
public class Main17213 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int solution(BufferedReader reader) throws IOException {
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());
        int[][] dp = new int[11][31];
        for (int i = 1; i <= m; i++) {
            dp[1][i] = 1;
        }
        for (int i = 1; i <= n; i++) {
            dp[i][i] = 1;
        }
        for (int i = 2; i <= n; i++) {
            for (int j = i; j <= m; j++) {
                dp[i][j] = dp[i][j - 1] + dp[i - 1][j - 1];
            }
        }

        return dp[n][m];
    }
}
