package org.backjoon.class2.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 팰린드롬 수
public class Main1259 {

    public static void main ( String[] args ) {
        try ( InputStreamReader in = new InputStreamReader( System.in ); BufferedReader br = new BufferedReader( in ); ) {

            System.out.println( solution( br ) );

        } catch ( IOException ex ) {
            ex.printStackTrace();
        }
    }

    static String solution ( BufferedReader br ) throws IOException {
        StringBuilder answer = new StringBuilder();
        String input;
        while ( !( input = br.readLine() ).equals( "0" ) ) {

            if ( input.equals( new StringBuilder( input ).reverse().toString() ) ) {
                answer.append( "yes" ).append( "\n" );
            } else {
                answer.append( "no" ).append( "\n" );
            }

        }

        return answer.toString();
    }
}
