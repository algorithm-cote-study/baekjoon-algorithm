package org.backjoon.season2.week47.seunggu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 삼각형과 세 변
 *
 * @author seunggu.lee
 * @since 2023.11.27
 */
public class Main5073 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static String solution(BufferedReader reader) throws IOException {
        String endLine = "0 0 0";
        String line;
        StringBuilder stringBuilder = new StringBuilder();
        while (!(line = reader.readLine()).equals(endLine)) {
            stringBuilder.append(judgeTriangle(line)).append("\n");
        }
        return stringBuilder.toString().trim();
    }

    private static String judgeTriangle(String line) {
        int[] numbers = Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
        int a = numbers[0];
        int b = numbers[1];
        int c = numbers[2];
        if (a == b && b == c) {
            return Triangle.Equilateral.name();
        }
        if (c >= a + b) {
            return Triangle.Invalid.name();
        }
        if (c == b || b == a) {
            return Triangle.Isosceles.name();
        }
        return Triangle.Scalene.name();
    }

    enum Triangle {
        Equilateral,    // 세 변의 길이가 모두 같은 경우
        Isosceles,  // 두 변의 길이만 같은 경우
        Scalene, // 세 변의 길이가 모두 다른 경우
        Invalid
    }

}