package org.backjoon.class6.yeji;

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
            System.out.print(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int solution(BufferedReader br) throws IOException {
        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] arrays = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int count = 0;

        LinkedList<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= input[0]; i++) {
            queue.offer(i);
        }

        for (int array : arrays) {

            int cur = queue.indexOf(array);
            int middle;
            if (queue.size() % 2 == 0) {
                middle = queue.size() / 2 - 1;
            } else {
                middle = queue.size() / 2;
            }

            if (cur <= middle) {
                for (int j = 0; j < cur; j++) {
                    Integer temp = queue.pollFirst();
                    queue.offerLast(temp);
                    count++;
                }
            } else {
                for (int j = 0; j < queue.size() - cur; j++) {
                    Integer temp = queue.pollLast();
                    queue.offerFirst(temp);
                    count++;
                }
            }
            queue.pollFirst();
        }
        return count;
    }

}
