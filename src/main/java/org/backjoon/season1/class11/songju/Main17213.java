package org.backjoon.season1.class11.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//과일 서리
public class Main17213 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(solution(br));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int solution(BufferedReader br) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[][] dp = new int[11][31];

        for (int i = 1; i <= N; i++)
            dp[i][i] = 1;
        for (int i = 1; i <= M; i++)
            dp[1][i] = 1;
        for (int i = 2; i <= N; i++) {
            for (int j = i; j <= M; j++) {
                dp[i][j] = dp[i][j-1] + dp[i-1][j-1];
            }
        }
        return dp[N][M];
    }
}
