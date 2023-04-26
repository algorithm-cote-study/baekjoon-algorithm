package org.backjoon.class3.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 피보나치 함수
public class Main1003 {

    static int zero;
    static int one;
    static int zero_plus_one;
    private static int[][] answer;

    public static void main ( String[] args ) {
        try ( BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) ) ) {

            solution( reader );

        } catch ( IOException e ) {
            e.printStackTrace();
        }
    }

    static int[][] solution ( BufferedReader br ) throws IOException {
        int n = Integer.parseInt( br.readLine() );
        answer = new int[n][2];
        StringBuilder sb = new StringBuilder();

        for ( int i = 0; i < n; i++ ) {
            int N = Integer.parseInt( br.readLine() );
            fibonacci( N );
            answer[i][0] = zero;
            answer[i][1] = one;
            sb.append( zero ).append( ' ' ).append( one ).append( '\n' );
        }
        System.out.println( sb );
        return answer;
    }

    public static void fibonacci ( int N ) {
        // 반드시 초기화 해야한다.
        zero = 1;
        one = 0;
        zero_plus_one = 1;

        for ( int i = 0; i < N; i++ ) {
            zero = one;
            one = zero_plus_one;
            zero_plus_one = zero + one;
        }

    }


}
