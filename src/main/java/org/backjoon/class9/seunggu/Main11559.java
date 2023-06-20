package org.backjoon.class9.seunggu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 뿌요뿌요
 */
public class Main11559 {

    private static final char[][] map = new char[12][6];

    private static int pop = 0;
    private static boolean isPop = false;

    private static final int[] dx = {0, 0, 1, -1};
    private static final int[] dy = {1, -1, 0, 0};

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int solution(BufferedReader reader) throws IOException {
        for (int i = 0; i < 12; i++) {
            String str = reader.readLine();
            for (int j = 0; j < 6; j++) {
                map[i][j] = str.charAt(j);
            }
        }

        while (true) {
            isPop = false;

            bfs();
            pullDownBottomAll();

            if (!isPop) {
                break;
            }
            pop++;
        }
        return pop;
    }

    static void bfs() {
        Queue<Puyo> que = new LinkedList<>();
        boolean[][] isVisited = new boolean[12][6];

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 6; j++) {
                if (map[i][j] != '.' && !isVisited[i][j]) {
                    List<int[]> list = new ArrayList<>();

                    que.add(new Puyo(i, j, map[i][j]));
                    list.add(new int[]{i, j});
                    isVisited[i][j] = true;

                    while (!que.isEmpty()) {
                        Puyo p = que.poll();

                        puyopuyo(que, isVisited, list, p);

                    }

                    lastPang(list);

                }
            }
        }
    }

    private static void lastPang(List<int[]> list) {
        if (list.size() >= 4) {
            for (int[] ints : list) {
                int x = ints[0];
                int y = ints[1];

                map[x][y] = '.';

                isPop = true;
            }
        }
    }

    private static void puyopuyo(Queue<Puyo> que, boolean[][] isVisited, List<int[]> list, Puyo p) {
        int curX = p.x;
        int curY = p.y;
        char curColor = p.color;

        for (int t = 0; t < 4; t++) {
            int nx = curX + dx[t];
            int ny = curY + dy[t];

            if (nx < 0 || ny < 0 || nx >= 12 || ny >= 6) continue;

            if (!isVisited[nx][ny] && map[nx][ny] == curColor) {
                que.add(new Puyo(nx, ny, map[nx][ny]));
                list.add(new int[]{nx, ny});
                isVisited[nx][ny] = true;
            }
        }
    }

    static void pullDownBottomAll() {
        for (int j = 0; j < 6; j++) {
            pullDownBottom(j);
        }
    }

    static void pullDownBottom(int j) {
        Queue<Puyo> puyo = new LinkedList<>();
        int idx = 11;
        for (int i = 11; i >= 0; i--) {
            if (map[i][j] != '.') {
                puyo.add(new Puyo(i, j, map[i][j]));
                map[i][j] = '.';
            }
        }
        while (!puyo.isEmpty()) {
            Puyo p = puyo.poll();

            char color = p.color;

            map[idx][j] = color;

            idx--;
        }

    }

    static class Puyo {

        private final int x;
        private final int y;
        char color;

        Puyo(int x, int y, char color) {
            this.x = x;
            this.y = y;
            this.color = color;
        }
    }
}
