package org.backjoon.class2.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Iterator;

// 프린터 큐
public class Main1966 {

    public static void main ( String[] args ) {
        try ( InputStreamReader in = new InputStreamReader( System.in ); BufferedReader br = new BufferedReader( in ); ) {

            for ( int s : solution( br ) ) {
                System.out.println( s );
            }

        } catch ( IOException ex ) {
            ex.printStackTrace();
        }
    }

    static int[] solution ( BufferedReader br ) throws IOException {
        int n = Integer.parseInt( br.readLine() );
        int[] result = new int[n];

        for ( int i = 0; i < n; i++ ) {
            int[] input = Arrays.stream( br.readLine().split( " " ) ).mapToInt( Integer::parseInt ).toArray();
            int[] location = Arrays.stream( br.readLine().split( " " ) ).mapToInt( Integer::parseInt ).toArray();

            result[i] = queue( input, location );
        }

        return result;
    }

    private static int queue ( int[] input, int[] location ) {
        int[][] result = new int[location.length][2];
        Deque<int[]> queue = new ArrayDeque<>();

        for ( int i = 0; i < location.length; i++ ) {
            queue.offer( new int[]{ i, location[i] } );
        }

        int i = 0;
        while ( !queue.isEmpty() ) {
            int[] poll = queue.poll();
            Iterator<int[]> iterator = queue.iterator();
            boolean flag = true;
            while ( iterator.hasNext() ) {
                if ( poll[1] < iterator.next()[1] ) {
                    queue.offer( poll );
                    flag = false;
                    break;
                }
            }
            if ( flag ) {
                result[i] = poll;
                i++;
            }
        }

        for ( int r = 0; r < result.length; r++ ) {
            if ( result[r][0] == input[1] ) {return r + 1;}
        }

        return 0;
    }


}
