package org.backjoon.class7.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

//로봇 청소기
public class Main14503 {
    private static int[][] room;
    private static int N, M;
    private final static int[] dx = {-1, 0, 1, 0}; //북, 동, 남, 서
    private final static int[] dy = {0, 1, 0, -1};
    private static int cnt;

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(solution(br));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int solution(BufferedReader br) throws IOException {
        int[] roomSize = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] robotInfo = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        N = roomSize[0];
        M = roomSize[1];
        room = new int[N][M];
        cnt = 1;

        for (int i = 0; i < roomSize[0]; i++) {
            room[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        clean(robotInfo[0], robotInfo[1], robotInfo[2]);
        return cnt;
    }

    private static void clean(int x, int y, int direction) {
        room[x][y] = 2; //청소 완료

        for (int i = 0; i < 4; i++) {
            direction = (direction + 3) % 4; //반시계방향으로 회전
            int nx = x + dx[direction];
            int ny = y + dy[direction];
            if (nx >= 0 && ny >= 0 && nx < N && ny < M && room[nx][ny] == 0) {
                cnt++;
                clean(nx, ny, direction);
                return;
            }
        }

        int d = (direction + 2) % 4; //반대 방향으로 후진
        int backX = x + dx[d];
        int backY = y + dy[d];
        if (backX >= 0 && backY >= 0 && backX < N && backY < M && room[backX][backY] != 1) {
            clean(backX, backY, direction);
        }
    }
}
