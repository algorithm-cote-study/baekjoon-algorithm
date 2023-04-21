package org.backjoon.class2.seunggu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1018 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine(), " ");
            int n = Integer.parseInt(tokenizer.nextToken());
            int m = Integer.parseInt(tokenizer.nextToken());
            String[][] array = new String[n][m];
            for(int i=0; i<n;i++) {
                array[i] = reader.readLine().split("");
            }
            int answer = Integer.MAX_VALUE;
            for(int i=0; i <= n - 8; i++) {
                for(int j=0; j<= m - 8; j++) {
                    answer = Math.min(answer, getBoard(i, j, array));
                }
            }
            System.out.println(answer);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static int getBoard(int n, int m, String[][] array) {
        String[] compareBoard = new String[]{"WBWBWBWB", "BWBWBWBW"};
        int min = 0;
        for(int i=0; i< 8; i++) {
            int row = n + i;
            String[] compare = compareBoard[i % 2].split("");
            for(int j=0; j< 8; j++) {
                int column = m + j;
                if(!array[row][column].equals(compare[j])) min++;
            }
        }
        return Math.min(min, 64-min);
    }
}

