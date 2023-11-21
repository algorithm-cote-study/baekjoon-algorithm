package org.backjoon.season1.class3.seunggu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main1717 {


    private static int[] unf;

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(solution(reader));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static String solution(BufferedReader reader) throws IOException {
        int[] array = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = array[0];
        int m = array[1];
        unf = new int[n + 1];
        for (int i = 1; i <= n; i++) unf[i] = i;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < m; i++) {
            array = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (array[0] == 0) union(array[1], array[2]);
            else {
                if (find(unf[array[1]]) == find(unf[array[2]])) stringBuilder.append("YES");
                else stringBuilder.append("NO");
                stringBuilder.append("\n");
            }
        }
        return stringBuilder.toString().trim();
    }

    public static void union(int a, int b) {
        int findA = find(a);
        int findB = find(b);
        if (findA != findB) unf[findB] = findA;
    }

    public static int find(int v) {
        if (unf[v] == v) return v;
        unf[v] = find(unf[v]);
        return unf[v];
    }


}
