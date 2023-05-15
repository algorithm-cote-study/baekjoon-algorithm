package org.backjoon.class5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 가장 긴 감소하는 부분 수열
public class Main11722 {


    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int solution(BufferedReader br) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] result = new int[n];

        int i = 1;
        int max = 1;
        result[0] = 1;
        while (i < n) {
            result[i] = 1;
            for (int j = 0; j < i; j++) {
                // 현재 값 보다 과거 값이 더 큰 경우
                if (input[j] > input[i] && (result[j] + 1 > result[i])) {
                    result[i] = result[j] + 1;
                    max = Math.max(max, result[i]);
                }

            }

            i++;
        }

        return max;
    }
}
