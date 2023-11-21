package org.backjoon.season1.class5.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

// 뱀과 사다리 게임
public class Main16928 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int solution(BufferedReader br) throws IOException {
        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Map<Integer, Integer> ladder = new HashMap<>();
        for (int i = 0; i < input[0]; i++) {
            int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            ladder.put(array[0], array[1]);
        }
        Map<Integer, Integer> snake = new HashMap<>();
        for (int i = 0; i < input[1]; i++) {
            int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            snake.put(array[0], array[1]);
        }

        return bfs(ladder, snake);
    }

    private static int bfs(Map<Integer, Integer> ladder, Map<Integer, Integer> snake) {
        boolean[] visited = new boolean[101];
        Deque<Integer> deque = new LinkedList<>();
        int answer = 0;

        deque.offer(1);
        while (!deque.isEmpty()) {
            int size = deque.size();

            for (int i = 0; i < size; i++) {
                int cur = deque.poll();

                for (int j = 1; j <= 6; j++) {
                    int target = cur + j;
                    if (target == 100) {
                        return answer + 1;
                    }

                    if (target < 100 && !visited[target]) {
                        if (ladder.containsKey(target)) {
                            deque.offer(ladder.get(target));
                        } else deque.offer(snake.getOrDefault(target, target));
                        visited[target] = true;
                    }
                }
            }
            answer++;
        }

        return answer;
    }
}
