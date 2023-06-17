package org.backjoon.class9.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//부분 문자열
public class Main16916 {
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
        int[] table = makeTable(P);
        int parentLen = S.length();
        int patternLen = P.length();

        int idx = 0;
        for (int i = 0; i < parentLen; i++) {
            while (idx > 0 && S.charAt(i) != P.charAt(idx)) {
                idx = table[idx - 1];
            }
            if (S.charAt(i) == P.charAt(idx)) {
                if (idx == patternLen - 1) {
                    idx = table[idx];
                    return 1;
                } else {
                    idx++;
                }
            }
        }
        return 0;
    }

    private static int[] makeTable(String pattern) {
        int n = pattern.length();
        int[] table = new int[n];
        int idx = 0;

        for (int i = 1; i < n; i++) {
            while (idx > 0 && pattern.charAt(i) != pattern.charAt(idx)) {
                idx = table[idx - 1];
            }
            if (pattern.charAt(i) == pattern.charAt(idx)) {
                idx++;
                table[i] = idx;
            }
        }
        return table;
    }
}
