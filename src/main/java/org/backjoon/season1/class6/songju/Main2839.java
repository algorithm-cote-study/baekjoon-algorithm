package org.backjoon.season1.class6.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//설탕 배달
public class Main2839 {
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
        int cnt = 0;
        while (true) {
            if (N % 5 == 0) {
                cnt += N / 5;
                break;
            } else if (N < 0) {
                cnt = -1;
                break;
            }
            N -= 3;
            cnt++;
        }
        return cnt;
    }
}
