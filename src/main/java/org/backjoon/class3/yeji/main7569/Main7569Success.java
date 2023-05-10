package org.backjoon.class3.yeji.main7569;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

// 토마토 7569 성공풀이
public class Main7569Success implements Main7569 {

    private static final int[] dz = { -1, 0, 1, 0, 0, 0 };
    private static final int[] dy = { 0, 1, 0, -1, 0, 0 };
    private static final int[] dx = { 0, 0, 0, 0, 1, -1 };

    private static int m, n, h;
    private int[][][] tomato;

    private static Deque<int[]> queue;

    public int solution ( BufferedReader br ) throws IOException {
        int answer = 0;
        int[] input = Arrays.stream( br.readLine().split( " " ) ).mapToInt( Integer::parseInt ).toArray();
        m = input[0];
        n = input[1];
        h = input[2];
        tomato = new int[h][n][m];
        queue = new LinkedList<>();

        // tomato 넣기
        for ( int i = 0; i < h; i++ ) {
            for ( int j = 0; j < n; j++ ) {
                tomato[i][j] = Arrays.stream( br.readLine().split( " " ) ).mapToInt( Integer::parseInt ).toArray();
                for ( int x = 0; x < tomato[i][j].length; x++ ) {
                    if ( tomato[i][j][x] == 1 ) {
                        queue.offer( new int[]{ i, j, x } );
                    }
                }
            }
        }

        bfs();

        for ( int i = 0; i < h; i++ ) {
            for ( int j = 0; j < n; j++ ) {
                for ( int x = 0; x < tomato[i][j].length; x++ ) {
                    if ( tomato[i][j][x] == 0 ) {
                        return -1;
                    }
                    answer = Math.max( answer, tomato[i][j][x] );
                }
            }
        }

        return answer - 1;
    }

    private void bfs () {
        while ( !queue.isEmpty() ) {
            int[] cur = queue.poll();
            int nowX = cur[0];
            int nowY = cur[1];
            int nowZ = cur[2];

            for ( int i = 0; i < 6; i++ ) {
                int curX = nowX + dx[i];
                int curY = nowY + dy[i];
                int curZ = nowZ + dz[i];

                if ( curX >= 0 && curX < h && curY >= 0 && curY < n && curZ >= 0 && curZ < m ) {
                    if ( tomato[curX][curY][curZ] == 0 ) {
                        queue.offer( new int[]{ curX, curY, curZ } );
                        tomato[curX][curY][curZ] = tomato[nowX][nowY][nowZ] + 1;
                    }
                }
            }
        }
    }

}