package org.backjoon.season1.class4.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 1,2,3 더하기
public class Main9095 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(solution(reader));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static String solution(BufferedReader br) throws IOException {
        StringBuilder answer = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] input = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            input[i] = num;
            max = Math.max(max, num);
        }

        int[] result = countNumbers(max);
        for (int num : input) {
            answer.append(result[num]).append("\n");
        }

        return answer.toString();
    }

    private static int[] countNumbers(int num) {
        int[] input = new int[num + 1];
        input[1] = 1;
        input[2] = 2;
        input[3] = 4;

        for (int i = 4; i < num + 1; i++) {
            input[i] = input[i - 1] + input[i - 2] + input[i - 3];
        }

        return input;
    }

}
