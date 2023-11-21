package org.backjoon.season1.week31.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

/**
 * 원수의 원수(골드1)
 */
public class Main23818 {

    private static List<List<Person>> graph;
    private static int[] dp;
    private static StringBuilder sb;

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static String solution(BufferedReader reader) throws IOException {
        sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(reader.readLine());
        graph = new ArrayList<>();
        int personCount = Integer.parseInt(st.nextToken());
        dp = new int[personCount + 1];
        int relationCount = Integer.parseInt(st.nextToken());
        int answerCount = Integer.parseInt(st.nextToken());

        for (int i = 0; i <= personCount; i++) {
            graph.add(new ArrayList<>());
            dp[i] = i;
        }

        for (int i = 0; i < relationCount; i++) {
            int[] relation = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            union(relation[1], relation[2]);
            graph.get(relation[1]).add(Person.from(relation[2], relation[0]));
        }

        for (int i = 0; i < answerCount; i++) {
            int[] answerRelation = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int fa = checkConnected(answerRelation[0]);
            int fb = checkConnected(answerRelation[1]);
            if (fa != fb) {
                // 관계가 없을 경우
                sb.append("Unknown").append("\n");
            } else {
                // 관계가 있을 경우
            }
        }

        return sb.toString();
    }


    private static void union(int a, int b) {
        int fa = find(a);
        int fb = find(b);

        if (fa != fb) {
            dp[fa] = fb;
        }
    }

    private static int checkConnected(int a) {
        if (dp[a] == a) return a;
        return checkConnected(dp[a]);
    }

    private static int find(int a) {
        if (dp[a] == a) return a;
        return dp[a] = find(dp[a]);
    }


    private static String findRelationResult(int t) {
        if (t == 0) {
            return "Enemy";
        }
        if (t == 1) {
            return "Friend";
        }
        if (t == 3) {
            return "Error";
        }
        return "Unknown";
    }

    static class Person {

        private final int edge;
        private final int relation;

        private List<Integer> friends = new ArrayList<>();
        private List<Integer> enemies = new ArrayList<>();

        Person(int edge, int relation) {
            this.edge = edge;
            this.relation = relation;
        }

        public void addFriend(int person) {
            friends.add(person);
        }

        public void addEnemy(int enemy) {
            enemies.add(enemy);
        }

        public static Person from(int edge, int relation) {
            return new Person(edge, relation);
        }
    }
}
