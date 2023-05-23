package org.backjoon.class6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문자열 복사
public class Main2195 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int solution(BufferedReader br) throws IOException {
        String s = br.readLine();
        String p = br.readLine();

        int index = 0;
        int count = 0;
        for (int i = 0; i < p.length(); i++) {
            if (!s.contains(p.substring(index, i + 1))) {
                count++;
                index = i;
            }
        }
        return count + 1;
    }

}
