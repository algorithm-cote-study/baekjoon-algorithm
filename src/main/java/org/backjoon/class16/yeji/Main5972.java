package org.backjoon.class16.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 택배배송 (골드5)
 */
public class Main5972 {

    private static int[] visited;

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int solution(BufferedReader reader) throws IOException {
        int[] input = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int nodeCount = input[0];
        int edgeCount = input[1];
        visited = new int[nodeCount + 1];

        List<List<Node>> nodes = new ArrayList<>();
        for (int i = 0; i <= nodeCount; i++) {
            nodes.add(new ArrayList<>());
        }

        for (int i = 0; i < edgeCount; i++) {
            int[] nodeInfo = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            nodes.get(nodeInfo[0]).add(new Node(nodeInfo[1], nodeInfo[2]));
            nodes.get(nodeInfo[1]).add(new Node(nodeInfo[0], nodeInfo[2]));
        }
        Arrays.fill(visited, Integer.MAX_VALUE);
        visited[1] = 0;

        priority(nodes);

        return visited[nodeCount];
    }

    private static void priority(List<List<Node>> nodes) {
        Queue<Node> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(new Node(1, 0));

        while (!priorityQueue.isEmpty()) {
            Node current = priorityQueue.poll();

            for (Node node : nodes.get(current.edge)) {
                if (visited[node.edge] > visited[current.edge] + node.amount) {
                    visited[node.edge] = visited[current.edge] + node.amount;
                    priorityQueue.offer(new Node(node.edge, visited[node.edge]));
                }
            }

        }

    }

    static class Node implements Comparable<Node> {

        private final int edge;
        private final int amount;

        Node(int edge, int amount) {
            this.edge = edge;
            this.amount = amount;
        }

        @Override
        public int compareTo(Node o) {
            return this.amount - o.amount;
        }
    }
}
