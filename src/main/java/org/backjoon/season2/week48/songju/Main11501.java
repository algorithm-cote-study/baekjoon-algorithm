package org.backjoon.season2.week48.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 주식
public class Main11501 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(solution(br));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String solution(BufferedReader br) throws IOException {
        StringBuffer result = new StringBuffer();
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            int[] days = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int max = days[N - 1];
            long plus = 0;
            for (int j = N - 2; j >= 0; j--) {
                if (days[j] <= max) plus += (max - days[j]);
                else max = days[j];
            }
            result.append(plus).append("\n");
        }
        return result.toString();
    }
}
