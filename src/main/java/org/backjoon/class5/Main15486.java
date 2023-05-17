package org.backjoon.class5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

// 퇴사2
public class Main15486 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int solution(BufferedReader br) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] result = new int[n + 2];
        Deque<Schedule> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            int[] schedules = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            queue.offer(new Schedule(i, schedules[0], schedules[1]));
        }

        int i = n;
        while (!queue.isEmpty()) {
            Schedule cur = queue.pollLast();
            if (i + cur.requiredDays > n + 1) {
                result[i] = result[i + 1];
            } else {
                result[i] = Math.max(result[i + 1], cur.cost + result[i + cur.requiredDays]);
            }

            i--;
        }

        return result[1];
    }

    static class Schedule {

        int day;
        int requiredDays;
        int cost;

        public Schedule(int day, int requiredDays, int cost) {
            this.day = day;
            this.requiredDays = requiredDays;
            this.cost = cost;
        }
    }

}
