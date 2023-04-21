package org.backjoon.class3.seunggu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 리모컨 ( 골드 5 )
 */
public class Main1107 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int answer = solution(reader);
            System.out.println(answer);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static int solution(BufferedReader reader) throws IOException {
        String s = reader.readLine();
        int number = Integer.parseInt(s);
        int count = Integer.parseInt(reader.readLine());
        boolean[] buttons = new boolean[10];
        if (count == 0) return Math.min(Math.abs(number - 100), s.length());
        int[] array = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int n : array) {
            buttons[n] = true;
        }
        int answer = Math.abs(number - 100);

        for (int i = 0; i <= 1000001; i++) {
            int result = calculateDistance(i, buttons);
            if (result != 0) {
                answer = Math.min(answer, result + Math.abs(number - i));
            }
        }
        return answer;
    }

    private static int calculateDistance(int button, boolean[] buttons) {
        if (button == 0) {
            return buttons[0] ? 0 : 1;
        }

        int len = 0;
        while (button > 0) {
            if (buttons[button % 10]) {
                return 0;
            }
            len++;
            button /= 10;
        }
        return len;
    }


}
