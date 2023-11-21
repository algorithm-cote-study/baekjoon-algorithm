package org.backjoon.season1.class3.seunggu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * 유기농 배추( 실버 2 )
 */
public class Main1012 {

    private static final int[] dx = {-1, 0, 1, 0};
    private static final int[] dy = {0, 1, 0, -1};
    private static boolean[][] board;
    private static boolean[][] visited;

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(solution(reader));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static String solution(BufferedReader reader) throws IOException {
        int count = Integer.parseInt(reader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < count; i++) {
            int answer = 0;
            int[] array = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            board = getBoard(reader, array);
            visited = new boolean[array[0]][array[1]];
            answer = getAnswer(answer);
            stringBuilder.append(answer).append('\n');
        }
        return stringBuilder.toString();
    }

    private static int getAnswer(int answer) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] && !visited[i][j]) {
                    bfs(i, j);
                    answer++;
                }
            }
        }
        return answer;
    }

    private static boolean[][] getBoard(BufferedReader reader, int[] array) throws IOException {
        boolean[][] board = new boolean[array[0]][array[1]];
        int cnt = array[2];
        for (int i = 0; i < cnt; i++) {
            int[] points = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            board[points[0]][points[1]] = true;
        }
        return board;
    }

    private static void bfs(int x, int y) {
        visited[x][y] = true;
        Deque<Point> points = new ArrayDeque<>();
        points.add(Point.of(x, y));
        while (!points.isEmpty()) {
            Point point = points.pop();
            for (int i = 0; i < dx.length; i++) {
                int nx = point.x + dx[i];
                int ny = point.y + dy[i];
                if (nx >= 0 && nx < board.length && ny >= 0 && ny < board[0].length && board[nx][ny] && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    points.add(Point.of(nx, ny));
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
