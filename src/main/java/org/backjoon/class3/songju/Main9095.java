package org.backjoon.class3.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//1, 2, 3 더하기
public class Main9095 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(solution(br));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String solution(BufferedReader br) throws IOException {
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        int [] numOfCases = new int [12];
        numOfCases[1]=1;
        numOfCases[2]=2;
        numOfCases[3]=4;
        for(int i=4;i<12;i++){
            numOfCases[i] = numOfCases[i-1] + numOfCases[i-2]+numOfCases[i-3];
        }
        for(int i=0;i<T;i++){
            sb.append(numOfCases[Integer.parseInt(br.readLine())]).append("\n");
        }
        return sb.toString();
    }
}
