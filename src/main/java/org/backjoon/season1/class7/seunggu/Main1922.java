package org.backjoon.season1.class7.seunggu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 네트워크 연결 ( 골드 2 )
 */
public class Main1922 {

    private static int[] unf;

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(solution(reader));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static int solution(BufferedReader reader) throws IOException {
        int answer = 0;
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());
        unf = new int[n+1];
        for (int i = 1; i <= n; i++) unf[i] = i;
        List<Point> points = new ArrayList<>();
        for(int i=0; i<m;i++) {
            int[] array = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            points.add(Point.of(array));
        }
        Collections.sort(points);
        for (Point point : points) {
            if (find(point.start) != find(point.end)) {
                answer += point.weight;
                union(point.start, point.end);
            }
        }
        return answer;
    }

    private static void union(int a, int b) {
        int findA = find(a);
        int findB = find(b);
        if(findA != findB) unf[findB] = findA;
    }

    private static int find(int v) {
        if(unf[v] == v) return v;
        unf[v] = find(unf[v]);
        return unf[v];
    }

    static class Point implements Comparable<Point> {
        int start;
        int end;
        int weight;

        private Point(int start, int end, int weight) {
            this.start = start;
            this.end = end;
            this.weight = weight;
        }

        public static Point of(int[] array) {
            return new Point(array[0], array[1], array[2]);
        }

        @Override
        public int compareTo(Point o) {
            return weight - o.weight;
        }

    }
}
