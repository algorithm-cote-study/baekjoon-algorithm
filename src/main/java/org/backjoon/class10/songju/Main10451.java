package org.backjoon.class10.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//순열 사이클
public class Main10451 {
    private static int[] permutation;
    private static boolean[] visited;
    private static int cycle;

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
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            permutation = new int[N + 1];
            visited = new boolean[N + 1];
            cycle = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j < N + 1; j++) {
                permutation[j] = Integer.parseInt(st.nextToken());
            }

            for (int j = 1; j < N + 1; j++) {
                if (!visited[j]) {
                    dfs(j);
                    cycle++;
                }
            }
            result.append(cycle).append("\n");
        }
        return result.toString();
    }

    private static void dfs(int start) {
        visited[start] = true;
        if (!visited[permutation[start]]) {
            dfs(permutation[start]);
        }
    }
}
