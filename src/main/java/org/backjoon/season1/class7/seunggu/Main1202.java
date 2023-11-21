package org.backjoon.season1.class7.seunggu;

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
 * 보석도둑 (골드 2 )
 */
public class Main1202 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(solution(reader));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static long solution(BufferedReader reader) throws IOException {
        long answer = 0;
        int[] array = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = array[0];
        int k = array[1];
        List<Jewelry> jewelries = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            array = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            jewelries.add(Jewelry.of(array[0], array[1]));
        }
        Collections.sort(jewelries);
        int[] bags = new int[k];
        for (int i = 0; i < bags.length; i++) {
            bags[i] = Integer.parseInt(reader.readLine());
        }
        Arrays.sort(bags);
        Queue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());

        for(int i=0, next = 0; i < bags.length; i++) {
            while(next < n && jewelries.get(next).weight <= bags[i]) {
                queue.offer(jewelries.get(next++).price);
            }

            if(!queue.isEmpty()) answer += queue.poll();
        }
        return answer;
    }

    static class Jewelry implements Comparable<Jewelry> {
        private final int weight;
        private final int price;

        private Jewelry(int weight, int price){
            this.weight = weight;
            this.price = price;
        }

        public static Jewelry of (int weight, int price) {
            return new Jewelry(weight, price);
        }
        @Override
        public int compareTo(Jewelry o) {
            if(o.weight == this.weight) return o.price - this.price;
            return this.weight - o.weight;
        }
    }
}
