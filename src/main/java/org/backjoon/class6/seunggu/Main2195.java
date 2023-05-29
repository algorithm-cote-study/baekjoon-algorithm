package org.backjoon.class6.seunggu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문자열 복사 ( 골드 5 )
 */
public class Main2195 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int answer = solution(reader);
            System.out.println(answer);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static int solution(BufferedReader reader) throws IOException {
        String word = reader.readLine();
        String[] completeWord = reader.readLine().split("");
        StringBuilder stringBuilder = new StringBuilder();
        int answer = 0;
        for (String s : completeWord) {
            stringBuilder.append(s);
            if (!word.contains(stringBuilder)) {
                answer++;
                stringBuilder.setLength(0);
                stringBuilder.append(s);
            }
        }
        return answer + 1;
    }

}
