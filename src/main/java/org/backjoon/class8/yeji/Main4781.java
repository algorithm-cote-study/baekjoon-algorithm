package org.backjoon.class8.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 보석가게 (골드4)
 */
public class Main4781 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static String solution(BufferedReader br) throws IOException {
        StringBuilder answer = new StringBuilder();
        String input;
        while ((input = br.readLine()) != null && !input.startsWith("0 0.00")) {
            String[] info = input.split(" ");
            answer.append(findMaxCandy(info, br)).append("\n");
        }

        return answer.toString();
    }

    private static int findMaxCandy(String[] info, BufferedReader br) throws IOException {
        int n = Integer.parseInt(info[0]);
        int m = (int) Math.round(Double.parseDouble(info[1]) * 100);
        int[] maxCandy = new int[m + 1];

        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split(" ");
            int compareCalorie = Integer.parseInt(line[0]);
            int compareCost = (int) Math.round(Double.parseDouble(line[1]) * 100);
            for (int j = compareCost; j <= m; j++) {
                maxCandy[j] = Math.max(maxCandy[j], maxCandy[j - compareCost] + compareCalorie);
            }
        }
        return maxCandy[m];
    }
}
