package org.backjoon.class15.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 내려가기 (골드5)
 */
public class Main2096 {


    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static String solution(BufferedReader reader) throws IOException {
        int n = Integer.parseInt(reader.readLine());
        int[][] map = new int[n][3];

        for (int i = 0; i < n; i++) {
            map[i] = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        int min = findMinMap(map, n);
        int max = findMaxMap(map, n);

        return max + " " + min;
    }

    private static int findMaxMap(int[][] map, int n) {
        int finalFirst = map[0][0];
        int finalSecond = map[0][1];
        int finalThird = map[0][2];
        for (int i = 0; i < n - 1; i++) {
            int first = finalFirst;
            int second = finalSecond;
            int third = finalThird;
            finalFirst = Math.max(first + map[i + 1][0], second + map[i + 1][0]);
            finalSecond = Math.max(third + map[i + 1][1], Math.max(first + map[i + 1][1], second + map[i + 1][1]));
            finalThird = Math.max(second + map[i + 1][2], third + map[i + 1][2]);
        }

        return Math.max(finalFirst, Math.max(finalSecond, finalThird));
    }

    private static int findMinMap(int[][] map, int n) {
        int finalFirst = map[0][0];
        int finalSecond = map[0][1];
        int finalThird = map[0][2];
        for (int i = 0; i < n - 1; i++) {
            int first = finalFirst;
            int second = finalSecond;
            int third = finalThird;
            finalFirst = Math.min(first + map[i + 1][0], second + map[i + 1][0]);
            finalSecond = Math.min(third + map[i + 1][1], Math.min(first + map[i + 1][1], second + map[i + 1][1]));
            finalThird = Math.min(second + map[i + 1][2], third + map[i + 1][2]);
        }

        return Math.min(finalFirst, Math.min(finalSecond, finalThird));
    }

}
