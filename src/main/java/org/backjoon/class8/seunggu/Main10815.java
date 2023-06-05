package org.backjoon.class8.seunggu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main10815 {

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int count = Integer.parseInt(br.readLine());
            Map<Integer, Integer> map = new HashMap<>();
            int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int i = 0; i < count; i++) {
                map.put(array[i], 1);
            }
            count = Integer.parseInt(br.readLine());
            array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < count; i++) {
                stringBuilder.append(map.getOrDefault(array[i], 0)).append(" ");
            }

            System.out.println(stringBuilder);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

