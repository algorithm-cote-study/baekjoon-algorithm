package org.backjoon.season1.class4.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

//후위 표기식
public class Main1918 {
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
        String expression = br.readLine();
        Deque<Character> deque = new ArrayDeque<>();
        for (int i = 0; i < expression.length(); i++) {
            char exp = expression.charAt(i);
            switch (exp) {
                case '+', '-','*','/' -> {
                    while (!deque.isEmpty() && checkPriority(deque.peekLast()) >= checkPriority(exp))
                        result.append(deque.pollLast());
                    deque.offer(exp);
                }
                case '(' -> deque.offer(exp);
                case ')' -> {
                    while (!deque.isEmpty() && deque.peekLast() != '(')
                        result.append(deque.pollLast());
                    deque.pollLast();
                }
                default -> result.append(exp);
            }
        }
        while(!deque.isEmpty()) {
            result.append(deque.pollLast());
        }
        return result.toString();
    }

    static int checkPriority(char exp) {
        return switch (exp) {
            case '+', '-' -> 1;
            case '*', '/' -> 2;
            default -> 0;
        };
    }
}
