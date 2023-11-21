package org.backjoon.season1.class3.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

//토마토
public class Main7569 {

    static int dx[] = {0, 0, 0, 0, 1, -1}; //위 아래 세로위 세로아래 오른쪽 왼쪽
    static int dy[] = {0, 0, 1, -1, 0, 0};
    static int dz[] = {1, -1, 0, 0, 0, 0};
    static int M, N, H;
    static int[][][] tomatoBox;
    static Queue<Node> ripeTomato;

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(solution(br));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int solution(BufferedReader br) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());

        tomatoBox = new int[H][N][M];
        ripeTomato = new LinkedList<>();

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine(), " ");
                for (int k = 0; k < M; k++) {
                    tomatoBox[i][j][k] = Integer.parseInt(st.nextToken());
                    if (tomatoBox[i][j][k] == 1)
                        ripeTomato.add(new Node(k, j, i));
                }
            }
        }

        return ripeningTime();
    }

    static int ripeningTime() {
        int result = Integer.MIN_VALUE;
        while (!ripeTomato.isEmpty()) {
            Node tomato = ripeTomato.poll();
            int x = tomato.x;
            int y = tomato.y;
            int z = tomato.z;
            for (int i = 0; i < 6; i++) {
                int mvX = x + dx[i];
                int mvY = y + dy[i];
                int mvZ = z + dz[i];
                if (mvX < 0 || mvX >= M || mvY < 0 || mvY >= N || mvZ < 0 || mvZ >= H) continue;
                if (tomatoBox[mvZ][mvY][mvX] == 0) {
                    ripeTomato.add(new Node(mvX, mvY, mvZ));
                    tomatoBox[mvZ][mvY][mvX] = tomatoBox[z][y][x] + 1;
                }
            }
        }

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    if (tomatoBox[i][j][k] == 0) return -1;
                    result = Math.max(result, tomatoBox[i][j][k]);
                }
            }
        }
        return result - 1;
    }

    static class Node {
        int x;
        int y;
        int z;

        Node(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }
}
