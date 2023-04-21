package org.backjoon.class2.seunggu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 괄호 ( 실버 4 )
 */
public class Main9012 {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(solution(reader));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static String solution(BufferedReader reader) throws IOException {
        int count = Integer.parseInt(reader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i<count; i++) {
            String[] words = reader.readLine().split("");
            stringBuilder.append(isParenthesis(words)).append("\n");
        }
        return stringBuilder.toString();
    }

    private static String isParenthesis(String[] words) {
        Deque<String> deque = new ArrayDeque<>();
        for (String word : words) {
            if(word.equals("(")) {
                deque.push(word);
            } else {
                if(deque.isEmpty()) return "NO";
                deque.pop();
            }
        }
        return deque.isEmpty() ? "YES" : "NO";
    }

}
