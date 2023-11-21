package org.backjoon.season1.class2.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 소수구하기
public class Main1929 {

    public static void main ( String[] args ) {
        try ( InputStreamReader in = new InputStreamReader( System.in ); BufferedReader br = new BufferedReader( in ) ) {

            for ( int s : solution( br ) ) {
                System.out.println( s );
            }

        } catch ( IOException ex ) {
            ex.printStackTrace();
        }
    }

    static int[] solution ( BufferedReader br ) throws IOException {
        List<Integer> result = new ArrayList<>();
        int[] input = Arrays.stream( br.readLine().split( " " ) ).mapToInt( Integer::parseInt ).toArray();
        boolean[] isPrime = new boolean[input[1] + 1];
        isPrime[1] = true;
        for ( int i = 2; ( i * i ) <= input[1]; i++ ) {
            for ( int j = i * i; j <= input[1]; j += i ) {
                isPrime[j] = true;
            }
        }

        for ( int i = input[0]; i <= input[1]; i++ ) {
            if ( !isPrime[i] ) {
                result.add( i );
            }
        }

        return result.stream().mapToInt( i -> i ).toArray();
    }
}
