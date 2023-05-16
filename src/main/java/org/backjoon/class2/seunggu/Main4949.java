package org.backjoon.class2.seunggu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main4949 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            StringBuilder stringBuilder = new StringBuilder();
            while (!(line = reader.readLine()).equals(".")) {
                String[] words = line.split("");
                stringBuilder.append(isBalance(words) ? "YES" : "NO").append("\n");
            }
            System.out.println(stringBuilder);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static boolean isBalance(String[] words) {
        Deque<String> deque = new ArrayDeque<>();
        for (String word : words) {
            switch (word) {
                case ")" -> {
                    if (deque.isEmpty() || !deque.peek().equals("(")) {
                        return false;
                    } else {
                        deque.pop();
                    }
                }
                case "(", "[" -> deque.push(word);
                case "]" -> {
                    if (deque.isEmpty() || !deque.peek().equals("[")) {
                        return false;
                    } else {
                        deque.pop();
                    }
                }
            }
        }
        return deque.isEmpty();
    }


}
