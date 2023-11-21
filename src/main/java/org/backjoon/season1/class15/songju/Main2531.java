package org.backjoon.season1.class15.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 회전초밥
public class Main2531 {
    private static int N, D, K, C;
    private static int[] sushi, visited;

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
        N = Integer.parseInt(st.nextToken());
        D = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        sushi = new int[N];
        visited = new int[D + 1];
        for (int i = 0; i < N; i++) {
            sushi[i] = Integer.parseInt(br.readLine());
        }
        return rotationShusiCheck();
    }

    private static int rotationShusiCheck() {
        int cnt = 0;
        int max = 0;
        for (int i = 0; i < K; i++) {
            if (visited[sushi[i]]++ == 0) cnt++;
        }
        for (int i = 0; i < N ; i++) {
            max = Math.max(max, visited[C] == 0 ? cnt + 1 : cnt);
            if (--visited[sushi[i]] == 0) cnt--;
            if (visited[sushi[(i + K) % N]]++ == 0) cnt++;
        }
        return max;
    }
}
