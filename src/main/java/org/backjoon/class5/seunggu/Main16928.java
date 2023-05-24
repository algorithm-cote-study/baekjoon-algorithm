package org.backjoon.class5.seunggu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 뱀과 사다리 게임
 */
public class Main16928 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int[] board = new int[101];
            board[1] = 0;
            int[] snake = new int[101];
            boolean [] visited = new boolean[101];
            visited[1] = true;
            int[] array = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int n = array[0];
            int m = array[1];
            for (int i=0; i<n+m; i++) {
                array = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
                snake[array[0]] = array[1];
            }
            bfs(board, snake, visited);
            System.out.println(board[100]);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void bfs(int[] board, int[] snake, boolean[] visited) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        while (!queue.isEmpty()) {
            int now = queue.poll();
            for(int i=1; i<7; i++) {
                int next = now + i;
                if( 100 >= next && !visited[next] ) {
                    visited[next] = true;
                    if(snake[next] != 0) {
                        if(!visited[snake[next]]) {
                            queue.offer(snake[next]);
                            visited[snake[next]] = true;
                            board[snake[next]] = board[now] + 1;
                        }
                    } else {
                        queue.offer(next);
                        board[next] = board[now] + 1;
                    }
                }
            }
        }
    }

}
