package org.backjoon.class2.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 랜선 자르기
public class Main1654 {

    public static void main ( String[] args ) {
        try ( InputStreamReader in = new InputStreamReader( System.in ); BufferedReader br = new BufferedReader( in ) ) {

            System.out.println( solution( br ) );

        } catch ( IOException ex ) {
            ex.printStackTrace();
        }
    }

    static long solution ( BufferedReader br ) throws IOException {
        int[] n = Arrays.stream( br.readLine().split( " " ) ).mapToInt( Integer::parseInt ).toArray();
        int[] input = new int[n[0]];
        int max = 0;
        for ( int i = 0; i < input.length; i++ ) {
            input[i] = Integer.parseInt( br.readLine() );
            max = Math.max( max, input[i] );
        }

        long end = findMaxLength( n, input, max );

        return end;
    }

    private static long findMaxLength ( int[] n, int[] input, int max ) {
        long start = 1;
        long end = max;

        while ( start <= end ) {
            long mod = ( start + end ) / 2;
            int count = 0;
            for ( int i = 0; i < input.length; i++ ) {
                count += input[i] / mod;
            }

            if ( count >= n[1] ) {
                start = mod + 1;
            } else {
                end = mod - 1;
            }
        }
        return end;
    }
}
