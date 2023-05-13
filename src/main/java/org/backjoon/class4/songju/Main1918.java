package org.backjoon.class4.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

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
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            char exp = expression.charAt(i);
            switch (exp) {
                case '+', '-','*','/' -> {
                    while (!stack.isEmpty() && checkPriority(stack.peek()) >= checkPriority(exp))
                        result.append(stack.pop());
                    stack.push(exp);
                }
                case '(' -> stack.push(exp);
                case ')' -> {
                    while (!stack.isEmpty() && stack.peek() != '(')
                        result.append(stack.pop());
                    stack.pop();
                }
                default -> result.append(exp);
            }
        }
        while(!stack.isEmpty()) {
            result.append(stack.pop());
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
