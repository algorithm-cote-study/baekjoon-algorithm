package org.backjoon.class2.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

// 요수푸스 문제0
public class Main11866 {

    public static void main ( String[] args ) {
        try ( InputStreamReader in = new InputStreamReader( System.in ); BufferedReader br = new BufferedReader( in ); ) {

            System.out.println( solution( br ) );

        } catch ( IOException ex ) {
            ex.printStackTrace();
        }
    }

    static String solution ( BufferedReader br ) throws IOException {
        StringBuilder answer = new StringBuilder();
        answer.append( "<" );
        int[] inputs = Arrays.stream( br.readLine().split( " " ) ).mapToInt( Integer::parseInt ).toArray();

        Deque<Integer> queue = new ArrayDeque<>();
        for ( int i = 1; i <= inputs[0]; i++ ) {
            queue.offer( i );
        }

        int location = 1;
        while ( !queue.isEmpty() ) {
            if ( location == inputs[1] ) {
                answer.append( queue.poll() ).append( ", " );
                location = 1;
                continue;
            }
            int poll = queue.poll();
            queue.offer( poll );
            location++;
        }
        answer.deleteCharAt( answer.length() - 1 );
        answer.deleteCharAt( answer.length() - 1 );
        answer.append( ">" );
        return answer.toString();
    }
}
