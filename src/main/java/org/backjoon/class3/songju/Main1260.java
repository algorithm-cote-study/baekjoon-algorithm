package org.backjoon.class3.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//DFS와 BFS
public class Main1260 {

    static boolean[][] nodeTreeArr;
    static boolean[] visited;
    static StringBuilder result;

    static int node;
    static int line;
    static int startNode;

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(solution(br));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String solution(BufferedReader br) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        node = Integer.parseInt(st.nextToken());
        line = Integer.parseInt(st.nextToken());
        startNode = Integer.parseInt(st.nextToken());
        nodeTreeArr = new boolean[node + 1][node + 1];
        visited = new boolean[node + 1];

        for (int i = 0; i < line; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            nodeTreeArr[x][y] = nodeTreeArr[y][x] = true;
        }

        result = new StringBuilder();
        dfs(startNode);
        result.append("\n");
        visited = new boolean[node + 1];
        bfs();

        return result.toString();
    }

    static void dfs(int start) {
        visited[start] = true;
        result.append(start).append(" ");
        for (int i = 1; i <= node; i++) {
            if (!visited[i] && nodeTreeArr[start][i]) {
                dfs(i);
            }
        }
    }

    static void bfs() {
        Deque<Integer> queue = new ArrayDeque<>();
        queue.offer(startNode);
        visited[startNode] = true;
        result.append(startNode).append(" ");

        while (!queue.isEmpty()) {
            int tmpNode = queue.poll();
            for (int i = 1; i <= node; i++) {
                if (!visited[i] && nodeTreeArr[tmpNode][i]) {
                    queue.offer(i);
                    visited[i] = true;
                    result.append(i).append(" ");
                }
            }
        }

    }
}
