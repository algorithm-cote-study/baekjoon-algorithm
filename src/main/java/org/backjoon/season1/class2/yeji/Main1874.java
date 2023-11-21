package org.backjoon.season1.class2.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

// 스택수열
public class Main1874 {

    public static void main ( String[] args ) {
        try ( InputStreamReader in = new InputStreamReader( System.in ); BufferedReader br = new BufferedReader( in ) ) {

            for ( String s : solution( br ) ) {
                System.out.println( s );
            }

        } catch ( IOException ex ) {
            ex.printStackTrace();
        }
    }

    static String[] solution ( BufferedReader br ) throws IOException {
        List<String> answer = new ArrayList<>();
        Deque<Integer> stack = new ArrayDeque<>();
        int n = Integer.parseInt( br.readLine() );
        int[] input = new int[n];

        for ( int i = 0; i < n; i++ ) {
            input[i] = Integer.parseInt( br.readLine() );
        }

        int i = 0;
        int num = 1;
        while ( i < n && num <= n ) {
            stack.push( num );
            answer.add( "+" );
            if ( stack.peek() == input[i] ) {
                while ( !stack.isEmpty() && stack.peek() == input[i] ) {
                    stack.pop();
                    answer.add( "-" );
                    i++;
                }
            }
            num++;
        }

        return !stack.isEmpty() ? new String[]{ "NO" } : answer.toArray( new String[0] );
    }
}
