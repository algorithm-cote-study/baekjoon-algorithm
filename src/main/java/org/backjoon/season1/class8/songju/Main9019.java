package org.backjoon.season1.class8.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

//DSLR
public class Main9019 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(solution(br));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String solution(BufferedReader br) throws IOException {
        StringBuilder result = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            result.append(bfs(start, end)).append("\n");
        }
        return result.toString();
    }

    private static String bfs(int start, int end) {
        boolean[] visited = new boolean[10000];
        Deque<Node> q = new ArrayDeque<>();
        q.offer(Node.of(start, ""));
        visited[start] = true;
        String cmd = "";
        while (!q.isEmpty()) {
            Node now = q.poll();
            if (now.num == end) {
                cmd = now.cmd;
                break;
            }
            int D = now.D(), S = now.S(), L = now.L(), R = now.R();

            if (!visited[D]) {
                q.add(Node.of(D, now.cmd + "D"));
                visited[D] = true;
            }
            if (!visited[S]) {
                q.add(Node.of(S, now.cmd + "S"));
                visited[S] = true;
            }
            if (!visited[L]) {
                q.add(Node.of(L, now.cmd + "L"));
                visited[L] = true;
            }
            if (!visited[R]) {
                q.add(Node.of(R, now.cmd + "R"));
                visited[R] = true;
            }
        }
        return cmd;
    }

    private static class Node {
        private int num;
        private String cmd;

        private Node(int num, String cmd) {
            this.num = num;
            this.cmd = cmd;
        }

        public static Node of(int num, String cmd) {
            return new Node(num, cmd);
        }

        int D() { return (2 * num) % 10000; }

        int S() { return num == 0 ? 9999 : num - 1; }

        int L() { return num % 1000 * 10 + num / 1000; }

        int R() { return num % 10 * 1000 + num / 10; }

    }
}
