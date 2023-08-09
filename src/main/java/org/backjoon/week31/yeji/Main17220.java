package org.backjoon.week31.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

/**
 * 마약수사대 (골드4)
 */
public class Main17220 {

    private static boolean[] visited;

    private static List<List<Integer>> graph;
    private static int answer;

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int solution(BufferedReader reader) throws IOException {
        int[] numeric = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        answer = 0;
        graph = new ArrayList<>();
        visited = new boolean[numeric[0] + 1];
        int[] findRoot = new int[numeric[0] + 1];

        for (int i = 0; i <= numeric[0]; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < numeric[1]; i++) {
            char[] relation = reader.readLine().replace(" ", "").toCharArray();
            graph.get(relation[0] - 64).add(relation[1] - 64);
            findRoot[relation[1] - 64]++;
        }

        StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(stringTokenizer.nextToken());

        for (int i = 0; i < n; i++) {
            int target = stringTokenizer.nextToken().toCharArray()[0] - 64;
            visited[target] = true;
        }

        for (int i = 1; i < findRoot.length; i++) {
            if (findRoot[i] == 0) {
                dfs(i);
            }
        }

        return answer;
    }

    private static void dfs(int start) {
        if (!visited[start]) {
            List<Integer> targets = graph.get(start);
            for (Integer target : targets) {
                if (!visited[target]) {
                    answer++;
                    dfs(target);
                }
            }
        }

    }


}
