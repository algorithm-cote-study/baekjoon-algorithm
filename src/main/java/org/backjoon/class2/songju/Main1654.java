package org.backjoon.class2.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//랜선 자르기
public class Main1654 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(solution(br));
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static int solution(BufferedReader br) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int [] arr = new int[K];
        int max = 0;
        for(int i=0;i<K;i++){
            arr[i] = Integer.parseInt(br.readLine());
            if(max < arr[i]) max = arr[i];
        }
        int min = 0;
        int mid = 0;
        while(min <= max){
            mid = (min + max)/2; //중간값 구하기
            int cnt =0;
            for(int i=0;i<K;i++){
                cnt += (arr[i]/mid);
            }
            if(cnt < N) { //랜선의 개수가 원하는 수보다 작을 때, max값 감소
                max = mid-1;
            } else if(cnt >= N){    // 랜석의 개수가 원하는 수보다 크거나 같을때, min값 증가
                min = mid+1;
            }
        }
        return min;
    }
}
