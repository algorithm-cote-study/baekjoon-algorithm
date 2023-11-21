package org.backjoon.season1.class9.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

//Puyo Puyo
public class Main11559 {
    private static int[] dx = {0, 1, 0, -1};
    private static int[] dy = {1, 0, -1, 0};
    private static boolean[][] visited;
    private final static int W = 6, H = 12;
    private static char [][] board;
    private static int crushCnt;
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(solution(br));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int solution(BufferedReader br) throws IOException {
        int result = 0;
        board = new char[H][W];

        for(int i=0;i<H;i++){
            board[i]= br.readLine().toCharArray();
        }
        while (true) {
            visited = new boolean[H][W];
            crushCnt = 0;
            for (int i = 0; i < 12; i++) {
                for (int j = 0; j < 6; j++) {
                    if (!visited[i][j] && board[i][j] != '.') {
                        bfs(j, i);
                    }
                }
            }
            if (crushCnt == 0) {
                break;
            }
            result++;
            downBlock();
        }
        return result;
    }

    public static void bfs(int x, int y) {
        Deque<Node> q = new ArrayDeque<>();
        ArrayList<Node> list = new ArrayList<>();;
        list.add(new Node(x, y));
        q.offer(new Node(x, y));
        visited[y][x] = true;
        char color = board[y][x];

        while(!q.isEmpty()) {
            Node now = q.poll();
            for(int i = 0; i < 4; i++) {
                int moveX = now.x + dx[i];
                int moveY = now.y + dy[i];

                if(moveX >= 0 && moveX < W && moveY >= 0  && moveY < H && visited[moveY][moveX] == false && board[moveY][moveX] == color) {
                    visited[moveY][moveX] = true;
                    list.add(new Node(moveX, moveY));
                    q.offer(new Node(moveX, moveY));
                }
            }
        }
        //연쇄 블록 없애기
        if(list.size() >= 4) {
            for(int k = 0; k < list.size(); k++) {
                Node a = list.get(k);
                board[list.get(k).y][list.get(k).x] = '.';
            }
            crushCnt++;
        }
    }

    private static void downBlock() {
        for (int i = 0; i < W; i++) {
            for (int j = H - 1; j > 0; j--) {
                if (board[j][i] == '.') {
                    for (int k = j - 1; k >= 0; k--) {
                        if (board[k][i] != '.') {
                            board[j][i] = board[k][i];
                            board[k][i] = '.';
                            break;
                        }
                    }
                }
            }
        }
    }

    public static class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
