package org.backjoon.season1.class2.seunggu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 제로 ( 실버 4)
 */
public class Main10773 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int count = Integer.parseInt(reader.readLine());
            Deque<Integer> deque = new ArrayDeque<>();
            for (int i = 0; i < count; i++) {
                int number = Integer.parseInt(reader.readLine());
                if (number == 0 && !deque.isEmpty()) {
                    deque.pop();
                } else {
                    deque.push(number);
                }
            }
            int answer = 0;
            while (!deque.isEmpty()) {
                answer += deque.pop();
            }

            System.out.println(answer);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
