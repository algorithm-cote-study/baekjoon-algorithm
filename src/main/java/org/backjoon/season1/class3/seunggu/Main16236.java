package org.backjoon.season1.class3.seunggu;

import java.io.*;
import java.util.*;

/**
 * 아기상어
 */
public class Main16236 {

    static final int dx[] = {0, 0, 1, -1};
    static final int dy[] = {1, -1, 0, 0};
    static int[][] map;

    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st;
            Queue<Node> queue = new LinkedList<>();
            int n = Integer.parseInt(br.readLine());
            map = new int[n][n];

            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < n; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                    if (map[i][j] == 9) {
                        queue.add(new Node(i, j, 0));
                        map[i][j] = 0;
                    }
                }
            }

            int size = 2;
            int eat = 0;
            int ans = 0;
            while (true) {
                ArrayList<Node> eatFish = new ArrayList<>();
                int[][] dist = new int[n][n];

                while (!queue.isEmpty()) {
                    Node p = queue.poll();
                    int x = p.x;
                    int y = p.y;

                    for (int k = 0; k < 4; k++) {
                        int nx = x + dx[k];
                        int ny = y + dy[k];

                        if (0 <= nx && nx < n && 0 <= ny && ny < n) {
                            if (dist[nx][ny] == 0 && map[nx][ny] <= size) {
                                dist[nx][ny] = dist[x][y] + 1;
                                queue.add(new Node(nx, ny, dist[nx][ny]));
                                if (1 <= map[nx][ny] && map[nx][ny] <= 6 && map[nx][ny] < size) {
                                    eatFish.add(new Node(nx, ny, dist[nx][ny]));
                                }
                            }
                        }
                    }
                }

                if (eatFish.isEmpty()) {
                    System.out.println(ans);
                    return;
                }

                Node nowFish = eatFish.get(0);
                for (int i = 1; i < eatFish.size(); i++) {
                    if (nowFish.dist > eatFish.get(i).dist) {
                        nowFish = eatFish.get(i);
                    } else if (nowFish.dist == eatFish.get(i).dist) {
                        if (nowFish.x > eatFish.get(i).x) {
                            nowFish = eatFish.get(i);
                        } else if (nowFish.x == eatFish.get(i).x) {
                            if (nowFish.y > eatFish.get(i).y) {
                                nowFish = eatFish.get(i);
                            }
                        }
                    }
                }
                map[nowFish.x][nowFish.y] = 0;
                ans += nowFish.dist;
                eat++;
                if (size == eat) {
                    size++;
                    eat = 0;
                }
                queue.add(nowFish);

            }
        }

    }

    static class Node {

        int x;
        int y;
        int dist;

        Node(int x, int y, int dist) {
            this.x = x;
            this.y = y;
            this.dist = dist;
        }
    }
}
