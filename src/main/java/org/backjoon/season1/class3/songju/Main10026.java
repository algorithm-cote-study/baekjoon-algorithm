package org.backjoon.season1.class3.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//적록색약
public class Main10026 {
    static boolean visited[][];
    static int N;
    static int dx[] = {0, 1, 0, -1}; //왼쪽 아래 오른쪽 위
    static int dy[] = {1, 0, -1, 0};

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
        visited = new boolean[N][N];
        String[][] normalBoard = new String[N][N];
        String[][] abnormalBoard = new String[N][N];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            normalBoard[i] = line.split("");
            abnormalBoard[i] = line.replaceAll("G", "R").split("");
        }

        result.append(area(normalBoard)).append(" ");
        visited = new boolean[N][N];
        result.append(area(abnormalBoard));

        return result.toString();
    }

    static int area(String[][] board) {
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j]) {
                    searchNearArea(i, j, board[i][j], board);
                    cnt++;
                }
            }
        }
        return cnt;
    }

    static void searchNearArea(int x, int y, String color, String[][] board) {
        if (visited[x][y]) return;

        visited[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && nx < N && ny >= 0 && ny < N && !visited[nx][ny] && board[nx][ny].equals(color))
                searchNearArea(nx, ny, color, board);
        }

    }
}
