package org.backjoon.class6.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//빵집
public class Main3109 {
    private static String[][] board;
    private static boolean[][] visited;
    private static int[] dx = {-1, 0, 1};
    private static int R, C, cnt;
    private static boolean isFinish;

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(solution(br));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int solution(BufferedReader br) throws IOException {
        int[] size = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        R = size[0];
        C = size[1];
        board = new String[R][C];
        visited = new boolean[R][C];
        cnt = 0;
        for (int i = 0; i < R; i++) {
            board[i] = br.readLine().split("");
        }

        for (int i = 0; i < R; i++) {
            isFinish = false;
            chekcPipeLine(i, 0);
        }
        return cnt;
    }

    private static void chekcPipeLine(int x, int y) {
        if (y == C - 1) {
            cnt++;
            isFinish = true;
            return;
        }

        for (int i = 0; i < 3; i++) {
            int moveX = x + dx[i];
            int moveY = y + 1;
            if (moveX >= 0 && moveX < R && moveY >= 0 && moveY < C && !board[moveX][moveY].equals("x") && !visited[moveX][moveY]) {
                visited[moveX][moveY] = true;
                chekcPipeLine(moveX, moveY);
                if (isFinish) return;
            }
        }
    }
}
