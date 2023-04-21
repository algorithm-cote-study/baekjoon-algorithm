package org.backjoon.class3.seunggu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Main7576 {

    private static int n;
    private static int m;
    private static int[][] array;
    private static int[] dx = {0, -1, 0, 1};
    private static int[] dy = {-1, 0, 1, 0};
    private static int max;
    private static boolean flag;
    private static Deque<Point> deque;


    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(solution(reader));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int solution(BufferedReader reader) throws IOException {
        String[] lines = reader.readLine().split(" ");
        n = Integer.parseInt(lines[0]);
        m = Integer.parseInt(lines[1]);
        array = new int[m][n];
        deque = new ArrayDeque<>();
        flag = false;
        max = Integer.MIN_VALUE;
        for (int i = 0; i < m; i++) {
            array[i] = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int number = array[i][j];
                if (number != 1) {
                    flag = false;
                }
                if (number == 1) {
                    deque.add(Point.of(i, j));
                }
            }
        }
        if (flag) {
            return 0;
        }
        recursion();
        int result = checkMaxValue();
        return result == -1 ? result : result - 1;
    }

    static int checkMaxValue() {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int number = array[i][j];
                if (number == 0) return -1;
                max = Math.max(number, max);
            }
        }
        return max;
    }

    static void recursion() {
        while (!deque.isEmpty()) {
            int len = deque.size();
            for (int i = 0; i < len; i++) {
                Point point = deque.pop();
                if (array[point.getX()][point.getY()] == -1) return;
                for (int j = 0; j < dx.length; j++) {
                    int nx = point.getX() + dx[j];
                    int ny = point.getY() + dy[j];
                    if (nx >= 0 && nx <= m - 1 && ny >= 0 && ny <= n - 1) {
                        if (array[nx][ny] == 1) continue;
                        if (array[nx][ny] == 0) {
                            int number = array[point.getX()][point.getY()] + 1;
                            array[nx][ny] = number;
                            deque.add(Point.of(nx, ny));
                        } else if (array[nx][ny] > 1) {
                            int number = array[point.getX()][point.getY()] + 1;
                            if (array[nx][ny] > number) {
                                array[nx][ny] = number;
                                deque.add(Point.of(nx, ny));
                            }
                        }
                    }
                }
            }
        }
    }

    static class Point {

        private int x;
        private int y;

        private Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public static Point of(int x, int y) {
            return new Point(x, y);
        }

        public int getX() {
            return this.x;
        }

        public int getY() {
            return this.y;
        }

    }

}
