package org.backjoon.season1.class2.seunggu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main1654 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            long rt = solution(reader);
            System.out.println(rt);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static long solution(BufferedReader reader) throws IOException {
        String[] lines = reader.readLine().split(" ");
        int cnt = Integer.parseInt(lines[0]);
        int count = Integer.parseInt(lines[1]);
        int[] array = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        long lt = 1;
        long rt = Arrays.stream(array).max().getAsInt();
        while (lt <= rt) {
            int total = 0;
            long half = (lt + rt) / 2;
            for (int j : array) {
                total += (j / half);
            }
            if (total >= count) {
                lt = half + 1;
            } else {
                rt = half - 1;
            }
        }
        return rt;
    }


}
