package org.backjoon.class2.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//블랙잭
public class Main2798 {
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(solution(br));
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static int solution(BufferedReader br) throws IOException{
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int num = Integer.parseInt(st.nextToken());
        int sum = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        int [] arr = new int [num];
        for(int i=0;i<num;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int max = 0;
        int result = 0;
        for(int i=0;i<num-2;i++){
            for(int j=i+1;j<num-1;j++){
                for(int k=j+1;k<num;k++){
                    result = arr[i]+arr[j]+arr[k];
                    if(result<=sum){
                        if(result == sum) return sum;
                        max = Math.max(max, result);
                    }
                }
            }
        }
        return max;
    }
}
