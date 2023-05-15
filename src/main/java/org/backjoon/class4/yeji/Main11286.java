package org.backjoon.class4.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

// 절댓값 힙
public class Main11286 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(solution(reader));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static String solution(BufferedReader br) throws IOException {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(((o1, o2) -> {
            if (Math.abs(o1) == Math.abs(o2)) return Integer.compare(o1, o2);
            return Integer.compare(Math.abs(o1), Math.abs(o2));
        }));
        int n = Integer.parseInt(br.readLine());
        StringBuilder answer = new StringBuilder();

        while (n > 0) {
            int num = Integer.parseInt(br.readLine());

            if (num == 0) {
                answer.append(popData(priorityQueue)).append("\n");
            } else {
                priorityQueue.offer(num);
            }

            n--;
        }

        return answer.toString();
    }

    private static String popData(PriorityQueue<Integer> priorityQueue) {
        return priorityQueue.isEmpty() ? "0" : priorityQueue.poll().toString();
    }

}
