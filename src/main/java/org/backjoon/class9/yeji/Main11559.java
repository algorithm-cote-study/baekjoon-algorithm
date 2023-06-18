package org.backjoon.class9.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * Puyo Puyo - 골드 4
 */
public class Main11559 {

    private static final int[] dx = {1, 0, -1, 0};
    private static final int[] dy = {0, 1, 0, -1};
    private static boolean isPop;
    private static int answer;

    static int solution(BufferedReader br) throws IOException {
        answer = 0;
        String[][] map = new String[12][6];

        for (int i = 0; i < map.length; i++) {
            map[i] = br.readLine().split("");
        }

        while (true) {
            isPop = false;

            bfs(map);
            refresh(map);

            if (!isPop) {
                break;
            }
            answer++;
        }

        return answer;
    }

    private static void bfs(String[][] map) {
        Deque<Location> queue = new LinkedList<>();
        boolean[][] visited = new boolean[12][6];

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 6; j++) {
                if (!map[i][j].equals(".") && !visited[i][j]) {
                    List<Location> samePuyoList = new ArrayList<>();

                    queue.offer(Location.of(i, j, map[i][j]));
                    samePuyoList.add(Location.of(i, j, map[i][j]));
                    visited[i][j] = true;

                    checkPuyo(map, queue, visited, samePuyoList);
                }
            }

        }


    }

    private static void checkPuyo(String[][] map, Deque<Location> queue, boolean[][] visited, List<Location> samePuyoList) {
        while (!queue.isEmpty()) {
            Location cur = queue.poll();

            for (int d = 0; d < dx.length; d++) {
                int cx = dx[d] + cur.x;
                int cy = dy[d] + cur.y;

                if (cx >= 0 && cx < 12 && cy >= 0 && cy < 6) {
                    if (!visited[cx][cy] && map[cx][cy].equals(cur.color)) {
                        queue.offer(Location.of(cx, cy, cur.color));
                        samePuyoList.add(Location.of(cx, cy, cur.color));
                        visited[cx][cy] = true;
                    }
                }

                validPuyoPop(map, samePuyoList);

            }
        }
    }

    private static void validPuyoPop(String[][] map, List<Location> samePuyoList) {
        if (samePuyoList.size() >= 4) {
            for (Location puyo : samePuyoList) {
                map[puyo.x][puyo.y] = ".";
                isPop = true;
            }
        }
    }

    private static void refresh(String[][] map) {
        for (int i = 0; i < 6; i++) {
            Deque<Location> queue = new LinkedList<>();

            for (int j = 11; j >= 0; j--) {
                if (!map[j][i].equals(".")) {
                    queue.offer(Location.of(j, i, map[j][i]));
                    map[j][i] = ".";
                }
            }

            int index = 11;
            while (!queue.isEmpty()) {
                Location cur = queue.poll();

                map[index][i] = cur.color;
                index--;
            }
        }
    }

    private static class Location {

        private final int x;
        private final int y;

        private final String color;

        private Location(int x, int y, String color) {
            this.x = x;
            this.y = y;
            this.color = color;
        }

        public static Location of(int x, int y, String color) {
            return new Location(x, y, color);
        }
    }
}
