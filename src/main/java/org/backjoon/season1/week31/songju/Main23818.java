package org.backjoon.season1.week31.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 원수의 원수
public class Main23818 {
    private static int [] parent;

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(solution(br));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String solution(BufferedReader br) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder result = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        parent = new int [N*2+2]; //1-N 친구 N+1-2N 원수
        for (int i = 0; i < N*2+2; i++) {
            parent[i] = i;
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int relation = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(relation ==0){
                union(a, b);
                union(N+a, N+b);
            } else {
                union(a, N+b);
                union(N+a, b);
            }
        }

        for(int i=0;i<K;i++){
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            boolean isFriends = find(a) == find(b);
            boolean isEnemy = find(a) == find(N+b);
            if(!isFriends && !isEnemy) result.append("Unknown");
            else if(isFriends && isEnemy) result.append("Error");
            else if(isFriends) result.append("Friend");
            else if(isEnemy) result.append("Enemy");
            result.append("\n");
        }

        return result.toString();
    }

    private static int find(int a){
        if(parent[a] == a) return a;
        return parent[a] = find(parent[a]);
    }

    private static void union(int a, int b){
        parent[find(b)] = parent[find(a)];
    }
}
