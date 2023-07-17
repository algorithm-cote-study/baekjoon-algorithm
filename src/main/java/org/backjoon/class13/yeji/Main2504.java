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
        int result = 0;
        String arr[] = input.split("");
        if (arr.length % 2 == 1) return result;

        Deque<String> stack = new ArrayDeque<>();
        int tmp = 1;
        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]) {
                case "(" -> {
                    tmp *= 2;
                    stack.push(arr[i]);
                }
                case "[" -> {
                    tmp *= 3;
                    stack.push(arr[i]);
                }
                case ")" -> {
                    if (stack.isEmpty() || !stack.peek().equals("(")) return 0;
                    if (arr[i - 1].equals("(")) result += tmp;
                    stack.pop();
                    tmp /= 2;
                }
                case "]" -> {
                    if (stack.isEmpty() || !stack.peek().equals("[")) return 0;
                    if (arr[i - 1].equals("[")) result += tmp;
                    stack.pop();
                    tmp /= 3;
                }
            }
        }

        return !stack.isEmpty() ? 0 : result;
    }
}
