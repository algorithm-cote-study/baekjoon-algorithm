package org.backjoon.class3.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;

// 아기상어
public class Main16236 {

    private static int[][] space;
    private static int[] dx = { 0, -1, 1, 0 };
    private static int[] dy = { 1, 0, 0, -1 };

    private static int n;
    private static int[] cur = new int[2];

    public static void main ( String[] args ) {
        try ( BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) ) ) {
            System.out.println( solution( reader ) );
        } catch ( IOException e ) {
            e.printStackTrace();
        }
    }

    static int solution ( BufferedReader br ) throws IOException {
        n = Integer.parseInt( br.readLine() );
        space = new int[n][n];

        for ( int i = 0; i < n; i++ ) {
            space[i] = Arrays.stream( br.readLine().split( " " ) ).mapToInt( Integer::parseInt ).toArray();
        }
        for ( int i = 0; i < n; i++ ) {
            for ( int j = 0; j < n; j++ ) {
                if ( space[i][j] == 9 ) {
                    cur[0] = i;
                    cur[1] = j;
                    space[i][j] = 0;
                }
            }
        }

        return bfs();
    }

    private static int bfs () {
        int size = 2;
        int eat = 0; // 먹은 물고기 수
        int move = 0; // 움직인 총 거리

        while ( true ) {
            PriorityQueue<int[]> que = new PriorityQueue<>( ( o1, o2 ) -> {
                if ( o1[2] != o2[2] ) {
                    return Integer.compare( o1[2], o2[2] );
                }
                return ( o1[0] != o2[0] ? Integer.compare( o1[0], o2[0] ) : Integer.compare( o1[1], o2[1] ) );
            } );

            boolean[][] visit = new boolean[n][n];

            que.add( new int[]{ cur[0], cur[1], 0 } );
            visit[cur[0]][cur[1]] = true;

            boolean ck = false; // 상어가 먹이를 먹었는지 체크할 변수

            while ( !que.isEmpty() ) {
                cur = que.poll();
                // 먹이가 있으면서 상어의 사이즈보다 작다면?
                if ( space[cur[0]][cur[1]] != 0 && space[cur[0]][cur[1]] < size ) {
                    space[cur[0]][cur[1]] = 0;
                    eat++;
                    move += cur[2];
                    ck = true;
                    break;
                }

                for ( int k = 0; k < 4; k++ ) {
                    int ny = cur[0] + dy[k];
                    int nx = cur[1] + dx[k];

                    if ( ny >= 0 && nx < n && nx >= 0 && ny < n && !visit[ny][nx] && space[ny][nx] <= size ) {
                        que.add( new int[]{ ny, nx, cur[2] + 1 } );
                        visit[ny][nx] = true;
                    }
                }
            }

            // 큐가 비워질 때까지 먹이를 먹은적이 없다면, 더 이상 먹은 물고기가 없으므로 탈출
            if ( !ck ) {break;}
            // 사이즈와 먹이를 먹은 수가 동일하다면 상어의 크기를 증가
            if ( size == eat ) {
                size++;
                eat = 0;
            }
        }

        return move;
    }


}
