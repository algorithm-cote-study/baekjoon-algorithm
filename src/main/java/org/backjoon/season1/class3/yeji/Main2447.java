package org.backjoon.season1.class3.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 별찍기 10
public class Main2447 {

    private static char[][] arr;

    public static void main ( String[] args ) {
        try ( InputStreamReader in = new InputStreamReader( System.in ); BufferedReader br = new BufferedReader( in ); ) {

            System.out.println( solution( br ) );

        } catch ( IOException ex ) {
            ex.printStackTrace();
        }
    }

    static String solution ( BufferedReader br ) throws IOException {
        StringBuilder answer = new StringBuilder();
        int n = Integer.parseInt( br.readLine() );

        arr = new char[n][n];

        start( 0, 0, n, false );

        for ( int i = 0; i < n; i++ ) {
            for ( int j = 0; j < n; j++ ) {
                answer.append( arr[i][j] );
            }
            answer.append( '\n' );
        }

        return answer.toString();
    }

    static void start ( int x, int y, int n, boolean blank ) {

        if ( blank ) {
            for ( int i = x; i < x + n; i++ ) {
                for ( int j = y; j < y + n; j++ ) {
                    arr[i][j] = ' ';
                }
            }
            return;
        }

        if ( n == 1 ) {
            arr[x][y] = '*';
            return;
        }

        int size = n / 3;
        int count = 0;
        for ( int i = x; i < x + n; i += size ) {
            for ( int j = y; j < y + n; j += size ) {
                count++;
                start( i, j, size, count == 5 );
            }
        }

    }


}
