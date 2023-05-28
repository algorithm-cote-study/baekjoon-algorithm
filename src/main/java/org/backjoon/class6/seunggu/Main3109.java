package org.backjoon.class6.seunggu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 빵집 ( 골드 2 )
 */
public class Main3109 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st = new StringTokenizer(reader.readLine());
            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            String[][] pipeline = new String[r][c];
            for(int i=0; i<r; i++) {
                pipeline[i] = reader.readLine().split("");
            }
            int answer = 0;
            for(int i=0; i<r; i++) {
                pipeline[i][0] = "-";
                if(check(i, 0, pipeline, r, c)) answer++;
            }
            System.out.println(answer);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static boolean check(int x, int y, String[][] pipeline, int r, int c) {
		pipeline[x][y] = "-";
        return isLast(y, c) || isRightUp(x, y, pipeline, r, c) || isRight(x, y, pipeline, r, c) || isRightDown(x, y, pipeline, r, c);
    }

    private static boolean isRightDown(int x, int y, String[][] pipeline, int r, int c) {
        return x + 1 < r && ".".equals(pipeline[x + 1][y + 1]) && check(x + 1, y + 1, pipeline, r, c);
    }

    private static boolean isRight(int x, int y, String[][] pipeline, int r, int c) {
        return ".".equals(pipeline[x][y + 1]) && check(x, y + 1, pipeline, r, c);
    }

    private static boolean isRightUp(int x, int y, String[][] pipeline, int r, int c) {
        return x > 0 && ".".equals(pipeline[x - 1][y + 1]) && check(x - 1, y + 1, pipeline, r, c);
    }

    private static boolean isLast(int y, int c) {
        return y == c - 1;
    }

}
