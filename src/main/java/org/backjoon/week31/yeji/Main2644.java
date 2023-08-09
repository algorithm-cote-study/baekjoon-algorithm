package org.backjoon.week31.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * 촌수계산 (실버2)
 */
public class Main2644 {

    private static List<List<Relation>> graph;
    private static boolean[] visited;

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int solution(BufferedReader reader) throws IOException {
        int n = Integer.parseInt(reader.readLine());
        int[] target = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int relationCount = Integer.parseInt(reader.readLine());
        graph = new ArrayList<>();
        visited = new boolean[n + 1];

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < relationCount; i++) {
            int[] relation = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            graph.get(relation[0]).add(Relation.from(relation[1], 1));
            graph.get(relation[1]).add(Relation.from(relation[0], 2));
        }

        return findRelationDepth(target);
    }

    private static int findRelationDepth(int[] target) {
        Deque<Relation> queue = new LinkedList<>();
        queue.offer(Relation.from(target[0], 0));
        visited[target[0]] = true;
        while (!queue.isEmpty()) {
            Relation current = queue.poll();
            if (current.node == target[1]) {
                return current.depth;
            }
            List<Relation> relations = graph.get(current.node);
            for (Relation relation : relations) {
                if (!visited[relation.node]) {
                    visited[relation.node] = true;
                    queue.offer(Relation.from(relation.node, current.depth + 1));
                }
            }
        }

        return -1;
    }


    static class Relation {

        private final int node;
        private final int depth;

        Relation(int node, int depth) {
            this.node = node;
            this.depth = depth;
        }

        public static Relation from(int node, int depth) {
            return new Relation(node, depth);
        }
    }
}
