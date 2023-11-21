package org.backjoon.season1.class13.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 괄호의 값
public class Main2504 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(solution(br));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int solution(BufferedReader br) throws IOException {
        Stack<Character> stack = new Stack<>();
        char[] brackets = br.readLine().toCharArray();
        int result = 0;
        int val = 1;
        for (int i = 0; i < brackets.length; i++) {
            char c = brackets[i];
            if (c == '(') {
                stack.push(c);
                val *= 2;
            } else if (c == '[') {
                stack.push(c);
                val *= 3;
            } else if (c == ')') {
                if (stack.isEmpty() || stack.peek() != '(') {
                    result = 0;
                    break;
                } else if (brackets[i - 1] == '(') {
                    result += val;
                }
                stack.pop();
                val /= 2;
            } else if (c == ']') {
                if (stack.isEmpty() || stack.peek() != '[') {
                    result = 0;
                    break;
                } else if (brackets[i - 1] == '[') {
                    result += val;
                }
                stack.pop();
                val /= 3;
            }
        }

        return !stack.isEmpty() ? 0 : result;
    }
}
