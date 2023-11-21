package org.backjoon.season1.class3.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//피보나치 함수
public class Main1003 {
    static Integer [][] fibonacciArr;
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
        int T = Integer.parseInt(br.readLine());
        fibonacciArr = new Integer [41][2];
        fibonacciArr[0][0] = 1;
        fibonacciArr[0][1] = 0;
        fibonacciArr[1][0] = 0;
        fibonacciArr[1][1] = 1;
        for(int i=0;i<T;i++){
            int N = Integer.parseInt(br.readLine());
            for(int j = 2; j <= N; j++){
                if(fibonacciArr[j][0] != null && fibonacciArr[j][1] != null) continue;
                fibonacciArr[j][0] = fibonacciArr[j-1][0] + fibonacciArr[j-2][0];
                fibonacciArr[j][1] = fibonacciArr[j-1][1] + fibonacciArr[j-2][1];
            }
            result.append(fibonacciArr[N][0]).append(" ").append(fibonacciArr[N][1]).append("\n");
        }
        return result.toString();
    }
}
