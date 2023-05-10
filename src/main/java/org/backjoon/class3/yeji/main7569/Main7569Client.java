package org.backjoon.class3.yeji.main7569;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 토마토 7569
public class Main7569Client {

    private static Main7569 main7569 = new Main7569Success();

    public static void main ( String[] args ) {
        try ( BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) ) ) {

            System.out.println( main7569.solution( reader ) );

        } catch ( IOException e ) {
            e.printStackTrace();
        }
    }

}
