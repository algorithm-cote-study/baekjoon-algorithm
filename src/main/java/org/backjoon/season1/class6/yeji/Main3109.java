package org.backjoon.season1.class6.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 골드2 빵집
 */
public class Main3109 {

    private static boolean[][] visited;
    private static final int[] dy = {1, 1, 1};
    private static final int[] dx = {-1, 0, 1};

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int solution(BufferedReader br) throws IOException {
        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String[][] map = new String[input[0]][input[1]];
        visited = new boolean[input[0]][input[1]];
        int result = 0;
        for (int i = 0; i < input[0]; i++) {
            map[i] = br.readLine().split("");
        }

        for (int i = 0; i < input[0]; i++) {
            if (dfs(map, i, 0)) {
                result++;
            }
        }

        return result;
    }

    private static boolean dfs(String[][] map, int x, int y) {
        for (int i = 0; i < 3; i++) {
            int cx = x + dx[i];
            int cy = y + dy[i];
            if (cx >= 0 && cx < map.length && cy < map[0].length && map[cx][cy].equals(".") && (!visited[cx][cy])) {
                visited[cx][cy] = true;
                if (cy == map[0].length - 1) return true;
                if (dfs(map, cx, cy)) return true;
            }
        }
        return false;
    }


}
