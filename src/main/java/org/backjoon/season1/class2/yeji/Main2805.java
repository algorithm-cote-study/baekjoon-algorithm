package org.backjoon.season1.class2.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

// 나무자르기
public class Main2805 {

    public static void main ( String[] args ) {
        try ( InputStreamReader in = new InputStreamReader( System.in ); BufferedReader br = new BufferedReader( in ) ) {

            System.out.println( solution( br ) );

        } catch ( IOException ex ) {
            ex.printStackTrace();
        }
    }

    static int solution ( BufferedReader br ) throws IOException {
        int[] n = Arrays.stream( br.readLine().split( " " ) ).mapToInt( Integer::parseInt ).toArray();
        int[] input = Arrays.stream( br.readLine().split( " " ) ).mapToInt( Integer::parseInt ).toArray();

        Arrays.sort( input );
        Deque<Integer> queue = new ArrayDeque<>();
        for ( int i = input.length - 1; i >= 0; i-- ) {
            queue.offer( input[i] );
        }

        int i = 0;
        int top = queue.poll();
        int m = 1;
        while ( !queue.isEmpty() && i < n[1] ) {

            if ( top == queue.peek() ) {
                queue.pop();
                m++;
            } else if ( top > queue.peek() ) {
                top--;
                i += m;
            }

        }

        while ( i < n[1] ) {
            top--;
            i += m;
        }

        return top;
    }
}
