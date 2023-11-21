package org.backjoon.season1.class7.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

//보석 도둑
public class Main1202 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(solution(br));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static long solution(BufferedReader br) throws IOException {
        int[] stealInfo = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int N = stealInfo[0];
        int K = stealInfo[1];
        int[][] jewels = new int[N][2];
        int[] bags = new int[K];
        PriorityQueue<int[]> queue = new PriorityQueue<int[]>((e1, e2) -> {
            return e2[1] - e1[1]; //가격으로 내림차순
        });

        for (int i = 0; i < N; i++)
            jewels[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int j = 0; j < K; j++)
            bags[j] = Integer.parseInt(br.readLine());

        Arrays.sort(jewels, (o1, o2) -> {
            return o1[0] == o2[0] ? o2[1] - o1[1] : o1[0] - o2[0];
        });
        Arrays.sort(bags);

        int index = 0;
        long result = 0;
        for (int bag : bags) {
            while (index < N) {
                if (jewels[index][0] > bag) break;
                queue.add(jewels[index]);
                index++;
            }
            if (!queue.isEmpty()) {
                result += queue.poll()[1];
            }
        }

        return result;
    }
}
