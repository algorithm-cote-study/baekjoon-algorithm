package org.backjoon.season1.class8.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//1로 만들기
public class Main1463 {
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
        int[] dp = new int[N + 1];

        dp[1] = 0;

        for (int i = 2; i <= N; i++) {
            dp[i] = dp[i - 1] + 1;
            if (i % 2 == 0)
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            if (i % 3 == 0)
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
        }
        return dp[N];
    }
}
