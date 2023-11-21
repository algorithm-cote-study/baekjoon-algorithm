package org.backjoon.season1.class3.seunggu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 후위식연산 1918
 * 골드 2
 */
public class Main1918 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(solution(reader));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static String solution(BufferedReader reader) throws IOException {
        String[] words = reader.readLine().split("");
        Deque<String> deque = new ArrayDeque<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (String word : words) {
            switch (word) {
                case "+", "-", "*", "/" -> {
                    while (!deque.isEmpty() && priority(deque.peek()) >= priority(word)) {
                        stringBuilder.append(deque.pop());
                    }
                    deque.push(word);
                }
                case "(" -> deque.push(word);
                case ")" -> {
                    while (!deque.isEmpty() && !"(".equals(deque.peek())) {
                        stringBuilder.append(deque.pop());
                    }
                    deque.pop();
                }
                default -> stringBuilder.append(word);
            }
        }
        while (!deque.isEmpty()) {
            stringBuilder.append(deque.pop());
        }
        return stringBuilder.toString();
    }

    private static int priority(String word) {
        return switch (word) {
            case "(", ")" -> 1;
            case "+", "-" -> 2;
            case "*", "/" -> 3;
            default -> 0;
        };
    }


}
