package org.backjoon.class2.seunggu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * 요세푸스 문제 0 ( 실버 5 )
 */
public class Main11866 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int[] array = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            Deque<Integer> deque = new ArrayDeque<>();
            for (int i = 1; i <= array[0]; i++) {
                deque.offer(i);
            }
            Deque<Integer> sortedPerson = new ArrayDeque<>();
            while (!deque.isEmpty()) {
                for (int i = 0; i < array[1] - 1; i++) {
                    int popPerson = deque.pop();
                    deque.offer(popPerson);
                }
                sortedPerson.offer(deque.pop());
            }
            StringBuilder stringBuilder = new StringBuilder("<");
            while (!sortedPerson.isEmpty()) {
                stringBuilder.append(sortedPerson.pop()).append(", ");
            }
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            stringBuilder.append(">");
            System.out.println(stringBuilder);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
