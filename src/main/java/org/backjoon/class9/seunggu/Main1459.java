package org.backjoon.class9.seunggu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 걷기
 */
public class Main1459 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static long solution(BufferedReader reader) throws IOException {
        long[] array = Arrays.stream(reader.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
        long x = array[0];
        long y = array[1];
        long w = array[2];
        long s = array[3];

        long cost1 = (x + y) * w;
        long cost2;
        if ((x + y) % 2 == 0) cost2 = Math.max(x, y) * s;
        else cost2 = (Math.max(x, y) - 1) * s + w;
        long cost3 = (Math.min(x, y)) * s + (Math.abs(x - y)) * w;
        return Math.min(cost1, Math.min(cost2, cost3));
    }
}
