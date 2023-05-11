package org.backjoon.class3.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;


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
        PriorityQueue<Integer> pQ = new PriorityQueue<>();
        StringBuilder answer = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        while (n > 0) {
            int i = Integer.parseInt(br.readLine());

            if (i == 0) {
                answer.append(pQ.isEmpty() ? "0\n" : pQ.poll() + "\n");
            } else {
                pQ.offer(i);
            }
            n--;
        }

        return answer.toString();
    }
}
