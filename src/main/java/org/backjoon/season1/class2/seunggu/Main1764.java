package org.backjoon.season1.class2.seunggu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 듣보잡( 실버 4 )
 */
public class Main1764 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(solution(reader));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static String solution(BufferedReader reader) throws IOException {
        Map<String, Boolean> heard = new HashMap<>();
        Queue<String> queue = new PriorityQueue<>();
        int[] numbers = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < numbers[0]; i++) {
            heard.put(reader.readLine(), true);
        }
        for (int i = 0; i < numbers[1]; i++) {
            String key = reader.readLine();
            if (heard.containsKey(key)) {
                queue.add(key);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(queue.size()).append("\n");
        while (!queue.isEmpty()) {
            stringBuilder.append(queue.poll()).append("\n");
        }
        return stringBuilder.toString();
    }


}
