package org.backjoon.class2.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// 단어정렬
public class Main1181 {

    public static void main ( String[] args ) {
        try ( InputStreamReader in = new InputStreamReader( System.in ); BufferedReader br = new BufferedReader( in ); ) {

            for ( String s : solution( br ) ) {
                System.out.println( s );
            }

        } catch ( IOException ex ) {
            ex.printStackTrace();
        }
    }

    static String[] solution ( BufferedReader br ) throws IOException {
        List<String> alphabets = new ArrayList<>();
        int n = Integer.parseInt( br.readLine() );

        for ( int i = 0; i < n; i++ ) {
            alphabets.add( br.readLine() );
        }

        alphabets.sort( new Comparator<String>() {
            @Override
            public int compare ( String o1, String o2 ) {
                if ( o1.length() == o2.length() ) {
                    return o1.compareTo( o2 );
                }
                return o1.length() - o2.length();
            }
        } );

        return alphabets.stream().distinct().collect( Collectors.toList() ).toArray( new String[0] );
    }
}
