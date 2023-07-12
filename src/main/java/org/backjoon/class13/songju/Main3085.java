package org.backjoon.class13.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 사탕 게임
public class Main3085 {
    private static int result, N;
    private static char[][] board;

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(solution(br));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int solution(BufferedReader br) throws IOException {
        N = Integer.parseInt(br.readLine());
        board = new char[N][N];
        result = 0;
        for (int i = 0; i < N; i++) {
            board[i] = br.readLine().toCharArray();
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - 1; j++) {
                swapArr(i, j, "COL");
                arrCheck();
                swapArr(i, j, "COL");

                swapArr(j, i, "ROW");
                arrCheck();
                swapArr(j, i, "ROW");
            }
        }
        return result;
    }

    private static void arrCheck() {
        int rowCnt, colCnt, rowResult = 0, colResult = 0;
        for (int i = 0; i < N; i++) {
            rowCnt = 1;
            colCnt = 1;
            for (int j = 0; j < N - 1; j++) {
                colCnt = board[i][j] == board[i][j + 1] ? colCnt + 1 : 1;
                rowCnt = board[j][i] == board[j + 1][i] ? rowCnt + 1 : 1;
                colResult = Math.max(colResult, colCnt);
                rowResult = Math.max(rowResult, rowCnt);
            }
        }
        result = Math.max(result, Math.max(rowResult, colResult));
    }

    private static void swapArr(int i, int j, String type) {
        int swapI, swapJ;
        if (type.equals("ROW")) {
            swapI = i + 1;
            swapJ = j;
        } else {
            swapI = i;
            swapJ = j + 1;
        }
        char tmp = board[i][j];
        board[i][j] = board[swapI][swapJ];
        board[swapI][swapJ] = tmp;
    }
}
