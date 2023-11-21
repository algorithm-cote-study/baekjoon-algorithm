package org.backjoon.season1.class3.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//AC
public class Main5430 {
    static StringBuilder result = new StringBuilder();

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(solution(br));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String solution(BufferedReader br) throws IOException {
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String[] functions = br.readLine().split("");
            int len = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine(), "[],");
            Deque<Integer> deque = new ArrayDeque<>();
            for (int j = 0; j < len; j++) {
                deque.add(Integer.parseInt(st.nextToken()));
            }
            AC(functions, deque);
        }
        return result.toString();
    }

    static void AC(String[] functions, Deque<Integer> deque) {
        boolean isReverse = false;
        for (String func : functions) {
            if (func.equals("R")) {
                isReverse = !isReverse;
            } else if (func.equals("D")) {
                Integer N = isReverse ? deque.pollLast() : deque.pollFirst();
                if (N == null){
                    result.append("error").append("\n");
                    return;
                }
            }
        }

        result.append("[");
        if(deque.size() > 0){
            while (!deque.isEmpty() && deque.size() > 1) {
                result.append(isReverse ? deque.pollLast() : deque.pollFirst()).append(",");
            }
            result.append(deque.pollFirst());
        }
        result.append("]\n");
    }
}
