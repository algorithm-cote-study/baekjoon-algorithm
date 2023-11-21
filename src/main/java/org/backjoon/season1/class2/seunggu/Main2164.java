package org.backjoon.season1.class2.seunggu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

/**
 * 카드 2 ( 실버 4 )
 */
public class Main2164 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int answer = solution(reader);
            System.out.println(answer);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static int solution(BufferedReader reader) throws IOException {
        int number = Integer.parseInt(reader.readLine());
        Deque<Integer> deque = new LinkedList<>();
        for(int i=1; i<=number; i++) {
            deque.offer(i);
        }

        int answer = deque.pop();
        while(!deque.isEmpty()) {
            int popNum = deque.pop();
            deque.add(popNum);
            answer = deque.pop();
        }
        return answer;
    }
}