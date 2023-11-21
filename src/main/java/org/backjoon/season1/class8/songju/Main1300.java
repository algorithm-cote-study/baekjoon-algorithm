package org.backjoon.season1.class8.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//K번째 수
public class Main1300 {
    private static int N, K;

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(solution(br));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int solution(BufferedReader br) throws IOException {
        N = Integer.parseInt(br.readLine());
        K = Integer.parseInt(br.readLine());
        return binarySearch();
    }

    private static int binarySearch() {
        int left = 1;
        int right = K;
        int mid = 0;

        while (left <= right) {
            mid = (left + right) / 2;

            long cnt = 0;
            for (int i = 1; i <= N; i++)
                cnt += Math.min(mid / i, N);

            if (cnt < K) left = mid + 1;
            else right = mid - 1;
        }
        return left;
    }
}
