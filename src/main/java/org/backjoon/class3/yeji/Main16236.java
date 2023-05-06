package org.backjoon.class3.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 아기상어
public class Main16236 {

    private static int answer = 0;
    private static int[][] space;
    private static int[] location = new int[2];
    private static int[] dx = { 0, -1, 1, 0 };
    private static int[] dy = { 1, 0, 0, -1 };
    private static int n;
    private static int kg = 2;
    private static boolean flag = false;

    public static void main ( String[] args ) {
        try ( BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) ) ) {
            System.out.println( solution( reader ) );
        } catch ( IOException e ) {
            e.printStackTrace();
        }
    }

    static int solution ( BufferedReader br ) throws IOException {
        n = Integer.parseInt( br.readLine() );
        space = new int[n][n];

        for ( int i = 0; i < n; i++ ) {
            space[i] = Arrays.stream( br.readLine().split( " " ) ).mapToInt( Integer::parseInt ).toArray();
        }

        int count = 0;
        for ( int i = 0; i < n; i++ ) {
            for ( int j = 0; j < n; j++ ) {
                if ( space[i][j] == 9 ) {
                    space[i][j] = 0;
                    location[0] = i;
                    location[1] = j;
                } else if ( space[i][j] != 0 ) {
                    count++;
                }
            }
        }

        swim( location[0], location[1], count, 0 );

        return answer;
    }

    static void swim ( int x, int y, int count, int time ) {
        if ( space[x][y] > kg ) {
            return;
        }

        if ( space[x][y] != 0 && space[x][y] < kg ) {
            count--;
            kg++;
        }

        if ( count == 0 ) {

            if ( !flag ) {
                flag = true;
                answer = time;
            }

            return;
        }

        for ( int i = 0; i < 4; i++ ) {
            int cx = x + dx[i];
            int cy = y + dy[i];
            if ( cx >= 0 && cx < n && cy >= 0 && cy < n ) {
                swim( cx, cy, count, time++ );
            }
        }
    }
}

class Node {

    int x;
    int y;

    Node ( int x, int y ) {
        this.x = x;
        this.y = y;
    }
}
