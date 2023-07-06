package org.backjoon.class12.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 안전영역 실버1
 */
public class Main2468 {

    private static final int[] dx = {1, 0, -1, 0};
    private static final int[] dy = {0, 1, 0, -1};


    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int solution(BufferedReader reader) throws IOException {
        int n = Integer.parseInt(reader.readLine());

        int[][] arr = new int[n][n];
        int max = 0;
        int maxDepth = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int j = 0; j < arr[i].length; j++) {
                maxDepth = Math.max(maxDepth, arr[i][j]);
            }
        }

        for (int i = 0; i < maxDepth; i++) {
            boolean[][] visited = new boolean[n][n];
            checkSafeLine(i, arr, n, visited);
            max = Math.max(max, checkSafeZoneCount(n, visited));
        }

        return max;
    }

    private static int checkSafeZoneCount(int n, boolean[][] visited) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((!visited[i][j])) {
                    visited[i][j] = true;
                    findArea(i, j, n, visited);
                    count++;
                }
            }
        }

        return count;
    }

    private static void findArea(int x, int y, int n, boolean[][] visited) {

        for (int d = 0; d < dx.length; d++) {
            int cx = dx[d] + x;
            int cy = dy[d] + y;

            if (cx >= 0 && cx < n && cy >= 0 && cy < n && !visited[cx][cy]) {
                visited[cx][cy] = true;
                findArea(cx, cy, n, visited);
            }
        }
    }

    private static void checkSafeLine(int index, int[][] arr, int n, boolean[][] visited) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] <= index) {
                    visited[i][j] = true;
                }
            }
        }
    }

}
