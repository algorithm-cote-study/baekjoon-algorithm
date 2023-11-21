package org.backjoon.season1.class8.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * 숫자카드 (실버5)
 */
public class Main10815 {


    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static String solution(BufferedReader br) throws IOException {
        Integer.parseInt(br.readLine());

        Map<String, Integer> ownCardMap = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            ownCardMap.put(st.nextToken(), 0);
        }

        return findNumericCard(ownCardMap, br);
    }

    private static String findNumericCard(Map<String, Integer> ownCardMap, BufferedReader br) throws IOException {
        StringBuilder result = new StringBuilder();
        Integer.parseInt(br.readLine());
        String[] compareCards = br.readLine().split(" ");

        for (int i = 0; i < compareCards.length - 1; i++) {
            if (ownCardMap.containsKey(compareCards[i])) {
                result.append("1").append(" ");
            } else {
                result.append("0").append(" ");
            }
        }
        result.append(ownCardMap.containsKey(compareCards[compareCards.length - 1]) ? "1" : "0");
        return result.toString();
    }

}
