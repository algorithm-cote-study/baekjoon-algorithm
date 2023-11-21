package org.backjoon.season1.class3.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 리모컨
public class Main1107 {

    private static int n, target;
    private static boolean[] brokenButton = new boolean[10];

    public static void main ( String[] args ) {
        try ( BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) ) ) {

            System.out.println( solution( reader ) );

        } catch ( IOException e ) {
            e.printStackTrace();
        }
    }

    static int solution ( BufferedReader br ) throws IOException {
        target = Integer.parseInt( br.readLine() );
        n = Integer.parseInt( br.readLine() );
        if ( n != 0 ) {
            Arrays.stream( br.readLine().split( " " ) ).mapToInt( Integer::parseInt ).forEach( e -> brokenButton[e] = true );
        }

        int ans = Math.abs( 100 - target );

        for ( int i = 0; i <= 999999; i++ ) {

            String cur = Integer.toString( i );
            boolean check = false;

            for ( int j = 0; j < cur.length(); j++ ) {
                if ( brokenButton[cur.charAt( j ) - '0'] ) {
                    check = true; // 고장난 버튼이면 break
                    break;
                }
            }
            if ( !check ) // 고장안났으면 target 까지 거리 계산해서 갱신
            {ans = Math.min( ans, cur.length() + Math.abs( i - target ) );}
        }

        return ans;
    }


}
