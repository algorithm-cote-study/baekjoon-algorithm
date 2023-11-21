package org.backjoon.season1.class11.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//공통 부분 문자열
public class Main5582 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(solution(br));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int solution(BufferedReader br) throws IOException {
        char [] S = br.readLine().toCharArray();
        char [] T = br.readLine().toCharArray();
        int [][] dp = new int[T.length+1][S.length+1];
        int maxLen =0;
        for(int i=1;i<=T.length;i++){
            for(int j=1;j<=S.length;j++){
                if(S[j-1] == T[i-1]){
                    dp[i][j] = dp[i-1][j-1] +1;
                    maxLen = Math.max(maxLen, dp[i][j]);
                }
            }
        }
        return maxLen;
    }
}
