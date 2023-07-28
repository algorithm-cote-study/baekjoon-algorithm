package org.backjoon.class15.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 내려가기
public class Main2096 {
    private static int N;
    private static int [][] board;
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
        board = new int[N][3];
        for (int i = 0; i < N; i++) {
            board[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        return dp();
    }

    private static String dp() {
        StringBuilder result = new StringBuilder();
        int[][] maxDp = new int[N][3];
        int[][] minDp = new int[N][3];
        maxDp[0][0] = minDp[0][0] = board[0][0];
        maxDp[0][1] = minDp[0][1] = board[0][1];
        maxDp[0][2] = minDp[0][2] = board[0][2];

        for (int i = 1; i < N; i++) {
            maxDp[i][0] = Math.max(maxDp[i - 1][0], maxDp[i - 1][1]) + board[i][0];
            maxDp[i][1] = Math.max(maxDp[i - 1][0], Math.max(maxDp[i - 1][1], maxDp[i - 1][2])) + board[i][1];
            maxDp[i][2] = Math.max(maxDp[i - 1][1], maxDp[i - 1][2]) + board[i][2];

            minDp[i][0] = Math.min(minDp[i - 1][0], minDp[i - 1][1]) + board[i][0];
            minDp[i][1] = Math.min(minDp[i - 1][0], Math.min(minDp[i - 1][1], minDp[i - 1][2])) + board[i][1];
            minDp[i][2] = Math.min(minDp[i - 1][1], minDp[i - 1][2]) + board[i][2];
        }
        result.append(Math.max(maxDp[N - 1][0], Math.max(maxDp[N - 1][1], maxDp[N - 1][2])))
                .append(" ")
                .append(Math.min(minDp[N - 1][0], Math.min(minDp[N - 1][1], minDp[N - 1][2])));
        return result.toString();
    }
}
