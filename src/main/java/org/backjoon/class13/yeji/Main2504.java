package org.backjoon.class13.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 괄호의 값 (실버1)
 */
public class Main2504 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int solution(BufferedReader reader) throws IOException {
        String input = reader.readLine();

        int mul = 1;
        int result = 0;
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < input.length(); i++) {
            switch (input.charAt(i)) {
                case '(' -> {
                    stack.push('(');
                    mul *= 2;
                }
                case '[' -> {
                    stack.push('[');
                    mul *= 3;
                }
                case ')' -> {
                    if (stack.isEmpty() || stack.peek() != '(') {
                        result = 0;
                        break;
                    }
                    if (input.charAt(i - 1) == '(') result += mul;
                    stack.pop();
                    mul /= 2;
                }
                case ']' -> {
                    if (stack.isEmpty() || stack.peek() != '[') {
                        result = 0;
                        break;
                    }
                    if (input.charAt(i - 1) == '[') result += mul;
                    stack.pop();
                    mul /= 3;
                }
            }
        }

        return !stack.isEmpty() ? 0 : result;
    }
}
