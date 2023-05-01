package org.backjoon.class3.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 잃어버린 괄호
public class Main1541 {

    public static void main ( String[] args ) {
        try ( BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) ) ) {
            System.out.println( solution( reader ) );

        } catch ( IOException e ) {
            e.printStackTrace();
        }
    }

    static int solution ( BufferedReader br ) throws IOException {
        int answer = 0;
        String[] splitedMinus = br.readLine().split( "-" );

        for ( int i = splitedMinus.length - 1; i > 0; i-- ) {
            int sum = Arrays.stream( splitedMinus[i].split( "\\+" ) ).mapToInt( Integer::parseInt ).sum();
            answer -= sum;
        }

        return answer + Arrays.stream( splitedMinus[0].split( "\\+" ) ).mapToInt( Integer::parseInt ).sum();
    }
}
