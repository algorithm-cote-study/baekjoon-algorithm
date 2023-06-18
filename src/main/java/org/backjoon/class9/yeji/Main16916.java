package org.backjoon.class9.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 부분 문자열 - 브론즈2
 */
public class Main16916 {

    private static int[] patternArray;

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int solution(BufferedReader reader) throws IOException {
        String s = reader.readLine();
        String p = reader.readLine();
        int len = s.length();
        patternArray = new int[p.length()];

        getPattern(p);

        return kmp(len, s, p);
    }

    private static void getPattern(String p) {
        int j = 0;
        for (int i = 1; i < patternArray.length; i++) {
            while (j > 0 && p.charAt(i) != p.charAt(j)) {
                j = patternArray[j - 1];
            }
            if (p.charAt(i) == p.charAt(j)) {
                patternArray[i] = ++j;
            }
        }
    }

    private static int kmp(int len, String s, String p) {
        int j = 0;

        for (int i = 0; i < len; i++) {
            while (j > 0 && s.charAt(i) != p.charAt(j)) {
                j = patternArray[j - 1];
            }
            if (s.charAt(i) == p.charAt(j)) {
                if (j == p.length() - 1) {
                    return 1;
                } else {
                    j++;
                }
            }
        }
        return 0;
    }
}
