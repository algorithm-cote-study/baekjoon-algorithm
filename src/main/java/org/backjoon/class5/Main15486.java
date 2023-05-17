package org.backjoon.class5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 퇴사2
public class Main15486 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int solution(BufferedReader br) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] result = new int[n + 1];

        for (int day = 1; day <= n; day++) {
            int[] schedules = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int requiredDays = schedules[0];
            int cost = schedules[1];

            int cur = day + requiredDays - 1;
            if (cur < n + 1 && (result[cur] < cost + result[cur - requiredDays])) {
                for (int i = cur; i < n + 1; i++) {
                    result[i] = Math.max(result[i], cost + result[cur - requiredDays]);
                }
            }

        }

        return result[n];
    }

}
