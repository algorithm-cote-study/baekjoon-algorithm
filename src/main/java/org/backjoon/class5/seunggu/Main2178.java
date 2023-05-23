package org.backjoon.class5.seunggu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/**
 * 미로 탐색 ( 실버 1 )
 */
public class Main2178 {

    private static final int[] dx = { -1, 1, 0, 0 };
    private static final int[] dy = { 0, 0, -1, 1 };

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(solution(reader));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static int solution(BufferedReader reader) throws IOException {
        int[] array = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = array[0];
        int m = array[1];
        int[][] maze = new int[n][m];
        for(int i=0; i<maze.length; i++) {
            maze[i] = Arrays.stream(reader.readLine().split("")).mapToInt(Integer::parseInt).toArray();
        }
        dfs(maze);
        return maze[n-1][m-1];
    }

    private static void dfs(int[][] maze) {
        boolean[][] visited = new boolean[maze.length][maze[0].length];
        visited[0][0] = true;
        Deque<Point> pointDeque = new LinkedList<>();
        pointDeque.offer(Point.of(0, 0));
        while(!pointDeque.isEmpty()) {
            Point point = pointDeque.poll();
            visited[point.x][point.y] = true;
            for(int i=0; i<4; i++) {
                int nextX = point.x + dx[i];
                int nextY = point.y + dy[i];
                if(nextX >= 0 && nextX < maze.length && nextY >= 0 && nextY < maze[0].length && maze[nextX][nextY] != 0 && !visited[nextX][nextY]) {
                    pointDeque.offer(Point.of(nextX, nextY));
                    maze[nextX][nextY] = maze[point.x][point.y] + 1;
                    visited[nextX][nextY] = true;
                }
            }
        }
    }

    static class Point {
        private final int x;
        private final int y;
        private Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public static Point of(int x, int y) {
            return new Point(x, y);
        }
    }

}
