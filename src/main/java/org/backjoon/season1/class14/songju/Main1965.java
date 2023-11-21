package org.backjoon.season1.class14.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 상자넣기
public class Main1965 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(solution(br));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int solution(BufferedReader br) throws IOException {
        int result = 0;
        int N = Integer.parseInt(br.readLine());
        int[] box = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] dp = new int[N];
        Arrays.fill(dp, 1);
        for (int i = 1; i < N; i++) {
            for (int j = 0; j < i; j++) {
                if (box[i] > box[j])
                    dp[i] = Math.max(dp[i], dp[j] + 1);
            }
            result = Math.max(dp[i], result);
        }
        return result;
    }
}
