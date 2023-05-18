package org.backjoon.class3.songju;

import javax.management.NotificationEmitter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//미로 탐색
public class Main2178 {

    static boolean [][] visited;

    static int dx[] = {0, 1, 0, -1}; //왼쪽 아래 오른쪽 위
    static int dy[] = {1, 0, -1, 0};
    static int N, M;

    static int [][] miro;
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(solution(br));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int solution(BufferedReader br) throws IOException {
        int[] size = Arrays.stream( br.readLine().split( " " ) ).mapToInt( Integer::parseInt ).toArray();
        N = size[0];
        M = size[1];
        miro = new int[N][M];
        visited = new boolean[N][M];

        for(int i=0;i<N;i++){
            miro[i] =  Arrays.stream( br.readLine().split( "" ) ).mapToInt( Integer::parseInt ).toArray();
        }

        checkPath();

        return miro[N-1][M-1];
    }

    static void checkPath(){
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(new Node(0, 0));
        visited[0][0] = true;
        while(!queue.isEmpty()){
            Node nowPos = queue.poll();
            int x = nowPos.x;
            int y = nowPos.y;
            for(int i=0;i<4;i++){
                int posX = x + dx[i];
                int posY = y + dy[i];
                if(posX >= 0 && posX <N && posY >=0 && posY <M && !visited[posX][posY] && miro[posX][posY] != 0){
                    queue.offer(new Node(posX, posY));
                    miro[posX][posY] = miro[x][y] + 1;
                    visited[posX][posY] = true;
                }
            }
        }
    }

    static class Node {
        int x;
        int y;
        Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
