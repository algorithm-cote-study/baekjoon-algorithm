package org.backjoon.season1.class3.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//리모컨
public class Main1107 {
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
        int brokenCnt = Integer.parseInt(br.readLine());
        boolean[] brokenNum = new boolean[10];
        if (brokenCnt != 0) {
            Arrays.stream( br.readLine().split( " " ) ).mapToInt( Integer::parseInt ).forEach( e -> brokenNum[e] = true );
        }

        if (N == 100) return 0;

        int result = Math.abs(100 - N);
        for (int i = 0; i <= 999999; i++) {
            String strNum = String.valueOf(i);
            int len = strNum.length();
            boolean isBroken = false;
            for (int j = 0; j < len; j++) {
                if (brokenNum[strNum.charAt(j) - '0']) {
                    isBroken = true;
                    break;
                }
            }
            if (!isBroken) {
                result = Math.min(result, Math.abs(N - i) + len);
            }
        }
        return result;
    }
}
