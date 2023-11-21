package org.backjoon.season1.class10.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//알파벳
public class Main1987 {
    private static char [][] board;
    private static boolean[] visited;
    private static int R, C, result;
    private static final int[] dx = {-1, 0, 1, 0};
    private static final int[] dy = {0, 1, 0, -1};
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
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        board = new char[R][C];
        visited = new boolean[26];
        result = 0;
        for(int i=0;i<R;i++){
            board[i] = br.readLine().toCharArray();
        }
        dfs(0,0,1);
        return result;
    }

    private static void dfs(int x, int y, int cnt){
        visited[board[x][y]-'A'] = true;
        result = Math.max(result, cnt);
        for (int i = 0; i < 4; i++) {
            int moveX = x + dx[i];
            int moveY = y + dy[i];
            if (moveX >= 0 && moveX < R && moveY >= 0  && moveY < C && !visited[board[moveX][moveY]-'A']) {
                dfs(moveX, moveY, cnt + 1);
                visited[board[moveX][moveY]-'A'] = false;
            }
        }
    }
}
