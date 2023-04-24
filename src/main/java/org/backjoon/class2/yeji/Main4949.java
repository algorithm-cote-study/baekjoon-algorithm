package org.backjoon.class2.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

// 균형잡힌 세상
public class Main4949 {

    public static void main ( String[] args ) {
        try ( InputStreamReader in = new InputStreamReader( System.in ); BufferedReader br = new BufferedReader( in ) ) {

            System.out.println( solution( br ) );

        } catch ( IOException ex ) {
            ex.printStackTrace();
        }
    }

    static String solution ( BufferedReader br ) throws IOException {
        StringBuilder answer = new StringBuilder();
        String line;
        while ( !( line = br.readLine() ).equals( "." ) ) {
            String[] input = line.split( "" );
            if ( isCollectParentheses( input ) ) {
                answer.append( "yes" ).append( "\n" );
            } else {
                answer.append( "no" ).append( "\n" );
            }
        }

        return answer.toString();
    }

    private static boolean isCollectParentheses ( String[] input ) {
        Deque<String> stack = new ArrayDeque<>();
        
        for ( String in : input ) {
            switch ( in ) {
                case "(", "[" -> stack.push( in );
                case "]" -> {
                    if ( !stack.isEmpty() && stack.peek().equals( "[" ) ) {
                        stack.pop();
                    } else {
                        stack.push( in );
                    }
                }
                case ")" -> {
                    if ( !stack.isEmpty() && stack.peek().equals( "(" ) ) {
                        stack.pop();
                    } else {
                        stack.push( in );
                    }
                }
            }
        }

        return stack.isEmpty();
    }
}
