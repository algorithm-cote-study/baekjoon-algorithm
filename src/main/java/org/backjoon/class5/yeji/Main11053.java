package org.backjoon.class5.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 가장 긴 증가하는 부분 수열
public class Main11053 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int solution(BufferedReader br) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] sequences = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] result = new int[n];
        Arrays.fill(result, 1);

        int max = 0;
        for (int i = 0; i < n; i++) {
            result[i] += findMaxSequenceCount(sequences, result, i);
            max = Math.max(max, result[i]);
        }

        return max;
    }

    private static int findMaxSequenceCount(int[] sequences, int[] result, int i) {
        int max = 0;
        for (int j = 0; j < i; j++) {
            if (sequences[i] > sequences[j]) {
                max = Math.max(max, result[j]);
            }
        }
        return max;
    }
}
