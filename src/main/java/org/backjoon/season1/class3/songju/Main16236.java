package org.backjoon.season1.class3.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

//아기 상어
public class Main16236 {
    static int board [][];

    static int dx[] = {0, 1, 0, -1}; //왼쪽 아래 오른쪽 위
    static int dy[] = {1, 0, -1, 0};
    static Queue<Node> queue = new LinkedList<>();
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(solution(br));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int solution(BufferedReader br) throws IOException {
        int N = Integer.parseInt(br.readLine());
        board = new int [N][N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < N; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
                if(board[i][j] == 9){
                    queue.add(new Node(i, j, 0));
                    board[i][j] = 0;
                }
            }
        }

        return hunt(N);
    }

    static int hunt(int N){
        int cntOfHunt = 0;
        int huntTime = 0;
        int babySharkSize = 2;
        while(true){
            LinkedList<Node> fish = new LinkedList<>();
            int[][] dist = new int[N][N];

            while (!queue.isEmpty()) {
                Node babySharkPos = queue.poll();
                for(int i=0; i<4; i++){
                    int x = babySharkPos.x + dx[i];
                    int y = babySharkPos.y + dy[i];
                    //좌표가 보드판 사이즈 내에 있어야하고, 상어와 거리 책정이 안됐고, 아기상어 크기보다 작거나 같을 때 이동
                    if(x >= 0 && y >= 0 && x < N && y < N && dist[x][y]==0 && board[x][y] <= babySharkSize){
                        dist[x][y] = dist[babySharkPos.x][babySharkPos.y] + 1; // 거리 책정
                        queue.add(new Node(x, y, dist[x][y])); // 이동한 아기상어 위치 넣기
                        //이동 위치에 물고기가 있고 아기상어 크기보다 작을 경우 먹기
                        if(board[x][y] > 0 && board[x][y] <= 6 && board[x][y] < babySharkSize) {
                            fish.add(new Node(x, y, dist[x][y]));
                        }
                    }
                }
            }

            if(fish.size() == 0)
                return huntTime;

            Node nearFish = fish.get(0);
            //가장 가까운 거리에 있는 물고기 찾기
            for(int i = 1; i < fish.size(); i++){
                if(nearFish.dist > fish.get(i).dist) {
                    nearFish = fish.get(i);
                }
                else if(nearFish.dist == fish.get(i).dist) {
                    if((nearFish.x > fish.get(i).x) || (nearFish.x == fish.get(i).x && nearFish.y > fish.get(i).y))
                        nearFish = fish.get(i);
                }
            }

            cntOfHunt++;
            huntTime += nearFish.dist;
            board[nearFish.x][nearFish.y] = 0;
            if(cntOfHunt == babySharkSize) {
                babySharkSize++;
                cntOfHunt = 0;
            }
            queue.add(new Node(nearFish.x, nearFish.y, 0));
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
