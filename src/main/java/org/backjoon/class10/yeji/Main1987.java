package org.backjoon.class10.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 알파벳 : 골드4
 */
public class Main1987 {


    private static final int[] dx = {1, 0, -1, 0};
    private static final int[] dy = {0, 1, 0, -1};
    private static String[][] map;
    private static int answer;

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int solution(BufferedReader reader) throws IOException {
        int[] input = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = input[0];
        int m = input[1];
        map = new String[n][m];
        answer = 0;
        for (int i = 0; i < n; i++) {
            map[i] = reader.readLine().split("");
        }
        Set<String> hashSet = new HashSet<>();
        hashSet.add(map[0][0]);
        dfs(0, 0, n, m, hashSet, 1);
        return answer;
    }

    private static void dfs(int x, int y, int n, int m, Set<String> hashSet, int count) {

        for (int d = 0; d < dx.length; d++) {
            int cx = dx[d] + x;
            int cy = dy[d] + y;
            if (cx >= 0 && cx < n && cy >= 0 && cy < m && !hashSet.contains(map[cx][cy])) {
                hashSet.add(map[cx][cy]);
                dfs(cx, cy, n, m, hashSet, count + 1);
                hashSet.remove(map[cx][cy]);
            } else {
                answer = Math.max(answer, count);
            }
        }

    }

}
