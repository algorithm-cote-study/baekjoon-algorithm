package org.backjoon.season1.class14.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 상자넣기 실버2
 */
public class Main1965 {

    private static int[] dp;

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int solution(BufferedReader reader) throws IOException {
        int result = 0;
        int n = Integer.parseInt(reader.readLine());
        dp = new int[n + 1];
        int[] input = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        dp[0] = 1;
        findMaxBox(n, input);

        for (int d : dp) {
            result = Math.max(result, d);
        }

        return result;
    }

    private static void findMaxBox(int n, int[] boxes) {

        for (int i = 1; i < n; i++) {
            int j = i;
            while (j >= 0) {
                if (boxes[i] > boxes[j]) {
                    dp[i] = Math.max(dp[i], dp[j]);
                }
                j--;
            }
            dp[i]++;
        }

    }

}
