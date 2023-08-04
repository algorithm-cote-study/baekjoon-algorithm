package org.backjoon.class16.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// List of Unique Numbers
public class Main13144 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(solution(br));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static long solution(BufferedReader br) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int [] arr = new int[N+1];
        int [] cnt = new int[100000 + 1];
        int start =1, end=0;
        long result = 0;
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 1; i <= N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        while(start<=N){
            while(end+1<=N && cnt[arr[end+1]]==0){
                end++;
                cnt[arr[end]]++;
            }
            result +=end-start+1;
            cnt[arr[start++]]--;
        }

        return result;
    }
}
