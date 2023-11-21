package org.backjoon.season1.class3.seunggu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * AC
 */
public class Main5430 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int count = Integer.parseInt(reader.readLine());
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < count; i++) {
                String[] commands = reader.readLine().split("");
                reader.readLine();
                StringBuilder subStringBuilder = new StringBuilder(reader.readLine().replaceAll("[,\\[\\]]", ""));
                boolean flag = true;
                for (String command : commands) {
                    if ("R".equals(command) && !subStringBuilder.isEmpty()) {
                        subStringBuilder = subStringBuilder.reverse();
                    } else if (subStringBuilder.isEmpty()) {
                        stringBuilder.append("error").append("\n");
                        flag = false;
                        break;
                    } else {
                        subStringBuilder.deleteCharAt(0);
                    }
                }
                if (flag) {
                    StringBuilder makeBuilder = new StringBuilder("[");
                    String[] words = subStringBuilder.toString().split("");
                    for (int j = 0; j < words.length - 1; j++) {
                        makeBuilder.append(words[j]).append(",");
                    }
                    makeBuilder.append(words[words.length - 1]).append("]");
                    stringBuilder.append(makeBuilder).append("\n");
                }
            }
            System.out.println(stringBuilder);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
