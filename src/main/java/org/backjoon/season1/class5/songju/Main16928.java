package org.backjoon.season1.class5.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

//뱀과 사다리 게임
public class Main16928 {
    static int [] board;

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(solution(br));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int solution(BufferedReader br) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int ladder = Integer.parseInt(st.nextToken());
        int snake = Integer.parseInt(st.nextToken());
        board = new int[101];
        for(int i=1;i<101;i++){
            board[i] = i;
        }
        for(int i=0;i<ladder+snake;i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine()," ");
            int originPos = Integer.parseInt(st2.nextToken());
            int jumpToPos = Integer.parseInt(st2.nextToken());
            board[originPos] = jumpToPos;
        }
        return rollingDice(1);
    }

    static int rollingDice(int start){
        Deque<Integer> deque = new ArrayDeque<>();
        int [] visited = new int[101];
        deque.offer(start);
        visited[start] = 0;
        while(!deque.isEmpty()){
            int nowPos = deque.poll();
            for(int i=1;i<7;i++){
                int movePos = nowPos + i;
                if(movePos <=100 && visited[board[movePos]] == 0){
                    deque.offer(board[movePos]);
                    visited[board[movePos]] = visited[nowPos] +1;
                }
                if(nowPos == 100){
                    return visited[100];
                }
            }
        }
        return visited[100];
    }
}
