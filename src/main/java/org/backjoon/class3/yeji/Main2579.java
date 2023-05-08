package org.backjoon.class3.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 계단 오르기
public class Main2579 {

    private static int[] stairs;
    private static int[] compareStairs;

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println(solution(reader));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int solution(BufferedReader br) throws IOException {
        int n = Integer.parseInt(br.readLine());

        stairs = new int[n + 1];
        compareStairs = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            stairs[i] = Integer.parseInt(br.readLine());
        }
        findMaxStair(n);

        return compareStairs[n];
    }

    static void findMaxStair(int n) {
        compareStairs[1] = stairs[1];

        if (n >= 2) {
            compareStairs[2] = stairs[1] + stairs[2];
        }

        for (int i = 3; i <= n; i++) {
            compareStairs[i] = Math.max(compareStairs[i - 2], compareStairs[i - 3] + stairs[i - 1]) + stairs[i];
        }

    }
}
