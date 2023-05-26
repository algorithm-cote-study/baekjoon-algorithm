package org.backjoon.class6.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//문자열 복사
public class Main2195 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(solution(br));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int solution(BufferedReader br) throws IOException {
        String S = br.readLine();
        String P = br.readLine();
        int idx = 0;
        int cnt = 0;
        for (int i = 0; i < P.length(); i++) {
            if (S.indexOf(P.substring(idx, i + 1)) != -1) continue;
            idx = i;
            cnt++;
        }
        return cnt + 1;
    }
}
