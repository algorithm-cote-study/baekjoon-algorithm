package org.backjoon.class7.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 네트워크 연결
 */
public class Main1922 {

    private static int[] visited;

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int solution(BufferedReader br) throws IOException {
        int computerCount = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        visited = new int[computerCount + 1];

        for (int i = 0; i < visited.length; i++) {
            visited[i] = i;
        }

        Queue<Edge> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            int[] network = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            priorityQueue.offer(new Edge(network[0], network[1], network[2]));
        }

        return findMinCost(priorityQueue);
    }

    private static int findMinCost(Queue<Edge> priorityQueue) {
        int result = 0;

        while (!priorityQueue.isEmpty()) {
            Edge cur = priorityQueue.poll();
            result += union(cur.v1, cur.v2, cur.cost);
        }

        return result;
    }

    private static int union(int a, int b, int cost) {
        int fa = find(a);
        int fb = find(b);
        if (fa != fb) {
            visited[fa] = fb;
            return cost;
        }
        return 0;
    }

    private static int find(int a) {
        if (visited[a] == a) return a;
        visited[a] = find(visited[a]);
        return visited[a];
    }

    static class Edge implements Comparable<Edge> {

        private final int v1;
        private final int v2;
        private final int cost;

        Edge(int v1, int v2, int cost) {
            this.v1 = v1;
            this.v2 = v2;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge o) {
            return this.cost - o.cost;
        }
    }

}
