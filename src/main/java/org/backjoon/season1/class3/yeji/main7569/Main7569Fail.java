package org.backjoon.season1.class3.yeji.main7569;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Main7569Fail implements Main7569 {

    private static int[] dx = { 1, 0, -1, 0 };
    private static int[] dy = { 0, -1, 0, 1 };

    private static int[][] tomato;
    private static boolean[][] visited;

    private static int m, n, h;

    // 실패 코드
    private void dfs ( Location poll ) {
        Deque<Location> locationDeque = new LinkedList<>();
        locationDeque.offer( poll );

        while ( !locationDeque.isEmpty() ) {
            Location cur = locationDeque.poll();

            for ( int i = 0; i < 4; i++ ) {
                int x = ( cur.x + dx[i] );
                int y = cur.y + dy[i];
                if ( x >= 0 && x < n * h && y >= 0 && y < m && tomato[x][y] != -1 && !visited[x][y] ) {
                    visited[x][y] = true;
                    if ( tomato[x][y] == 0 ) {
                        tomato[x][y] = tomato[cur.x][cur.y] + 1;
                    } else {
                        tomato[x][y] = Math.min( tomato[x][y], tomato[cur.x][cur.y] + 1 );
                    }
                    locationDeque.offer( new Location( x, y ) );
                }
            }
            int x = cur.x - n;
            int y = cur.y;
            if ( x >= 0 && tomato[x][y] != -1 && !visited[x][y] ) {
                visited[x][y] = true;
                if ( tomato[x][y] == 0 ) {
                    tomato[x][y] = tomato[cur.x][cur.y] + 1;
                } else {
                    tomato[x][y] = Math.min( tomato[x][y], tomato[cur.x][cur.y] + 1 );
                }
                locationDeque.offer( new Location( x, y ) );
            }
            x = cur.x + n;
            if ( x < n * h && tomato[x][y] != -1 && !visited[x][y] ) {
                visited[x][y] = true;
                if ( tomato[x][y] == 0 ) {
                    tomato[x][y] = tomato[cur.x][cur.y] + 1;
                } else {
                    tomato[x][y] = Math.min( tomato[x][y], tomato[cur.x][cur.y] + 1 );
                }
                locationDeque.offer( new Location( x, y ) );
            }
        }

    }

    @Override
    public int solution ( BufferedReader br ) throws IOException {
        int answer = 0;
        int[] arr = Arrays.stream( br.readLine().split( " " ) ).mapToInt( Integer::parseInt ).toArray();
        m = arr[0];
        n = arr[1];
        h = arr[2];
        tomato = new int[arr[1] * arr[2]][arr[0]];
        visited = new boolean[arr[1] * arr[2]][arr[0]];

        for ( int i = 0; i < arr[1] * arr[2]; i++ ) {
            tomato[i] = Arrays.stream( br.readLine().split( " " ) ).mapToInt( Integer::parseInt ).toArray();
        }

        Queue<Location> queue = new LinkedList<>();
        for ( int i = 0; i < arr[1] * arr[2]; i++ ) {
            for ( int j = 0; j < arr[0]; j++ ) {
                if ( tomato[i][j] == 1 ) {
                    queue.offer( new Location( i, j ) );
                }
            }
        }

        while ( !queue.isEmpty() ) {
            Location poll = queue.poll();
            visited[poll.x][poll.y] = true;
            dfs( poll );
        }

        for ( int i = 0; i < arr[1] * arr[2]; i++ ) {
            for ( int j = 0; j < arr[0]; j++ ) {
                if ( tomato[i][j] == 0 ) {
                    return -1;
                }
                answer = Math.max( answer, tomato[i][j] );
            }
        }
        return answer - 1;
    }
}

class Location {

    int x;
    int y;

    Location (
        int x, int y
    ) {
        this.x = x;
        this.y = y;
    }
}

