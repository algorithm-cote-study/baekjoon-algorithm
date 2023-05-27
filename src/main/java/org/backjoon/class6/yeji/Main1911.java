package org.backjoon.class6.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 흙길 보수하기
 */
public class Main1911 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int solution(BufferedReader br) throws IOException {
        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        List<Puddle> puddles = new ArrayList<>();

        for (int i = 0; i < input[0]; i++) {
            int[] puddle = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            puddles.add(new Puddle(puddle[0], puddle[1]));
        }

        Collections.sort(puddles);
        return puddlesCount(puddles, input[1]);
    }

    private static int puddlesCount(List<Puddle> puddles, int size) {
        int result = 0;
        int range = 0;
        for (Puddle puddle : puddles) {
            if (puddle.start > range) {
                range = puddle.start;
            }

            if (puddle.end > range) {
                while (puddle.end > range) {
                    range += size;
                    result++;
                }
            }
        }

        return result;
    }

    static class Puddle implements Comparable<Puddle> {

        private final int start;
        private final int end;

        Puddle(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Puddle puddle) {
            if (this.start == puddle.start) {
                return this.end - puddle.end;
            }
            return this.start - puddle.start;
        }

    }


}
