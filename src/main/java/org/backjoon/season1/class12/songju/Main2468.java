package org.backjoon.season1.class12.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

//안전 영역
public class Main2468 {
    private static final int[] dx = {-1, 0, 1, 0};
    private static final int[] dy = {0, 1, 0, -1};
    private static int[][] area;
    private static boolean[][] visited;
    private static int N;

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
        area = new int[N][N];
        Set<Integer> heightSet = new HashSet<>();
        for (int i = 0; i < N; i++) {
            area[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            heightSet.addAll(Arrays.stream(area[i]).sorted().boxed().collect(Collectors.toSet()));
        }
        int result = 0;
        for (int height : heightSet) {
            visited = new boolean[N][N];
            int safeArea = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (!visited[i][j] && area[i][j] >= height) {
                        dfs(i, j, height);
                        safeArea++;
                    }
                }
            }
            result = Math.max(result, safeArea);
        }
        return result;
    }

    private static void dfs(int x, int y, int height) {
        visited[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int moveX = x + dx[i];
            int moveY = y + dy[i];
            if (moveX >= 0 && moveX < N && moveY >= 0 && moveY < N && !visited[moveX][moveY] && area[moveX][moveY] >= height) {
                dfs(moveX, moveY, height);
            }
        }
    }
}
