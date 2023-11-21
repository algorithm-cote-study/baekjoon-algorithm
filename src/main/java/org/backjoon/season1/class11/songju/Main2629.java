package org.backjoon.season1.class11.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 양팔저울
public class Main2629 {
    private static boolean[][] dp;
    private static int N;
    private static int[] weights;

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(solution(br));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String solution(BufferedReader br) throws IOException {
        StringBuilder result = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        weights = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int M = Integer.parseInt(br.readLine());
        int[] beads = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        dp = new boolean[N+1][40001];
        dfs(0, 0);
        for(int i=0; i<M; i++) {
            result.append(dp[N][beads[i]] ? "Y " : "N ");
        }
        return result.toString();
    }

    private static void dfs(int cnt, int w) {
        if (dp[cnt][w]) return;
        dp[cnt][w] = true;

        if (cnt == N ) return;

        dfs(cnt + 1, w + weights[cnt]); // 한쪽에 추를 놓았을 경우
        dfs(cnt + 1, w);                    // 어느쪽에도 추를 놓지 않았을 경우
        dfs(cnt + 1, Math.abs(w - weights[cnt]));   // 반대편에 놓은 경우

    }
}
