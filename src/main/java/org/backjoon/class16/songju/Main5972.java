package org.backjoon.class16.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// 택배 배송
public class Main5972 {

    private static ArrayList<ArrayList<Node>> graph = new ArrayList<>();
    private static int[] dist = new int[50001];
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(solution(br));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int solution(BufferedReader br) throws IOException {
        int result = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int i=0; i<=N; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            graph.get(a).add(new Node(b,cost));
            graph.get(b).add(new Node(a,cost));
        }
        Arrays.fill(dist, Integer.MAX_VALUE);
        dijst();
        return dist[N];
    }

    private static void dijst(){
        PriorityQueue<Node> queue = new PriorityQueue<>();
        queue.add(new Node(1,0));
        dist[1] = 0;
        while (!queue.isEmpty()){
            Node now = queue.poll();
            for(Node next : graph.get(now.v)){
                if(dist[next.v] > dist[now.v]+next.cost){
                    dist[next.v] =dist[now.v]+next.cost;
                    queue.add(new Node(next.v,dist[next.v]));
                }
            }
        }
    }
    private static class Node implements Comparable<Node> {
        int v;
        int cost;
        public Node(int v, int cost) {
            this.v = v;
            this.cost = cost;
        }

        @Override
        public int compareTo(Node a) {
            return this.cost - a.cost;
        }
    }
}
