package org.backjoon.class3.seunggu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class Main7662 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println(solution(reader));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static String solution(BufferedReader reader) throws IOException {
        int count = Integer.parseInt(reader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < count; i++) {
            calculate(reader, stringBuilder);
        }
        return stringBuilder.toString().trim();
    }

    private static void calculate(BufferedReader reader, StringBuilder stringBuilder) throws IOException {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        int count = Integer.parseInt(reader.readLine());
        for (int i = 0; i < count; i++) {
            String[] words = reader.readLine().split(" ");
            String direction = words[0];
            int number = Integer.parseInt(words[1]);
            if (direction.equals("I")) {
                treeMap.put(number, treeMap.getOrDefault(number, 0) + 1);
            } else if (number == -1) {
                if (!treeMap.isEmpty()) {
                    int num = treeMap.get(treeMap.firstKey());
                    if (num == 1) treeMap.remove(treeMap.firstKey());
                    else treeMap.put(treeMap.firstKey(), num - 1);
                }
            } else if (!treeMap.isEmpty()) {
                int num = treeMap.get(treeMap.lastKey());
                if (num == 1) treeMap.remove(treeMap.lastKey());
                else treeMap.put(treeMap.lastKey(), num - 1);
            }
        }
        if (treeMap.isEmpty()) stringBuilder.append("EMPTY");
        else stringBuilder.append(treeMap.lastKey()).append(" ").append(treeMap.firstKey());
        stringBuilder.append("\n");
    }


    private static void calculate2(BufferedReader reader, StringBuilder stringBuilder) throws IOException {
        PriorityQueue<Integer> min = new PriorityQueue<>();
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
        int count = Integer.parseInt(reader.readLine());
        for (int i = 0; i < count; i++) {
            String[] words = reader.readLine().split(" ");
            String direction = words[0];
            int number = Integer.parseInt(words[1]);
            if (direction.equals("I")) {
                min.offer(number);
                max.offer(number);
            } else {
                if (number == -1) {
                    if (!min.isEmpty()) {
                        int poll = min.poll();
                        max.remove(poll);
                    }
                } else {
                    if (!max.isEmpty()) {
                        int poll = max.poll();
                        min.remove(poll);
                    }
                }
            }
        }
        if (max.isEmpty()) stringBuilder.append("EMPTY");
        else stringBuilder.append(max.poll()).append(" ").append(min.poll());
        stringBuilder.append("\n");

    }

    private static void calculate1(BufferedReader reader, StringBuilder stringBuilder) throws IOException {
        Deque<Integer> deque = new ArrayDeque<>();
        int count = Integer.parseInt(reader.readLine());
        for (int i = 0; i < count; i++) {
            String[] words = reader.readLine().split(" ");
            String direction = words[0];
            int number = Integer.parseInt(words[1]);
            if ("I".equals(direction)) {
                if (deque.isEmpty()) {
                    deque.add(number);
                } else {
                    int lt = deque.peekFirst();
                    int rt = deque.peekLast();
                    if (lt >= number) {
                        deque.addFirst(number);
                    } else if (rt <= number) {
                        deque.addLast(number);
                    } else if (Math.abs(lt - number) < Math.abs(rt - number)) {
                        Deque<Integer> temp = new ArrayDeque<>();
                        int poll = deque.pollFirst();
                        temp.push(poll);
                        while (poll >= number && !deque.isEmpty()) {
                            poll = deque.pollFirst();
                            temp.push(poll);
                        }
                        deque.addFirst(number);
                        while (!temp.isEmpty()) {
                            deque.addFirst(temp.pop());
                        }
                    } else {
                        Deque<Integer> temp = new ArrayDeque<>();
                        int poll = deque.pollLast();
                        temp.push(poll);
                        while (!deque.isEmpty()) {
                            int peek = deque.peekLast();
                            if (peek < number) break;
                            temp.push(deque.pollLast());
                        }
                        deque.add(number);
                        while (!temp.isEmpty()) {
                            deque.add(temp.pop());
                        }
                    }
                }
            } else if (number == -1) {
                if (!deque.isEmpty()) deque.poll();
            } else if (!deque.isEmpty()) deque.pollLast();
        }
        if (deque.isEmpty()) stringBuilder.append("EMPTY");
        else stringBuilder.append(deque.peekLast()).append(" ").append(deque.peek());
        stringBuilder.append("\n");
    }


}
