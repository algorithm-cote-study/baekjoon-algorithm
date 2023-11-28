package org.backjoon.season2.week47.seunggu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * ZOAC4
 */
public class Main23971 {

    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(solution(reader));
        }catch(IOException e) {
            e.printStackTrace();
        }
    }

    static int solution(BufferedReader reader) throws IOException {
        int[] numbers = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int H = numbers[0];
        int W = numbers[1];
        int N = numbers[2];
        int M = numbers[3];
        return ((H-1) / (N+1) + 1) * ((W - 1) / (M+1) + 1);
    }
}
