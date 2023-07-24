package org.backjoon.class15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 수들의 합2 (실버4)
 */
public class Main2003 {


    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int solution(BufferedReader reader) throws IOException {
        int[] input = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = input[0];
        int m = input[1];
        int[] sequences = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        return countPossibilities(n, m, sequences);
    }

    private static int countPossibilities(int n, int m, int[] sequences) {
        int answer = 0;
        int first = 0;
        int second = first + 1;
        int sum;
        while (first < n) {
            sum = sequences[first];
            while (sum < m && second < n) {
                sum += sequences[second];
                second++;
            }
            if (sum == m) {
                answer++;
            }
            first++;
            second = first + 1;
        }

        return answer;
    }
}
