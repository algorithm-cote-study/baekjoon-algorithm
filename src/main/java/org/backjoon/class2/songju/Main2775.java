package org.backjoon.class2.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//부녀회장이 될테야
public class Main2775 {

    public static void main(String[] args) throws IOException {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(solution(br));
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static String solution(BufferedReader br) throws IOException{
        int num = Integer.parseInt(br.readLine());
        int[] house = new int[num*2];
        String result = "";

        for(int i =  0 ; i < num*2 ; i++) {
            house[i] = Integer.parseInt(br.readLine());
        }

        /*아파트 거주자 수 계산*/
        int [][] apt = new int [15][15];
        for(int j=0;j<15;j++) {
            for(int k=0;k<15;k++) {
                if(j ==0) {
                    apt[j][k] = k+1;
                } else {
                    apt[j][k] = k==0 ? 1 : apt[j][k-1] + apt[j-1][k];
                }
            }
        }

        for(int l=0;l<num;l++) {
            result += String.valueOf(apt[house[l*2]][house[l*2+1]-1]);
            if(l != num-1) result +="\n";
        }

        return result;
    }
}