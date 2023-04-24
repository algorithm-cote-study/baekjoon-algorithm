package org.backjoon.class2.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 종말의 수
public class Main1436 {

    public static void main ( String[] args ) {
        try ( InputStreamReader in = new InputStreamReader( System.in ); BufferedReader br = new BufferedReader( in ) ) {

            System.out.println( solution( br ) );

        } catch ( IOException ex ) {
            ex.printStackTrace();
        }
    }

    static int solution ( BufferedReader br ) throws IOException {
        int n = Integer.parseInt( br.readLine() );
        int i = 0;
        int count = 0;
        boolean flag = true;
        while ( flag ) {
            count++;

            if ( String.valueOf( count ).contains( "666" ) ) {
                i++;
            }
            if ( i == n ) {
                flag = false;
            }

        }

        return count;
    }
}
