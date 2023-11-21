package org.backjoon.season1.class2.seunggu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 수 찾기( 실버 4 )
 */
public class Main1920 {

     public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(solution(reader));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
     }
     static String solution(BufferedReader reader) throws IOException {
        int number = Integer.parseInt(reader.readLine());
        int[] array = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Map<Integer, Boolean> map = new HashMap<>();
        for (int j : array) {
            map.put(j, true);
        }
        int count = Integer.parseInt(reader.readLine());
        int[] array2 = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i : array2) {
            if(map.getOrDefault(i, false)) {
                stringBuilder.append(1);
            }else {
                stringBuilder.append(0);
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}