package org.backjoon.season1.class3.seunggu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1,2,3 더하기
 */
public class Main9095 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(solution(reader));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static String solution(BufferedReader reader) throws IOException {
        int count = Integer.parseInt(reader.readLine());
        int[] dp = new int[12];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for (int i = 4; i < dp.length; i++) {
            dp[i] = dp[i - 3] + dp[i - 2] + dp[i - 1];
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < count; i++) {
            stringBuilder.append(dp[Integer.parseInt(reader.readLine())]).append("\n");
        }
        return stringBuilder.toString().trim();
    }
    
}
