package org.backjoon.class7.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

//네트워크 연결
public class Main1922 {
    private static int [] parent;
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(solution(br));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int solution(BufferedReader br) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        PriorityQueue<Edge> queue = new PriorityQueue<>();
        parent = new int[N+1];
        for(int i=1;i<=N;i++){
            parent[i] = i;
        }
        for(int i=0;i<M;i++){
            int [] edgeInfo = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            queue.offer(new Edge(edgeInfo[0], edgeInfo[1], edgeInfo[2]));
        }
        int result = 0;
        while(!queue.isEmpty()) {
            Edge edge = queue.poll();
            int parentV1 = find(edge.v1);
            int parentV2 = find(edge.v2);
            if(parentV1 != parentV2) {
                union(parentV1, parentV2);
                result += edge.cost;
            }
        }
        return result;
    }
    private static class Edge implements Comparable<Edge> {
        int v1;
        int v2;
        int cost;
        Edge(int v1, int v2, int cost) {
            this.v1 = v1;
            this.v2 = v2;
            this.cost = cost;
        }
        @Override
        public int compareTo(Edge e) {
            return this.cost - e.cost;
        }
    }

    private static void union(int x, int y) {
        if (x < y) parent[y] = x;
        else parent[x] = y;
    }

    private static int find(int a) {
        if (parent[a] == a)
            return a;
        return parent[a] = find(parent[a]);
    }
}
