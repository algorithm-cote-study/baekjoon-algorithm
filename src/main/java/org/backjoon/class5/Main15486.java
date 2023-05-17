package org.backjoon.class5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

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

        Queue<Schedule> queue = new LinkedList<>();
        int[] result = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            int[] schedules = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            queue.offer(new Schedule(i, schedules[0], schedules[1]));
        }

        while (!queue.isEmpty()) {
            Schedule poll = queue.poll();
            int cur = poll.day + poll.requiredDays - 1;
            for (int i = cur; i < n + 1; i++) {
                if (cur < n + 1) {
                    result[i] = Math.max(result[i], poll.cost + result[cur - poll.requiredDays]);
                }
            }

        }
        return result[n];
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
