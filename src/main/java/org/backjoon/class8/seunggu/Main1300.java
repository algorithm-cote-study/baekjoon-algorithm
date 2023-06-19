package org.backjoon.class8.seunggu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * K번째 수
 */
public class Main1300 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static long solution(BufferedReader reader) throws IOException {
        int n = Integer.parseInt(reader.readLine());
        int k = Integer.parseInt(reader.readLine());

        long low = 1;
        long high = k;

        while (low < high) {
            long middle = (low + high) / 2;
            long count = 0;
            for (int i = 1; i <= n; i++) {
                count += Math.min(middle / i, n);
            }

            if (k <= count) {
                high = middle;
            } else {
                low = middle + 1;
            }
        }
        return low;
    }
}
