package org.backjoon.class9.seunggu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 부분 문자열
 */
public class Main16916 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println(solution(reader));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int solution(BufferedReader reader) throws IOException {
        String original = reader.readLine();
        String part = reader.readLine();
        int[] pi = new int[part.length()];
        int j = 0;
        for (int i = 1; i < part.length(); i++) {
            while (j > 0 && part.charAt(i) != part.charAt(j)) {
                j = pi[j - 1];
            }
            if (part.charAt(i) == part.charAt(j)) {
                pi[i] = ++j;
            }
        }
        return kmp(original, part, pi);
    }


    public static int kmp(String original, String part, int[] pi) {
        int j = 0;
        for (int i = 0; i < original.length(); i++) {
            while (j > 0 && original.charAt(i) != part.charAt(j)) {
                j = pi[j - 1];
            }
            if (original.charAt(i) == part.charAt(j)) {
                if (j == part.length() - 1) {
                    return 1;
                } else {
                    j++;
                }
            }
        }
        return 0;
    }

}
