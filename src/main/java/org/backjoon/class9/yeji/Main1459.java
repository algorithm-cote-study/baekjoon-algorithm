package org.backjoon.class9.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 걷기 (실버4)
 */
public class Main1459 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static long solution(BufferedReader br) throws IOException {
        // x,y,w,s
        long[] input = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
        long case1 = (input[0] + input[1]) * input[2];

        long case2 = (input[0] + input[1]) % 2 == 0 ? walkCase1(input[0], input[1], input[3]) : walkCase2(input[0], input[1], input[2], input[3]);
        long case3 = walkCase3(input[0], input[1], input[2], input[3]);
        return Math.min(case1, Math.min(case2, case3));
    }

    private static long walkCase1(long x, long y, long s) {
        return Math.max(x, y) * s;
    }

    private static long walkCase2(long x, long y, long w, long s) {
        return (Math.max(x, y) - 1) * s + w;
    }

    private static long walkCase3(long x, long y, long w, long s) {
        return (Math.min(x, y)) * s + (Math.abs(x - y)) * w;
    }


}
