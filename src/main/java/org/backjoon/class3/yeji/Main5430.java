package org.backjoon.class3.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

// AC
public class Main5430 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(solution(reader));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static String solution(BufferedReader br) throws IOException {
        StringBuilder answer = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] languages = br.readLine().split("");
            br.readLine();
            String[] collect = br.readLine().split(",|\\[|\\]");

            answer.append(renewalArrays(languages, collect));


        }
        return answer.toString();
    }

    private static String renewalArrays(String[] languages, String[] collect) {
        Deque<String> deque = new LinkedList<>();

        for (int i = 1; i < collect.length; i++) {
            deque.offer(collect[i]);
        }

        boolean reversed = false;
        for (String lang : languages) {

            if ("R".equals(lang)) {
                reversed = !reversed;
            } else {
                if (deque.isEmpty()) return "error\n";
                if (reversed) {
                    deque.pollLast();
                } else {
                    deque.pollFirst();
                }
            }

        }

        return createArray(deque, reversed);
    }

    private static String createArray(Deque<String> deque, boolean reversed) {
        StringBuilder answer = new StringBuilder();
        answer.append("[");
        while (deque.size() > 1) {
            answer.append(reversed ? deque.pollLast() : deque.pollFirst()).append(",");
        }
        answer.append(!deque.isEmpty() ? deque.poll() : "");
        answer.append("]").append("\n");
        return answer.toString();
    }

}
