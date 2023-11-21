package org.backjoon.season1.class2.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//체스판 다시 칠하기
public class Main1018 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            solution(br);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static int solution(BufferedReader br) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int row = Integer.parseInt(st.nextToken());
        int col = Integer.parseInt(st.nextToken());

        boolean [][] board = new boolean [row][col];

        /* 입력받은 보드 생성 */
        for(int i =  0 ; i < row ; i++) {
            String str = br.readLine();
            for(int j=0;j<col;j++){
                board[i][j] = str.charAt(j)=='W';
            }
        }

        /* 8 * 8 보드를 만들기위한 이동범위 x,y좌표 구하기 */
        int x = row-7;
        int y = col-7;
        int result = 64;
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                result = Math.min(result, coloring(board, i, j));
            }
        }
        return result;
    }

    public static int coloring(boolean[][] board, int x, int y){
        int cnt = 0;
        boolean color = board[x][y]; //보드 첫번째 줄 첫번째 칸 색
        for(int i=x;i<x+8;i++){
            for(int j=y;j<y+8;j++){
                //색이 바뀌어야하는 칸의 경우
                if(board[i][j] != color) cnt++;
                //줄의 마지막 칸이 아닌경우 색상 반전, 마지막칸은 다음줄의 첫번째 칸과 색이 같아야 하므로 반전X
                if(j != y+7) color = !color;
            }
        }
        return Math.min(cnt, 64-cnt);
    }
}