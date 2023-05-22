package org.backjoon.class5.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.List;

// DFS와 BFS
public class Main1260 {

    private static int[] dfs;
    private static int[] bfs;

    private static boolean[] visited;
    private static List<List<Integer>> nodeList;

    private static StringBuilder answer;

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static String solution(BufferedReader br) throws IOException {
        answer = new StringBuilder();
        nodeList = new ArrayList<>();
        int[] n = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        bfs = new int[n[0]];
        dfs = new int[n[0]];
        visited = new boolean[n[0] + 1];
        for (int i = 0; i <= n[0]; i++) {
            nodeList.add(new ArrayList<>());
        }

        for (int i = 0; i < n[1]; i++) {
            int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            nodeList.get(input[1]).add(input[0]);
            nodeList.get(input[0]).add(input[1]);
        }

        for (int i = 0; i <= n[0]; i++) {
            Collections.sort(nodeList.get(i));
        }
        dfs(n[2], 0);
        answer.deleteCharAt(answer.length() - 1);
        answer.append("\n");
        visited = new boolean[n[0] + 1];
        bfs(n[2], n[0]);
        return answer.toString();
    }

    private static void bfs(int start, int n) {
        visited = new boolean[n + 1];
        Deque<Integer> queue = new ArrayDeque<>();
        visited[start] = true;
        queue.offer(start);
        while (!queue.isEmpty()) {
            int num = queue.poll();
            answer.append(num).append(" ");
            for (int node : nodeList.get(num)) {
                if (!visited[node]) {
                    visited[node] = true;
                    queue.offer(node);
                }
            }
        }
    }

    private static void dfs(int start, int i) {
        visited[start] = true;
        answer.append(start).append(" ");
        for (int node : nodeList.get(start)) {
            if (!visited[node]) {
                dfs(node, i + 1);
            }
        }
    }
}
