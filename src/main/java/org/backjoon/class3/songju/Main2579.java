package org.backjoon.class3.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//계단 오르기
public class Main2579 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(solution(br));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int solution(BufferedReader br) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int [] stairs = new int[N+1];
        int [] sumStairs = new int[N+1];
        for(int i=1;i<=N;i++){
            stairs[i] = Integer.parseInt(br.readLine());
        }
        sumStairs[1] = stairs[1];
        if(N>=2)
            sumStairs[2] = stairs[1] + stairs[2];

        for(int i=3; i<=N; i++){
            sumStairs[i] = Math.max(sumStairs[i - 2], sumStairs[i - 3] + stairs[i - 1]) + stairs[i];
        }

        return sumStairs[N];
    }
}
