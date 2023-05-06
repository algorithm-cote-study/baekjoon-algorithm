package org.backjoon.class3.yeji.main7569;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Main7569Success implements Main7569 {

    private static final int[] dx = { -1, 0, 1, 0, 0, 0 };
    private static final int[] dy = { 0, 1, 0, -1, 0, 0 };
    private static final int[] dz = { 0, 0, 0, 0, 1, -1 };

    private static int m, n, h;
    private static int[][][] tomato;

    private static Deque<Node> queue;

    public int solution ( BufferedReader br ) throws IOException {
        int answer = Integer.MIN_VALUE;
        int[] input = Arrays.stream( br.readLine().split( " " ) ).mapToInt( Integer::parseInt ).toArray();
        m = input[0];
        n = input[1];
        h = input[2];
        tomato = new int[h][n][m];
        queue = new LinkedList<>();

        for ( int i = 0; i < h; i++ ) {
            for ( int j = 0; j < n; j++ ) {
                tomato[i][j] = Arrays.stream( br.readLine().split( " " ) ).mapToInt( Integer::parseInt ).toArray();
                for ( int x = 0; x < tomato[i][j].length; x++ ) {
                    if ( tomato[i][j][x] == 1 ) {
                        queue.offer( new Node( x, j, i ) );
                    }
                }
            }
        }

        dfs();

        for ( int i = 0; i < h; i++ ) {
            for ( int j = 0; j < n; j++ ) {
                for ( int x = 0; x < tomato[i][j].length; x++ ) {
                    if ( tomato[i][j][x] == 0 ) {
                        return -1;
                    }
                    answer = Math.max( answer, tomato[i][j][x] );
                }
            }
        }

        return answer - 1;
    }

    private void dfs () {
        while ( !queue.isEmpty() ) {
            Node node = queue.poll();
            int nm = node.m;
            int nn = node.n;
            int nh = node.h;

            for ( int i = 0; i < 6; i++ ) {
                int x = node.n + dx[i];
                int y = node.m + dy[i];
                int z = node.h = dz[i];
                if ( x >= 0 && x < n && y >= 0 && y < m && z >= 0 && z < h && ( tomato[z][x][y] == 0 ) ) {
                    tomato[z][x][y] = tomato[nh][nn][nm] + 1;
                    queue.offer( new Node( y, x, node.h ) );

                }
            }
        }

    }
}

class Node {

    int m;
    int n;
    int h;

    Node ( int m, int n, int h ) {
        this.m = m;
        this.n = n;
        this.h = h;
    }
}