package org.backjoon.class6.seunggu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;

/**
 * 회전하는 큐
 */
public class Main1021 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int answer = solution(reader);
            System.out.println(answer);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static int solution(BufferedReader reader) throws IOException {
        LinkedList<Integer> deque = new LinkedList<>();
        int[] array = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = array[0];
        for(int i=1; i<=n; i++) {
            deque.offer(i);
        }
        array = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        return rotationQueue( deque, array);
    }

    private static int rotationQueue( LinkedList<Integer> deque, int[] array) {
        int answer = 0;
        for (int num : array) {
            int target = deque.indexOf(num);
            int half = deque.size() % 2 == 0 ? deque.size() / 2 - 1 : deque.size() / 2;
            boolean isLagerThenHalf = target <= half;
            int len = isLagerThenHalf ? target : deque.size() - target;
            for (int j = 0; j < len; j++) {
                if (!deque.isEmpty()) {
                    int number = isLagerThenHalf ? deque.pollFirst() : deque.pollLast();
                    if (isLagerThenHalf) deque.offerLast(number);
                    else deque.offerFirst(number);
                    answer++;
                }
            }
            deque.pollFirst();
        }
        return answer;
    }

}

