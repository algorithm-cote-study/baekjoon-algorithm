package org.backjoon.week31.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

// 촌수계산
public class Main2644 {
    private static ArrayList<ArrayList<Integer>> graph;
    private static boolean[] visited;
    private static int result;

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(solution(br));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int solution(BufferedReader br) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int[] searchFamily = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int M = Integer.parseInt(br.readLine());
        result = 0;
        graph = new ArrayList<>();
        visited = new boolean[N + 1];
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int parent = Integer.parseInt(st.nextToken());
            int child = Integer.parseInt(st.nextToken());
            graph.get(parent).add(child);
            graph.get(child).add(parent);
        }
        dfs(searchFamily[0], searchFamily[1], 0);
        return result == 0 ? -1 : result;
    }

    private static void dfs(int idx, int find, int cnt) {
        visited[idx] = true;
        for (int i : graph.get(idx)) {
            if (!visited[i]) {
                if (i == find) {
                    result = cnt + 1;
                    return;
                }
                dfs(i, find, cnt + 1);
            }
        }
    }
}
