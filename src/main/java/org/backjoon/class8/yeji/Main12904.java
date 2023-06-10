package org.backjoon.class8.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * A와 B 골드5
 */
public class Main12904 {


    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int solution(BufferedReader br) throws IOException {
        String s = br.readLine();
        String t = br.readLine();

        return bfs(s, t);
    }

    private static int bfs(String s, String t) {
        String[] splitT = t.split("");
        StringBuilder sb = new StringBuilder();
        for (String value : splitT) {
            sb.append(value);
        }

        while (sb.length() > s.length()) {
            if (sb.charAt(sb.length() - 1) == 'A') {
                sb.deleteCharAt(sb.length() - 1);
            } else if (sb.charAt(sb.length() - 1) == 'B') {
                sb.deleteCharAt(sb.length() - 1);
                sb.reverse();
            } else {
                return 0;
            }
        }
        return sb.toString().equals(s) ? 1 : 0;
    }
}
