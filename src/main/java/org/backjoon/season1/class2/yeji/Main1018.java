package org.backjoon.season1.class2.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 체스판 다시 칠하기
public class Main1018 {

    private static String[][] chess;
    private static String[] com = { "WBWBWBWB", "BWBWBWBW" };

    public static void main ( String[] args ) {
        try ( InputStreamReader in = new InputStreamReader( System.in ); BufferedReader br = new BufferedReader( in ) ) {

            System.out.println( solution( br ) );

        } catch ( IOException ex ) {
            ex.printStackTrace();
        }
    }

    static int solution ( BufferedReader br ) throws IOException {
        int[] input = Arrays.stream( br.readLine().split( " " ) ).mapToInt( Integer::parseInt ).toArray();
        chess = new String[input[0]][input[1]];
        int answer = Integer.MAX_VALUE;

        for ( int i = 0; i < input[0]; i++ ) {
            String[] split = br.readLine().split( "" );
            chess[i] = split;
        }

        for ( int i = 0; i <= input[0] - 8; i++ ) {
            for ( int j = 0; j <= input[1] - 8; j++ ) {
                answer = Math.min( answer, minChangedChess( i, j ) );
            }
        }

        return answer;
    }

    private static int minChangedChess ( int x, int y ) {
        int result = 0;

        // 시작이 B로 시작됐을때
        // 홀,홀 : B , 짝,홀 : W
        for ( int i = 0; i < 8; i++ ) {
            String[] s = com[( i % 2 )].split( "" );
            for ( int j = 0; j < 8; j++ ) {
                if ( !s[j].equals( chess[i + x][y + j] ) ) {
                    result++;
                }
            }
        }

        return Math.min( result, 64 - result );
    }


}
