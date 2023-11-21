package org.backjoon.season1.class16.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * N번째 큰 수 (실버2)
 */
public class Main2075 {


    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int solution(BufferedReader reader) throws IOException {
        int n = Integer.parseInt(reader.readLine());
        Queue<Integer> priorirtyQueue = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            int[] input = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int num : input) {
                priorirtyQueue.offer(num);
            }
        }

        int i = 1;
        while (i < n) {
            priorirtyQueue.poll();
            i++;
        }

        return priorirtyQueue.poll();
    }
}
