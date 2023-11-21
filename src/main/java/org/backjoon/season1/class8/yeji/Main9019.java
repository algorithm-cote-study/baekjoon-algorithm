package org.backjoon.season1.class8.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

/**
 * DSLR (골드4)
 */
public class Main9019 {


    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static String solution(BufferedReader br) throws IOException {
        StringBuilder answer = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            boolean[] visited = new boolean[10000];
            answer.append(findDSLR(br, visited)).append("\n");
        }
        return answer.toString();
    }

    private static String findDSLR(BufferedReader br, boolean[] visited) throws IOException {
        StringBuilder result = new StringBuilder();
        String[] input = br.readLine().split(" ");
        int compare = Integer.parseInt(input[1]);
        int data = Integer.parseInt(input[0]);
        visited[data] = true;
        Deque<Register> queue = new LinkedList<>();
        queue.add(new Register(data, ""));

        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                Register cur = queue.poll();
                if (cur.data == compare) return cur.register;
                validVisited(visited, queue, useD(cur));
                validVisited(visited, queue, useS(cur));
                validVisited(visited, queue, useL(cur));
                validVisited(visited, queue, useR(cur));
            }
        }

        return result.toString();
    }

    private static void validVisited(boolean[] visited, Deque<Register> queue, Register cur) {
        if (!visited[cur.data]) {
            visited[cur.data] = true;
            queue.add(cur);
        }
    }

    private static Register useD(Register cur) {
        return new Register((cur.data * 2) % 10000, cur.register + "D");
    }

    private static Register useS(Register cur) {
        if (cur.data == 0) return new Register(9999, cur.register + "S");
        return new Register(cur.data - 1, cur.register + "S");
    }


    private static Register useL(Register cur) {
        return new Register(cur.data % 1000 * 10 + cur.data / 1000, cur.register + "L");
    }

    private static Register useR(Register cur) {
        return new Register(cur.data % 10 * 1000 + cur.data / 10, cur.register + "R");
    }

    private static class Register {

        private final int data;
        private final String register;

        Register(int data, String register) {
            this.data = data;
            this.register = register;
        }

    }
}
