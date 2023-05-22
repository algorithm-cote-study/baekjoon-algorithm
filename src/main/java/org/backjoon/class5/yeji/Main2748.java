package org.backjoon.class5.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// DP : 피보나치 수 2
public class Main2748 {


    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static long solution(BufferedReader br) throws IOException {
        int n = Integer.parseInt(br.readLine());

        if (n == 0 || n == 1) return n;

        long first = 0;
        long second = 1;
        for (int i = 2; i <= n; i++) {
            long temp = first + second;
            first = second;
            second = temp;
        }

        return second;
    }


}
