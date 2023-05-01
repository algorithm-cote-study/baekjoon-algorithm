package org.backjoon.class3.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

// 토마토
public class Main7576 {

    private static boolean[][] visited;
    private static int[][] box;
    private static int n, m;
    private static int[] dx = { 1, 0, -1, 0 };
    private static int[] dy = { 0, -1, 0, 1 };

    private static Deque<int[]> queue = new ArrayDeque<>();

    public static void main ( String[] args ) {
        try ( BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) ) ) {
            System.out.println( solution( reader ) );

        } catch ( IOException e ) {
            e.printStackTrace();
        }
    }

    static int solution ( BufferedReader br ) throws IOException {
        int answer = 0;
        int[] input = Arrays.stream( br.readLine().split( " " ) ).mapToInt( Integer::parseInt ).toArray();
        n = input[0];
        m = input[1];
        visited = new boolean[m][n];
        box = new int[m][n];

        for ( int i = 0; i < m; i++ ) {
            box[i] = Arrays.stream( br.readLine().split( " " ) ).mapToInt( Integer::parseInt ).toArray();
        }

        for ( int i = 0; i < m; i++ ) {
            for ( int j = 0; j < n; j++ ) {
                if ( box[i][j] == 1 ) {queue.offer( new int[]{ i, j } );}
            }
        }

        while ( !queue.isEmpty() ) {
            int[] poll = queue.poll();
            dfs( poll );
        }

        for ( int i = 0; i < m; i++ ) {
            for ( int j = 0; j < n; j++ ) {
                if ( box[i][j] == 0 ) {return -1;}
                answer = Math.max( answer, box[i][j] );
            }
        }

        return answer - 1;
    }

    private static void dfs ( int[] poll ) {
        int x = poll[0];
        int y = poll[1];
        for ( int i = 0; i < 4; i++ ) {
            int px = dx[i] + x;
            int py = dy[i] + y;
            if ( px >= 0 && px < m && py >= 0 && py < n ) {
                if ( box[px][py] == 0 ) {
                    box[px][py] += box[x][y];
                    box[px][py]++;
                    queue.offer( new int[]{ px, py } );
                }
            }
        }
    }

}
