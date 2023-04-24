package org.backjoon.class3.seunggu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 계단 오르기 ( 실버 3 )
 */
public class Main2579 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int count = Integer.parseInt(reader.readLine());
            int n = 0;
            Deque<Integer> deque = new ArrayDeque<>();
            StringBuilder stringBuilder = new StringBuilder();
            while (count > 0) {
                int number = Integer.parseInt(reader.readLine());
                if (number > n) {
                    for (int i = n + 1; i <= number; i++) {
                        deque.push(i);
                        stringBuilder.append("+").append("\n");
                    }
                    n = number;
                } else if (deque.peek() != number) {
                    System.out.println("NO");
                    return;
                }
                deque.pop();
                stringBuilder.append("-").append("\n");
                count--;
            }
            System.out.println(stringBuilder);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
