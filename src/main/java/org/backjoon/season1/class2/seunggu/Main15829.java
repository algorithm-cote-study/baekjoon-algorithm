package org.backjoon.season1.class2.seunggu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * hashing (브론즈 2)
 */
public class Main15829 {

    private static long MOD = 1234567891;
    private static int R = 31;

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(solution(reader));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static long solution(BufferedReader reader) throws IOException {
        int count = Integer.parseInt(reader.readLine());
        String number = reader.readLine();
        char[] charArray = number.toCharArray();
        long sum = 0;
        long pow = 1;
        for (char c : charArray) {
            sum += (c - 'a' + 1) * pow % MOD; //분배법칙
            pow = pow * R % MOD; //분배법칙
        }
        return sum % MOD;
    }


}
