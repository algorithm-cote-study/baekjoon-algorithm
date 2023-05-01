package org.backjoon.class3.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

// 최대 힙
// 1. 배열에 자연수 x를 넣는다.
// 2. 배열에서 가장 큰 값을 출력하고, 그 값을 배열에서 제거한다.
public class Main11279 {

    public static void main ( String[] args ) {
        try ( BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) ) ) {
            System.out.println( solution( reader ) );
        } catch ( IOException e ) {
            e.printStackTrace();
        }
    }

    static String solution ( BufferedReader br ) throws IOException {
        int n = Integer.parseInt( br.readLine() );
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>( Collections.reverseOrder() );
        StringBuilder answer = new StringBuilder();
        for ( int i = 0; i < n; i++ ) {
            int num = Integer.parseInt( br.readLine() );
            if ( num == 0 ) {
                if ( priorityQueue.isEmpty() ) {
                    answer.append( "0" ).append( "\n" );
                } else {
                    answer.append( priorityQueue.poll() ).append( "\n" );
                }
            } else {
                priorityQueue.offer( num );
            }
        }

        return answer.toString();
    }
}
