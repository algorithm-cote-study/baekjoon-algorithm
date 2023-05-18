package org.backjoon.class5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

// 내리막길
public class Main1520 {


    private static final int[] dx = {0, 0, 1, -1};
    private static final int[] dy = {1, -1, 0, 0};

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static long solution(BufferedReader br) throws IOException {
        int[] mapSize = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[][] matrix = new int[mapSize[0]][mapSize[1]];
        int[][] dp = new int[mapSize[0]][mapSize[1]];
        for (int m = 0; m < mapSize[0]; m++) {
            matrix[m] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        bfs(mapSize[0], mapSize[1], matrix, dp);

        return dp[mapSize[0] - 1][mapSize[1] - 1];
    }

    private static void bfs(int m, int n, int[][] matrix, int[][] visited) {
        Queue<Node> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(new Node(0, 0, matrix[0][0]));
        visited[0][0] = 1;

        while (!priorityQueue.isEmpty()) {
            Node cur = priorityQueue.poll();

            for (int i = 0; i < dx.length; i++) {
                int nx = cur.x + dx[i];
                int ny = cur.y + dy[i];

                if (nx >= 0 && nx < m && ny >= 0 && ny < n && matrix[nx][ny] < matrix[cur.x][cur.y]) {
                    if (visited[nx][ny] == 0) {
                        priorityQueue.offer(new Node(nx, ny, matrix[nx][ny]));
                    }
                    visited[nx][ny] += visited[cur.x][cur.y];
                }

            }

        }
    }

    static class Node implements Comparable<Node> {

        int x;
        int y;

        int height;

        Node(int x, int y, int height) {
            this.x = x;
            this.y = y;
            this.height = height;
        }

        @Override
        public int compareTo(Node node) {
            return node.height - this.height;
        }
    }
}
