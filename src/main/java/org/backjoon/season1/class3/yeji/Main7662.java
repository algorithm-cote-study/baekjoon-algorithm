package org.backjoon.season1.class3.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

// 이중 우선순위 큐
public class Main7662 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(solution(reader));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static String solution(BufferedReader br) throws IOException {
        StringBuilder answer = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n - 1; i++) {
            answer.append(treemap(br)).append("\n");
        }
        answer.append(treemap(br));

        return answer.toString();
    }

    private static String treemap(BufferedReader br) throws IOException {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");

            if ("I".equals(input[0])) {
                int key = Integer.parseInt(input[1]);
                treeMap.put(key, treeMap.getOrDefault(key, 0) + 1);
            } else {

                if (!treeMap.isEmpty()) {
                    Integer key = "1".equals(input[1]) ? treeMap.lastKey() : treeMap.firstKey();
                    removeData(treeMap, key);
                }

            }
        }

        return treeMap.isEmpty() ? "EMPTY" : treeMap.lastKey() + " " + treeMap.firstKey();
    }

    private static void removeData(TreeMap<Integer, Integer> treeMap, Integer key) {
        int value = treeMap.get(key);

        if (value != 1) {
            treeMap.put(key, value - 1);
        } else {
            treeMap.remove(key);
        }

    }

}
