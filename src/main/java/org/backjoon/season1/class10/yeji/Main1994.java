package org.backjoon.season1.class10.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 등차수열 : 플래티넘5
 */
public class Main1994 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int solution(BufferedReader br) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n + 1];

        for (int i = 0; i < n; i++) {
            nums[i + 1] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(nums);
        if (n == 1) return 1;

        return findMaxLength(n, nums);
    }

    private static int findMaxLength(int n, int[] nums) {
        int[][] dp = new int[n + 1][n + 1];
        int answer = 0;
        for (int i = 1; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                dp[i][j] = 2;
                int pre = 2 * nums[i] - nums[j];
                int k = 0;
                for (k = i - 1; k >= 1; k--) {
                    if (nums[k] == pre) break;
                }
                dp[i][j] = Math.max(dp[i][j], dp[k][i] + 1);
                answer = Math.max(answer, dp[i][j]);
            }
        }

        return answer;
    }
}
