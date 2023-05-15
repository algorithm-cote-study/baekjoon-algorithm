package org.backjoon.class3.seunggu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 잃어버린 괄호 ( 실버2 )
 */
public class Main1541 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int answer = solution(reader);
            System.out.println(answer);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static int solution(BufferedReader reader) throws IOException {
        String words = reader.readLine();
        StringTokenizer tokenizer = new StringTokenizer(words, "-");
        int answer = getAnswer(tokenizer);
        while (tokenizer.hasMoreTokens()) {
            answer -= getAnswer(tokenizer);
        }
        return answer;
    }

    private static int getAnswer(StringTokenizer tokenizer) {
        String token = tokenizer.nextToken();
        StringTokenizer stringTokenizer = new StringTokenizer(token, "+");
        int plus = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            plus += Integer.parseInt(nextToken);
        }
        return plus;
    }


}
