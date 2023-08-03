package org.backjoon.class16.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * List of Unique Numbers
 */
public class Main13144 {


    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int solution(BufferedReader reader) throws IOException {
        int n = Integer.parseInt(reader.readLine());
        int[] input = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int count = 0;

        for (int i = 0; i < n; i++) {
            int j = i + 1;
            count++;
            int[] location = new int[100001];
            location[input[i]] = 1;
            while (j < n) {
                if (location[input[j]] == 1) {
                    break;
                }
                location[input[j]] = 1;
                count++;
                j++;
            }

        }

        return count;
    }
}
