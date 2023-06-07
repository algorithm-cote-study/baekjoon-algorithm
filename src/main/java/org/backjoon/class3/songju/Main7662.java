package org.backjoon.class3.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.TreeMap;

//이중 우선순위 큐
public class Main7662 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(solution(br));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String solution(BufferedReader br) throws IOException {
        StringBuilder result = new StringBuilder();
        int testCase = Integer.parseInt(br.readLine());
        for(int i=0;i<testCase;i++){
            result.append(treemap(br)).append("\n");
        }
        return result.toString();
    }

    private static String treemap(BufferedReader br) throws IOException {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] operator = br.readLine().split(" ");
            if (operator[0].equals("I")) {
                int key = Integer.parseInt(operator[1]);
                treeMap.put(key, treeMap.getOrDefault(key, 0) + 1);
            } else if(operator[0].equals("D")){
                if (!treeMap.isEmpty()) {
                    Integer key = operator[1].equals("1") ? treeMap.lastKey() : treeMap.firstKey();
                    int removeVal = treeMap.get(key);
                    if (removeVal == 1) treeMap.remove(key);
                    else treeMap.put(key, removeVal - 1);
                }
            }
        }
        return treeMap.isEmpty() ? "EMPTY" : treeMap.lastKey() + " " + treeMap.firstKey();
    }
}
