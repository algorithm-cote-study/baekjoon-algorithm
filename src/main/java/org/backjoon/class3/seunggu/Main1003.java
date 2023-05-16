package org.backjoon.class3.seunggu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 피보나치 함수 ( 실버 3 )
 */
public class Main1003 {


    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(solution(reader));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static String solution(BufferedReader reader) throws IOException {
        int count = Integer.parseInt(reader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < count; i++) {
            int num = Integer.parseInt(reader.readLine());
            int[] fibonacci = fibonacci(num);
            stringBuilder.append(fibonacci[0]).append(" ").append(fibonacci[1]).append("\n");
        }
        return stringBuilder.toString();
    }

    private static int[] fibonacci(int num) {
        int[] zero = {1, 0};
        int[] one = {0, 1};
        if (num == 0) return zero;
        if (num == 1) return one;
        int[][] dp = new int[num + 1][2];
        dp[0] = zero;
        dp[1] = one;
        for (int i = 2; i <= num; i++) {
            dp[i][0] = dp[i - 1][0] + dp[i - 2][0];
            dp[i][1] = dp[i - 1][1] + dp[i - 2][1];
        }
        return dp[num];
    }


}
