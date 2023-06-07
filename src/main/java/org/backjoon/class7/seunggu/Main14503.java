package org.backjoon.class7.seunggu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 로봇 청소기 ( 골드 5 )
 */
public class Main14503 {

    private static int y;
    private static int x;
    private static int count;
	private static int[][] board;
	private static final int[] dy = {-1,0,1,0};
	private static final int[] dx = {0,1,0,-1};
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(solution(reader));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static int solution(BufferedReader reader) throws IOException {
        int[] array = splitNumbers(reader);
        y = array[0];
        x = array[1];
        count = 1;

        board = new int[y][x];
        array = splitNumbers(reader);
        int r = array[0];
        int c = array[1];
        int d = array[2];

        for(int i=0; i<y; i++) {
            array = splitNumbers(reader);
            if (x >= 0) System.arraycopy(array, 0, board[i], 0, x);
        }
        dfs(r,c,d);
        return count;
    }

    private static void dfs(int r, int c, int direction) {
        board[r][c] = -1;

        for(int i=0; i<dx.length; i++) {
            direction = (direction + 3) % 4;
            int ny = r + dy[direction];
            int nx = c + dx[direction];

            if(ny >=0 && ny < y && nx >= 0 && nx < x && board[ny][nx] == 0) {
				count++;
				dfs(ny,nx, direction);
				return;
			}
        }

        int back = (direction + 2) % 4;
		int by = r + dy[back];
		int bx = c + dx[back];

		if(by>=0 && by< y && bx>=0 && bx< x && board[by][bx] != 1) {
			dfs(by,bx,direction);
		}
    }
    private static int[] splitNumbers(BufferedReader reader) throws IOException {
        return Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    }

}
