package org.backjoon.season1.class5.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

// 1로 만들기
public class Main1463 {


    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(solution(reader));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int solution(BufferedReader br) throws IOException {
        int answer = 0;
        int n = Integer.parseInt(br.readLine());
        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(n, 0));

        while (!queue.isEmpty()) {
            Node cur = queue.poll();
            if (cur.key == 1) return cur.count;
            queue.offer(new Node(cur.key - 1, cur.count + 1));
            if (cur.key % 2 == 0) {
                queue.offer(new Node(cur.key / 2, cur.count + 1));
            }
            if (cur.key % 3 == 0) {
                queue.offer(new Node(cur.key / 3, cur.count + 1));
            }

        }

        return answer;
    }

    static class Node {

        private final int key;
        private final int count;

        Node(int key, int count) {
            this.key = key;
            this.count = count;
        }
    }
}
