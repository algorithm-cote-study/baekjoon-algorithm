package org.backjoon.season1.class3.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;


// 최소 힙
public class Main1927 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(solution(reader));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static String solution(BufferedReader br) throws IOException {
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        StringBuilder answer = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());

            if (num == 0) {
                answer.append(priorityQueue.isEmpty() ? "0" : priorityQueue.poll()).append("\n");
            } else {
                priorityQueue.offer(num);
            }

        }

        return answer.toString();
    }
}
