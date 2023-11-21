package org.backjoon.season1.class13.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * iSharp (실버3)
 */
public class Main3568 {

    static String solution(BufferedReader br) throws IOException {
        String[] iSharp = br.readLine().split(",");
        StringBuilder answer = new StringBuilder();
        String start = iSharp[0].split(" ")[0];
        for (int i = 0; i < iSharp.length - 1; i++) {
            String variable = iSharp[i].split(" ")[1];
            answer.append(start).append(findVariable(variable)).append(";").append("\n");
        }
        answer.append(start).append(findVariable(iSharp[iSharp.length - 1].split(" ")[1].replace(";", ""))).append(";");
        return answer.toString();
    }

    private static String findVariable(String variable) {
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < variable.length(); i++) {
            stack.push(variable.charAt(i));
        }
        StringBuilder start = new StringBuilder();
        StringBuilder end = new StringBuilder();
        while (!stack.isEmpty()) {
            char cur = stack.peek();
            if (Character.isAlphabetic(cur)) {
                break;
            }
            if (cur == ']') {
                start.append("[]");
                stack.pop();
                stack.pop();
            } else {
                start.append(stack.pop());
            }
        }

        while (!stack.isEmpty()) {
            end.append(stack.pop());
        }

        return start.append(" ") + end.reverse().toString();
    }

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
