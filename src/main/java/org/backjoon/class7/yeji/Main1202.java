package org.backjoon.class7.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 보석 도둑 (골드2)
 */
public class Main1202 {


    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static long solution(BufferedReader br) throws IOException {
        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Stone[] stones = new Stone[input[0]];
        for (int i = 0; i < input[0]; i++) {
            int[] stoneInfo = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            stones[i] = new Stone(stoneInfo[0], stoneInfo[1]);
        }
        Arrays.sort(stones);

        List<Integer> bagList = new ArrayList<>();
        for (int i = 0; i < input[1]; i++) {
            bagList.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(bagList);

        return findMaxCost(bagList, input[0], stones);
    }

    // 가방무게, 돌개수, 돌
    private static long findMaxCost(List<Integer> bagList, int n, Stone[] stones) {
        long result = 0;

        Queue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
        int i = 0;
        for (Integer integer : bagList) {
            while (i < n && stones[i].weight <= integer) {
                priorityQueue.offer(stones[i++].cost);
            }
            result += !priorityQueue.isEmpty() ? priorityQueue.poll() : 0;
        }
        return result;
    }

    static class Stone implements Comparable<Stone> {

        private final int weight;
        private final int cost;

        Stone(int weight, int cost) {
            this.weight = weight;
            this.cost = cost;
        }

        @Override
        public int compareTo(Stone o) {
            if (this.weight == o.weight) return o.cost - this.cost;
            return this.weight - o.weight;
        }
    }

}
