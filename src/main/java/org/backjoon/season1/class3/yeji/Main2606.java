package org.backjoon.season1.class3.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// 바이러스
public class Main2606 {

    private static boolean[] visited;

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(solution(reader));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int solution(BufferedReader br) throws IOException {
        int n = Integer.parseInt(br.readLine());
        visited = new boolean[n + 1];

        List<List<Integer>> nodeList = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            nodeList.add(new ArrayList<>());
        }

        int line = Integer.parseInt(br.readLine());
        for (int i = 0; i < line; i++) {
            int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            nodeList.get(input[1]).add(input[0]);
            nodeList.get(input[0]).add(input[1]);
        }

        bfs(1, nodeList);

        return checkVirusComputerCount();
    }

    private static int checkVirusComputerCount() {
        int result = 0;
        for (int i = 1; i < visited.length; i++) {
            if (visited[i]) result++;
        }
        return result - 1;
    }

    private static void bfs(int i, List<List<Integer>> nodeList) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(i);

        while (!queue.isEmpty()) {
            int cur = queue.poll();
            visited[cur] = true;

            for (int n : nodeList.get(cur)) {
                if (!visited[n]) {
                    queue.offer(n);
                }
            }
        }
    }
}

