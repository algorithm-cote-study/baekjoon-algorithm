package org.backjoon.class6.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문서 검색
 */
public class Main1543 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int solution(BufferedReader br) throws IOException {
        int answer = 0;
        String document = br.readLine();
        String sejoon = br.readLine();

        int i = 0;
        while (document.indexOf(sejoon, i) != -1) {
            answer++;
            i = (document.indexOf(sejoon, i) + sejoon.length());
        }

        return answer;
    }
}
