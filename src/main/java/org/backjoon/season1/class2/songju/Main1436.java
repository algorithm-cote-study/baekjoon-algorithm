package org.backjoon.season1.class2.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//영화감독 숌
public class Main1436 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(solution(br));
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static int solution(BufferedReader br) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int endNum = 666;
        int cnt = 0;
        while(true){
            if(String.valueOf(endNum).contains("666")) cnt++;
            if(cnt == N) break;
            endNum++;
        }
        return endNum;
    }
}
