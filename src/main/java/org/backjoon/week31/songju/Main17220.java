package org.backjoon.week31.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

// 마약수사대
public class Main17220 {
    private static ArrayList<ArrayList<Integer>> graph;
    private static boolean[] visited;
    private static int result;

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(solution(br));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int solution(BufferedReader br) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        result = 0;
        graph = new ArrayList<>();
        visited = new boolean[N];
        boolean[] nodeChk = new boolean[N];
        for (int i = 0; i < N; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < M; i++) {
            String relation = br.readLine();
            int parent = relation.charAt(0) - 'A';
            int child = relation.charAt(2) - 'A';
            nodeChk[child] = true; //마약을 공급받는 사람 체크
            graph.get(parent).add(child);
        }

        st = new StringTokenizer(br.readLine());
        int searchN = Integer.parseInt(st.nextToken());
        for (int j = 0; j < searchN; j++) {
            visited[st.nextToken().charAt(0) - 'A'] = true; //경찰이 수사중인 공급책 제거
        }

        for (int k = 0; k < N; k++) {
            //마약을 공급받는 사람이 아니고 경찰이 수사중인 공급책이 아닌경우. 즉, 공급책인 경우 탐색 시작
            if (!nodeChk[k] && !visited[k]) dfs(k);
        }

        return result;
    }

    private static void dfs(int v) {
        for (int child : graph.get(v)) {
            if (!visited[child]) {
                visited[child] = true;
                result++;
                dfs(child);
            }
        }
    }
}
