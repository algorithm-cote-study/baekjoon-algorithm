package org.backjoon.class3.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

// 미로탐색
public class Main2178 {

    private static boolean[][] visited;
    private static int[][] mirro;
    private static int x, y;
    private static int[] dx = { -1, 0, 1, 0 };
    private static int[] dy = { 0, -1, 0, 1 };

    public static void main ( String[] args ) {
        try ( BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) ) ) {
            System.out.println( solution( reader ) );

        } catch ( IOException e ) {
            e.printStackTrace();
        }
    }

    static int solution ( BufferedReader reader ) throws IOException {

        int[] n = Arrays.stream( reader.readLine().split( " " ) ).mapToInt( Integer::parseInt ).toArray();
        x = n[0];
        y = n[1];
        mirro = new int[x][y];
        visited = new boolean[x][y];

        for ( int i = 0; i < x; i++ ) {
            mirro[i] = Arrays.stream( reader.readLine().split( "" ) ).mapToInt( Integer::parseInt ).toArray();
        }

        visited[0][0] = true;
        mirro[0][0] = 1;
        bfs( 0, 0 );
        return mirro[x - 1][y - 1];
    }

    static void bfs ( int i, int j ) {
        Deque<int[]> deque = new ArrayDeque<>();
        deque.offer( new int[]{ i, j } );

        while ( !deque.isEmpty() ) {
            int[] poll = deque.poll();
            for ( int c = 0; c < 4; c++ ) {
                int cx = poll[0] + dx[c];
                int cy = poll[1] + dy[c];
                if ( cx >= 0 && cx < x && cy >= 0 && cy < y ) {
                    if ( !visited[cx][cy] && mirro[cx][cy] != 0 ) {
                        deque.offer( new int[]{ cx, cy } );
                        visited[cx][cy] = true;
                        mirro[cx][cy] = mirro[poll[0]][poll[1]] + 1;
                    }
                }
            }
        }

    }

}
