package org.backjoon.season1.class11.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 양팔저울
 */
public class Main2629 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static String solution(BufferedReader br) throws IOException {
        int stoneCount = Integer.parseInt(br.readLine());
        int[] stones = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        boolean[] visited = new boolean[40001];

        int curMax = 0;
        for (int i = 0; i < stoneCount; i++) {
            curMax = Math.max(curMax, stones[i]);
            boolean[] tempVisited = new boolean[40001];
            int maxTemp = curMax;

            for (int m = 0; m <= curMax; m++) {
                if (visited[m]) {
                    tempVisited[m + stones[i]] = true;
                    tempVisited[Math.abs(stones[i] - m)] = true;
                    maxTemp = Math.max(maxTemp, m + stones[i]);
                }
            }
            curMax = maxTemp;

            for (int j = 0; j <= curMax; j++) {
                if (tempVisited[j]) {
                    visited[j] = true;
                }
            }

            visited[stones[i]] = true;
        }

        int compareCount = Integer.parseInt(br.readLine());
        int[] compareStones = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < compareCount - 1; i++) {
            answer.append(availableVisited(compareStones[i], visited)).append(" ");
        }
        answer.append(availableVisited(compareStones[compareCount - 1], visited));
        return answer.toString();
    }

    private static String availableVisited(int stone, boolean[] visited) {
        return visited[stone] ? "Y" : "N";
    }

}
