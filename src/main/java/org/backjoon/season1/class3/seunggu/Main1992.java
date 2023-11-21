package org.backjoon.season1.class3.seunggu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main1992 {

    private static int[][] tree;
    private static StringBuilder stringBuilder;

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int number = Integer.parseInt(reader.readLine());
            stringBuilder = new StringBuilder();
            tree = new int[number][number];
            for (int i = 0; i < number; i++) {
                tree[i] = Arrays.stream(reader.readLine().split("")).mapToInt(Integer::parseInt).toArray();
            }
            quadTree(0, 0, number);
            System.out.println(stringBuilder);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void quadTree(int x, int y, int number) {
        
        if (isPossible(x, y, number)) {
            stringBuilder.append(tree[x][y]);
            return;
        }
        int size = number / 2;
        stringBuilder.append("(");
        quadTree(x, y, size);
        quadTree(x, y + size, size);
        quadTree(x + size, y, size);
        quadTree(x + size, y + size, size);
        stringBuilder.append(")");
    }

    private static boolean isPossible(int x, int y, int number) {
        int n = tree[x][y];
        for (int i = x; i < x + number; i++) {
            for (int j = y; j < y + number; j++) {
                if (n != tree[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }


}
