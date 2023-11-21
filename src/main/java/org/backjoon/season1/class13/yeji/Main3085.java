package org.backjoon.season1.class13.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 사탕게임 (실버2)
 */
public class Main3085 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int solution(BufferedReader reader) throws IOException {
        int n = Integer.parseInt(reader.readLine());
        int[][] arr = new int[n + 2][n + 2];
        int answer = 0;
        String s;

        for (int i = 1; i <= n; ++i) {
            s = reader.readLine();
            for (int j = 0; j < n; ++j) {
                if (s.charAt(j) == 'C') {
                    arr[i][j + 1] = 1;
                } else if (s.charAt(j) == 'P') {
                    arr[i][j + 1] = 2;
                } else if (s.charAt(j) == 'Z') {
                    arr[i][j + 1] = 3;
                } else if (s.charAt(j) == 'Y') {
                    arr[i][j + 1] = 4;
                }
            }
        }
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= n; ++j) {
                if (arr[i + 1][j] != 0) {
                    swap(arr, i, j, i + 1, j);
                    answer = Math.max(answer, find(arr, arr[i][j], i, j));
                    answer = Math.max(answer, find(arr, arr[i + 1][j], i + 1, j));
                    swap(arr, i, j, i + 1, j);
                }
                if (arr[i][j + 1] != 0) {
                    swap(arr, i, j, i, j + 1);
                    answer = Math.max(answer, find(arr, arr[i][j], i, j));
                    answer = Math.max(answer, find(arr, arr[i][j + 1], i, j + 1));
                    swap(arr, i, j, i, j + 1);
                }
            }
        }

        return answer;
    }

    private static void swap(int[][] arr, int ai, int aj, int bi, int bj) {
        int tmp;
        tmp = arr[ai][aj];
        arr[ai][aj] = arr[bi][bj];
        arr[bi][bj] = tmp;
    }

    private static int moveFind(int[][] arr, int num, int y, int x, int d, int c) {
        if (d == 0) {
            x += -1;
        } else if (d == 1) {
            x += 1;
        } else if (d == 2) {
            y += -1;
        } else if (d == 3) {
            y += 1;
        }
        if (num == arr[y][x]) {
            c = moveFind(arr, num, y, x, d, c + 1);
        }
        return c;
    }

    private static int find(int[][] arr, int num, int y, int x) {
        int ans = 0;
        ans = Math.max(ans, moveFind(arr, num, y, x, 0, 0) + moveFind(arr, num, y, x, 1, 0) + 1);
        ans = Math.max(ans, moveFind(arr, num, y, x, 2, 0) + moveFind(arr, num, y, x, 3, 0) + 1);
        return ans;
    }
}
