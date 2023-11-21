package org.backjoon.season1.class6.yeji;

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
            count = getCount(count, queue, cur, middle);
            queue.pollFirst();
        }
        return count;
    }

    private static int getCount(int count, LinkedList<Integer> queue, int cur, int middle) {
        boolean isLowerMiddle = cur <= middle;
        int size = isLowerMiddle ? cur : queue.size() - cur;
        for (int i = 0; i < size; i++) {
            Integer temp = isLowerMiddle ? queue.pollFirst() : queue.pollLast();
            if (isLowerMiddle) {
                queue.offerLast(temp);
            } else {
                queue.offerFirst(temp);
            }
            count++;
        }
        return count;
    }

}
