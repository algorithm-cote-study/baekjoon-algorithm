package org.backjoon.season1.class5.seunggu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/**
 * DFS와 BFS ( 실버 2 )
 */
public class Main1260 {

    private static boolean[] visited;
    private static boolean[][] board;
    private static StringBuilder stringBuilder;

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(solution(reader));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static String solution(BufferedReader reader) throws IOException {
        int[] array = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        board = new boolean[array[0] + 1][array[0] + 1];
        for (int i = 0; i < array[1]; i++) {
            int[] arr = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            board[arr[0]][arr[1]] = board[arr[1]][arr[0]] = true;
        }
        visited = new boolean[array[0] + 1];
        stringBuilder = new StringBuilder();
        dfs(array[2], array[0]);
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        visited = new boolean[array[0] + 1];
        stringBuilder.append("\n");
        bfs(array[2], array[0]);
        return stringBuilder.toString();
    }

    private static void bfs(int start, int n) {
        Deque<Integer> deque = new LinkedList<>();
        deque.add(start);
        visited[start] = true;
        while (!deque.isEmpty()) {
            int pop = deque.pop();
            stringBuilder.append(pop).append(" ");
            for (int i = 1; i <= n; i++) {
                if (!visited[i] && board[pop][i]) {
                    visited[i] = true;
                    deque.add(i);
                }
            }
        }

    }

    private static void dfs(int start, int n) {
        visited[start] = true;
        stringBuilder.append(start).append(" ");
        for (int i = 1; i <= n; i++) {
            if (!visited[i] && board[start][i]) {
                dfs(i, n);
            }
        }

    }


}
