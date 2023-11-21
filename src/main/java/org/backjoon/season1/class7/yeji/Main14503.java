package org.backjoon.season1.class7.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 로봇청소기 (골드5)
 */
public class Main14503 {

    private static int[][] map;
    private static final int[] dx = {-1, 0, 1, 0};  // 북동남서
    private static final int[] dy = {0, 1, 0, -1};
    private static int answer;

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int solution(BufferedReader br) throws IOException {
        answer = 1;
        int[] size = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] start = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        map = new int[size[0]][size[1]];
        for (int i = 0; i < size[0]; i++) {
            map[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        dfs(start[0], start[1], start[2], size[0], size[1]);
        return answer;
    }

    public static void dfs(int r, int c, int direction, int x, int y) {
        map[r][c] = -1;

        for (int i = 0; i < 4; i++) {
            direction = (direction + 3) % 4;
            int ny = r + dx[direction];
            int nx = c + dy[direction];
            if (ny >= 0 && ny < x && nx >= 0 && nx < y && map[ny][nx] == 0) {
                answer++;
                dfs(ny, nx, direction, x, y);
                return;
            }
        }

        int back = (direction + 2) % 4;
        int by = r + dx[back];
        int bx = c + dy[back];
        if (by >= 0 && by < x && bx >= 0 && bx < y && map[by][bx] != 1) {
            dfs(by, bx, direction, x, y);
        }
    }
}
