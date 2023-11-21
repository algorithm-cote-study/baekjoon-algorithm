package org.backjoon.season1.class14.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 2023Y 28W
 * 1149. RGB거리
 *
 * @author yeji
 * @since 2023.07.19
 */
public class Main1149 {

    private static final int RED = 0;
    private static final int GREEN = 1;
    private static final int BLUE = 2;

    private static int[][] costs;
    private static int[][] dp;

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int solution(BufferedReader reader) throws IOException {
        int n = Integer.parseInt(reader.readLine());

        costs = new int[n][3];
        dp = new int[n][3];

        for (int i = 0; i < n; i++) {
            int[] inputs = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            costs[i][RED] = inputs[0];
            costs[i][GREEN] = inputs[1];
            costs[i][BLUE] = inputs[2];
        }
        dp[0][RED] = costs[0][RED];
        dp[0][GREEN] = costs[0][GREEN];
        dp[0][BLUE] = costs[0][BLUE];

        return Math.min(paintCost(n - 1, RED), Math.min(paintCost(n - 1, GREEN), paintCost(n - 1, BLUE)));
    }


    private static int paintCost(int n, int color) {

        if (dp[n][color] == 0) {
            if (color == RED) {
                dp[n][RED] = Math.min(paintCost(n - 1, GREEN), paintCost(n - 1, BLUE)) + costs[n][RED];
            } else if (color == GREEN) {
                dp[n][GREEN] = Math.min(paintCost(n - 1, RED), paintCost(n - 1, BLUE)) + costs[n][GREEN];
            } else {
                dp[n][BLUE] = Math.min(paintCost(n - 1, RED), paintCost(n - 1, GREEN)) + costs[n][BLUE];
            }
        }

        return dp[n][color];
    }
}
