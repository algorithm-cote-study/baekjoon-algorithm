package org.backjoon.season1.class12.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 멀티탭 스케쥴링 (골드1)
 */
public class Main1700 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int solution(BufferedReader reader) throws IOException {
        int answer = 0;
        int[] input = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] digitalProducts = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int n = input[0];
        int k = input[1];
        boolean[] visited = new boolean[101];

        int put = 0;
        for (int i = 0; i < k; i++) {
            int digial = digitalProducts[i];
            if (!visited[digial]) {
                if (put < n) {
                    visited[digial] = true;
                    put++;
                } else {
                    List<Integer> digialSet = new ArrayList<>();
                    for (int j = i; j < k; j++) {
                        if (visited[digitalProducts[j]] && !digialSet.contains(digitalProducts[j])) {
                            digialSet.add(digitalProducts[j]);
                        }
                    }

                    if (digialSet.size() != n) {
                        for (int j = 0; j < visited.length; j++) {
                            if (visited[j] && !digialSet.contains(j)) {
                                visited[j] = false;
                                break;
                            }
                        }
                    } else {
                        int remove = digialSet.get(digialSet.size() - 1);
                        visited[remove] = false;
                    }

                    visited[digial] = true;
                    answer++;
                }
            }
        }

        return answer;
    }
}
