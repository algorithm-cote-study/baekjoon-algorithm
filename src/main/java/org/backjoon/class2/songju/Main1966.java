package org.backjoon.class2.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//프린터 큐
public class Main1966 {
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(solution(br));
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static String solution(BufferedReader br) throws IOException{
        StringBuilder result = new StringBuilder();
        int num = Integer.parseInt(br.readLine());
        for(int i=0;i<num;i++){

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int cnt = 0;

            st = new StringTokenizer(br.readLine());
            Deque<int[]> queue = new LinkedList<int[]>();
            for(int j=0;j<N;j++){
                queue.offer(new int [] {j, Integer.parseInt(st.nextToken())});
            }
            while(!queue.isEmpty()){
                int [] front = queue.poll();
                boolean flag = true;
                for(int [] next : queue){
                    if(front[1] < next[1]){
                        flag = false;
                        queue.offer(front); break;
                    }
                }
                if(flag){
                    cnt++;
                    if(front[0] == M) break;
                }
            }
            result.append(cnt).append("\n");
        }
        return result.toString();
    }
}
