package org.backjoon.class2.seunggu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

/**
 * 큐 ( 실버 4 )
 */
public class Main10845 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(solution(reader));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static String solution(BufferedReader reader) throws IOException {
        int count = Integer.parseInt(reader.readLine());
        Deque<Integer> deque = new LinkedList<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < count; i++) {
            String command = reader.readLine();
            switch (command) {
                case "pop" -> {
                    if (deque.isEmpty()) stringBuilder.append(-1);
                    else stringBuilder.append(deque.pop());
                }
                case "front" -> {
                    if (deque.isEmpty()) stringBuilder.append(-1);
                    else stringBuilder.append(deque.peek());
                }
                case "size" -> stringBuilder.append(deque.size());
                case "empty" -> stringBuilder.append(deque.isEmpty() ? 1 : 0);
                case "back" -> {
                    if (deque.isEmpty()) stringBuilder.append(-1);
                    else stringBuilder.append(deque.peekLast());
                }
                default -> {
                    String[] splitCommand = command.split(" ");
                    deque.add(Integer.parseInt(splitCommand[1]));
                    continue;
                }
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

}
