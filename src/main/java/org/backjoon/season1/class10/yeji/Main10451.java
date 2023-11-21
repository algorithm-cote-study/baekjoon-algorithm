package org.backjoon.season1.class10.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 순열 사이클 : 실버3
 */
public class Main10451 {

    private static int[] dp;
    private static int count;

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(solution(br));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static String solution(BufferedReader br) throws IOException {
        int testCases = Integer.parseInt(br.readLine());
        StringBuilder totalCyclesCount = new StringBuilder();

        for (int i = 0; i < testCases; i++) {
            int permutationSize = Integer.parseInt(br.readLine());
            int[] permutationArray = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            totalCyclesCount.append(countPermutationCycles(permutationSize, permutationArray)).append("\n");
        }

        return totalCyclesCount.toString();
    }

    private static int countPermutationCycles(int permutationSize, int[] permutationArray) {
        dp = new int[permutationSize + 1];
        count = 0;
        for (int i = 0; i < dp.length; i++) {
            dp[i] = i;
        }

        for (int i = 1; i <= permutationSize; i++) {
            union(i, permutationArray[i - 1]);
        }
        return count;
    }

    private static void union(int a, int b) {
        int fa = find(a);
        int fb = find(b);
        if (fa != fb) {
            dp[fa] = fb;
        } else {
            count++;
        }
    }

    private static int find(int a) {
        if (dp[a] == a) return a;
        dp[a] = find(dp[a]);
        return dp[a];
    }

}
