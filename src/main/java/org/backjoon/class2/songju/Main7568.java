package org.backjoon.class2.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//덩치
public class Main7568 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(solution(br));
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static String solution(BufferedReader br) throws IOException {
        StringBuilder result = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int [][] arr = new int [N][2];
        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        for(int j=0;j<N;j++){
            int rank = 1;
            for(int k=0;k<N;k++){
                if(j == k) continue;
                if(arr[j][0] < arr[k][0] && arr[j][1] < arr[k][1]){
                    rank++;
                }
            }
            result.append(rank).append(" ");
        }

        return result.toString();
    }
}
