package org.backjoon.class3.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.List;

// dfs와 bfs
public class Main1260 {

    static int[] dfs;
    static int[] bfs;

    static boolean[] visited;
    private static final List<List<Integer>> nodeList = new ArrayList<>();

    public static void main ( String[] args ) {
        try ( BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) ) ) {
            solution( reader );

        } catch ( IOException e ) {
            e.printStackTrace();
        }
    }

    static void solution ( BufferedReader br ) throws IOException {
        int[] n = Arrays.stream( br.readLine().split( " " ) ).mapToInt( Integer::parseInt ).toArray();
        bfs = new int[n[0]];
        dfs = new int[n[0]];
        visited = new boolean[n[0] + 1];
        for ( int i = 0; i <= n[0]; i++ ) {
            nodeList.add( new ArrayList<>() );
        }

        for ( int i = 0; i < n[1]; i++ ) {
            int[] input = Arrays.stream( br.readLine().split( " " ) ).mapToInt( Integer::parseInt ).toArray();
            nodeList.get( input[1] ).add( input[0] );
            nodeList.get( input[0] ).add( input[1] );
        }

        for ( int i = 0; i <= n[0]; i++ ) {
            Collections.sort( nodeList.get( i ) );
        }
        dfs( n[2], n[0], 0 );
        System.out.println();
        bfs( n[2], n[0] );
    }

    static void bfs ( int start, int n ) {
        boolean[] visited = new boolean[n + 1];
        Deque<Integer> queue = new ArrayDeque<>();
        visited[start] = true;
        queue.offer( start );
        while ( !queue.isEmpty() ) {
            int num = queue.poll();
            System.out.print( num + " " );
            for ( int node : nodeList.get( num ) ) {
                if ( !visited[node] ) {
                    visited[node] = true;
                    queue.offer( node );
                }
            }
        }
    }

    static void dfs ( int start, int n, int i ) {
        visited[start] = true;
        System.out.print( start + " " );
        for ( int node : nodeList.get( start ) ) {
            if ( !visited[node] ) {
                dfs( node, n, i + 1 );
            }
        }
    }
}
