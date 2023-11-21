package org.backjoon.season1.class2.seunggu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 마인크래프트 ( 실버 2 )
 */
public class Main18111 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            Result result = solution(reader);
            System.out.println(result.time() + " " + result.height());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static Result solution(BufferedReader reader) throws IOException {
        int[] arr = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[][] board = new int[arr[0]][arr[1]];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr[0]; i++) {
            String[] words = reader.readLine().split(" ");
            for (int j = 0; j < words.length; j++) {
                int num = Integer.parseInt(words[j]);
                max = Math.max(max, num);
                min = Math.min(min, num);
                board[i][j] = num;
            }
        }
        int time = Integer.MAX_VALUE;
        int height = 0;
        for (int i = min; i <= max; i++) {
            int count = 0;
            int block = arr[2];
            for (int[] num : board) {
                for (int j : num) {
                    if (i < j) {
                        count += ((j - i) * 2);
                        block += (j - i);
                    } else {
                        count += (i - j);
                        block -= (i - j);
                    }
                }
            }
            if (block < 0) break;
            if (time >= count) {
                time = count;
                height = i;
            }
        }
        return new Result(time, height);
    }

    record Result(int time, int height) {}

}
