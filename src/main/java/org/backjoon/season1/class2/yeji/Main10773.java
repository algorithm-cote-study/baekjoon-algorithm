package org.backjoon.season1.class2.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

// 제로
public class Main10773 {

    public static void main ( String[] args ) {
        try ( InputStreamReader in = new InputStreamReader( System.in ); BufferedReader br = new BufferedReader( in ) ) {

            System.out.println( solution( br ) );

        } catch ( IOException ex ) {
            ex.printStackTrace();
        }
    }

    static int solution ( BufferedReader br ) throws IOException {
        int n = Integer.parseInt( br.readLine() );
        int answer = 0;
        Deque<Integer> stack = new ArrayDeque<>();
        for ( int i = 0; i < n; i++ ) {
            int num = Integer.parseInt( br.readLine() );
            if ( num != 0 ) {
                stack.push( num );
            } else {
                stack.pop();
            }
        }

        while ( !stack.isEmpty() ) {
            answer += stack.pop();
        }

        return answer;
    }
}
