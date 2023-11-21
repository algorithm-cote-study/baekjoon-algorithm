package org.backjoon.season1.class8.seunggu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main9109 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String solution(BufferedReader reader) throws IOException {
        int count = Integer.parseInt(reader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < count; i++) {
            int[] array = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            String[] command = new String[100001];
            Arrays.fill(command, "");
            boolean[] visited = new boolean[100001];
            Queue<Integer> queue = new LinkedList<>();
            visited[array[0]] = true;
            queue.add(array[0]);
            bfs(command, visited, queue, array[1]);
            stringBuilder.append(command[array[1]]).append("\n");
        }
        return stringBuilder.toString();
    }

    private static void bfs(String[] command, boolean[] visited, Queue<Integer> queue, int b) {
        while (!queue.isEmpty() && !visited[b]) {
            int now = queue.poll();
            checkDSLR(command, visited, queue, now, (2 * now) % 10000, "D");
            checkDSLR(command, visited, queue, now, (now == 0) ? 9999 : now - 1, "S");
            checkDSLR(command, visited, queue, now, (now % 1000) * 10 + now / 1000, "L");
            checkDSLR(command, visited, queue, now, (now % 10) * 1000 + now / 10, "R");
        }
    }

    private static void checkDSLR(String[] command, boolean[] visited, Queue<Integer> queue, int now, int direction, String text) {
        if (!visited[direction]) {
            queue.add(direction);
            visited[direction] = true;
            command[direction] = command[now] + text;
        }
    }

}
