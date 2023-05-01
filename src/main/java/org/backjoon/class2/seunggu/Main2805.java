package org.backjoon.class2.seunggu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 나무 자르기 ( 실버 2)
 */
public class Main2805 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(solution(reader));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static int solution(BufferedReader reader) throws IOException {
        int[] numArr = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int total = numArr[1];
        int[] array = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int lt = 1;
        int rt = Arrays.stream(array).max().orElse(Integer.MAX_VALUE);
        while (lt <= rt) {
            long sum = 0;
            int half = (lt + rt) / 2;
            for (int j : array) {
                if (j > half) sum += (j - half);
            }
            if (sum >= total) {
                lt = half + 1;
            } else {
                rt = half - 1;
            }
        }
        return rt;
    }


}

