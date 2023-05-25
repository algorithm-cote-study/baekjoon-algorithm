package org.backjoon.class3.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//종이의 개수
public class Main1780 {
    private static int [][] board;
    private static int [] cnt;
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(solution(br));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String solution(BufferedReader br) throws IOException {
        StringBuilder result = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        board = new int[N][N];
        cnt = new int[3];
        for(int i=0;i<N;i++){
            board[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        divide(0,0, N);
        result.append(cnt[0]).append("\n")
                .append(cnt[1]).append("\n")
                .append(cnt[2]).append("\n");
        return result.toString();
    }

    private static boolean checkSameNum(int x, int y, int size){
        int num = board[x][y];
        for(int i = x;i<x+size;i++){
            for(int j=y;j<y+size;j++){
                if(num != board[i][j]){
                    return false;
                }
            }
        }
        return true;
    }

    private static void divide(int x, int y, int size) {
        if (checkSameNum(x, y, size)) {
            cnt[board[x][y] + 1]++;
        } else {
            int newSize = size / 3;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    divide(x + newSize * i, y + newSize * j, newSize);
                }
            }
        }
    }
}
