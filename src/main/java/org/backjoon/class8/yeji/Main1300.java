package org.backjoon.class8.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * K번째 수 (골드 2)
 */
public class Main1300 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static long solution(BufferedReader reader) throws IOException {
        int n = Integer.parseInt(reader.readLine());
        int k = Integer.parseInt(reader.readLine());
        long left = 1;
        long right = k;

        while (left < right) {
            long mid = (left + right) / 2;
            
            int count = 0;
            for (int i = 1; i <= n; i++) {
                count += Math.min(mid / i, n);
            }

            if (k <= count) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

}
