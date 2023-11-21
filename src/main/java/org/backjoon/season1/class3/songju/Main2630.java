package org.backjoon.season1.class3.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//색종이 만들기
public class Main2630 {
    static int[][] paper;
    static int cntOfWhite = 0;
    static int cntOfBlue = 0;

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(solution(br));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String solution(BufferedReader br) throws IOException {
        int N = Integer.parseInt(br.readLine());
        paper = new int [N][N];

        /* 입력받은 종이 생성 */
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < N; j++) {
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        partition(0, 0, N);

        return cntOfWhite + "\n" + cntOfBlue;
    }

    static void partition(int x, int y, int size) {
        if (checkColor(x, y, size)) {
            if (paper[x][y] == 1) {
                cntOfBlue++;
            } else {
                cntOfWhite++;
            }
            return;
        }

        int halfSize = size / 2;
        partition(x, y, halfSize);                //4등분했을때 2사분면
        partition(x, y + halfSize, halfSize);  //3사분면
        partition(x + halfSize, y, halfSize);  //1사분면
        partition(x + halfSize, y + halfSize, halfSize); //4사분면
    }


    static boolean checkColor(int x, int y, int size) {
        int color = paper[x][y];
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (paper[i][j] != color) {
                    return false;
                }
            }
        }
        return true;
    }
}