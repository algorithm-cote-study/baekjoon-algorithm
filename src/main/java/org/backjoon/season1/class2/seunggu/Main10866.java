package org.backjoon.season1.class2.seunggu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

/**
 * 덱 ( 실버4 )
 */
public class Main10866 {

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
                    pushOrPop(deque, stringBuilder, command);
                    continue;
                }
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    private static void pushOrPop(Deque<Integer> deque, StringBuilder stringBuilder, String command) {
        String[] splitCommand = command.split(" ");
        switch (splitCommand[0]) {
            case "push_front" -> deque.addFirst(Integer.parseInt(splitCommand[1]));
            case "push_back" -> deque.addLast(Integer.parseInt(splitCommand[1]));
            case "pop_front" -> {
                if (deque.isEmpty()) stringBuilder.append(-1);
                else stringBuilder.append(deque.pollFirst());
                stringBuilder.append("\n");
            }
            default -> {
                if (deque.isEmpty()) stringBuilder.append(-1);
                else stringBuilder.append(deque.pollLast());
                stringBuilder.append("\n");
            }
        }
    }

}
