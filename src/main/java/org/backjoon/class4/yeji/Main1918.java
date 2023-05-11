package org.backjoon.class4.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

// 후위 표기식
public class Main1918 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(solution(reader));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static String solution(BufferedReader br) throws IOException {
        StringBuilder answer = new StringBuilder();
        char[] inputs = br.readLine().toCharArray();
        Deque<Character> stack = new ArrayDeque<>();

        for (char input : inputs) {
            switch (input) {
                case '+', '-', '*', '/', '(' -> {
                    while (!stack.isEmpty() && priority(stack.peek()) >= priority(input) && '(' != input) {
                        answer.append(stack.pop());
                    }
                    stack.push(input);
                }
                case ')' -> {
                    while (stack.peek() != null && '(' != stack.peek()) {
                        answer.append(stack.pop());
                    }
                    stack.pop();
                }
                default -> answer.append(input);
            }
        }

        while (!stack.isEmpty()) {
            answer.append(stack.pop());
        }

        return answer.toString();
    }

    static int priority(char s) {
        if (s == '(') return -1;
        return s == '+' || s == '-' ? 0 : 1;
    }

}
