package org.backjoon.class4.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 집합의 표현
public class Main1717 {

    private static int[] data;

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(solution(reader));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static String solution(BufferedReader br) throws IOException {
        StringBuilder answer = new StringBuilder();
        int[] ziphops = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        data = new int[ziphops[0] + 1];
        for (int i = 1; i < data.length; i++) {
            data[i] = i;
        }

        for (int i = 0; i < ziphops[1]; i++) {
            int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (array[0] == 0) {
                union(array[1], array[2]);
            } else {
                answer.append(checkAggregation(array[1], array[2])).append("\n");
            }
        }
        return answer.toString();
    }

    private static String checkAggregation(int a, int b) {
        return find(a) != find(b) ? "NO" : "YES";
    }

    private static void union(int a, int b) {
        int fa = find(a);
        int fb = find(b);
        if (fa != fb) data[fb] = fa;
    }

    private static int find(int a) {
        return data[a] == a ? a : (data[a] = find(data[a]));
    }
}
