package org.backjoon.season1.class3.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 색종이 만들기
public class Main2630 {

    private static int[][] colorPaper;
    private static final int[] answer = new int[2];

    public static void main(String[] args) {
        try (InputStreamReader in = new InputStreamReader(System.in); BufferedReader br = new BufferedReader(in);) {

            for (int n : solution(br)) {
                System.out.println(n);
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    static int[] solution(BufferedReader br) throws IOException {
        int n = Integer.parseInt(br.readLine());
        colorPaper = new int[n][n];

        for (int i = 0; i < n; i++) {
            colorPaper[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        paper(0, 0, n);

        return answer;
    }

    static void paper(int x, int y, int n) {
        int color = colorPaper[x][y];
        boolean flag = true;
        for (int i = x; i < x + n; i++) {
            for (int j = y; j < y + n; j++) {
                if (color != colorPaper[i][j]) {
                    flag = false;
                    break;
                }
            }
        }
        if (flag) {
            answer[color]++;
            return;
        }
        if (n == 1) {
            answer[color]++;
        }

        int size = n / 2;
        for (int i = x; i < x + n; i += size) {
            for (int j = y; j < y + n; j += size) {
                paper(i, j, size);
            }
        }

    }

}
