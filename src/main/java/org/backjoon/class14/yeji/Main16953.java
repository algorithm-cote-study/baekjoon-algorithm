package org.backjoon.class14.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 16953. A->B 실버2
 */
public class Main16953 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int solution(BufferedReader reader) throws IOException {
        int[] input = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int start = input[0];
        int end = input[1];

        return findMaxOperation(start, end);
    }

    private static int findMaxOperation(int start, int end) {
        int count = 1;
        if (start == end) return 0;
        while (start < end) {
            String validLastNumber = String.valueOf(end);
            if (validLastNumber.charAt(validLastNumber.length() - 1) == '1') {
                end = Integer.parseInt(validLastNumber.substring(0, validLastNumber.length() - 1));
            } else {
                if (end % 2 != 0) {
                    return -1;
                }
                end /= 2;
            }
            count++;
        }

        return start == end ? count : -1;
    }
}
