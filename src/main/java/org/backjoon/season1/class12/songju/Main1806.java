package org.backjoon.season1.class12.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//부분합
public class Main1806 {
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
        int S = Integer.parseInt(st.nextToken());
        int[] arr = new int[N + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int result = N + 1, start = 0, end = 0, sum = 0;
        while (end <= N) {
            if (sum >= S) {
                sum -= arr[start++];
                result = Math.min(result, (end - start) + 1);
            } else {
                sum += arr[end++];
            }
        }
        return (result == N + 1) ? 0 : result;
    }
}
