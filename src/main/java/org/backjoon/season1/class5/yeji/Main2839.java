package org.backjoon.season1.class5.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 설탕 배달
public class Main2839 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int solution(BufferedReader br) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int answer = 0;

        if (n % 5 == 0) {
            answer = n / 5;
        } else if (n == 4 || n == 7) {
            answer = -1;
        } else if (n % 5 == 1 || n % 5 == 3) {
            answer = (n / 5) + 1;
        } else if (n % 5 == 2 || n % 5 == 4) {
            answer = (n / 5) + 2;
        }

        return answer;
    }


}
