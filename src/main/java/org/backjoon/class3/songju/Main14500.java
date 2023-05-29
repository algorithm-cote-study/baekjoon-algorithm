package org.backjoon.class3.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//테트로미노
public class Main14500 {
    private static int[][] board;
    private static boolean[][] visited;
    private static int N, M, max;
    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(solution(br));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int solution(BufferedReader br) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        board = new int[N][M];
        visited = new boolean[N][M];
        max = 0;
        for (int i = 0; i < N; i++) {
            board[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                visited[i][j] = true;
                checkTernomio(i, j, board[i][j], 1);
                visited[i][j] = false;
            }
        }
        return max;
    }

    private static void checkTernomio(int x, int y, int sum, int cnt) {
        if (cnt == 4){
            max = Math.max(max, sum);
            return;
        }

        for (int i = 0; i < 4; i++) {
            int nowX = x + dx[i];
            int nowY = y + dy[i];

            if (nowX >= 0 && nowX < N && nowY >= 0 && nowY < M) {
                if (!visited[nowX][nowY]) {
                    // ㅗ 만들기 위해 2번째 칸에서 탐색 한번 더 진행
                    if (cnt == 2) {
                        visited[nowX][nowY] = true;
                        checkTernomio(x, y, sum + board[nowX][nowY], cnt + 1);
                        visited[nowX][nowY] = false;
                    }
                    visited[nowX][nowY] = true;
                    checkTernomio(nowX, nowY, sum + board[nowX][nowY], cnt + 1);
                    visited[nowX][nowY] = false;
                }
            }
        }
    }
}
