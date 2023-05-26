package org.backjoon.class6.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
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
        List<int[]> puddles = new ArrayList<>();

        for (int i = 0; i < input[0]; i++) {
            puddles.add(Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray());
        }

        puddles.sort(((o1, o2) -> {
            if (o1[0] == o2[0]) {
                return o1[1] - o2[1];
            }
            return o1[0] - o2[0];
        }));

        return puddlesCount(puddles, input[1]);
    }

    private static int puddlesCount(List<int[]> puddles, int size) {
        int result = 0;
        int range = 0;
        for (int[] puddle : puddles) {
            if (puddle[0] > range) {
                range = puddle[0];
            }

            if (puddle[1] > range) {
                while (puddle[1] > range) {
                    range += size;
                    result++;
                }
            }
        }

        return result;
    }


}
