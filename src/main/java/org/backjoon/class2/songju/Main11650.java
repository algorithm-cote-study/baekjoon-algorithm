package org.backjoon.class2.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

//좌표 정렬하기
public class Main11650 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(solution(br));
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static String solution(BufferedReader br) throws IOException {
        StringBuilder result = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int [][] point = new int [N][2];
        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            point[i][0] = Integer.parseInt(st.nextToken());
            point[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(point, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                int idx= o1[0] == o2[0] ? 1 : 0;
                return o1[idx]-o2[idx];
            }
        });

        for(int i=0;i<N;i++){
            result.append(point[i][0]).append(" ").append(point[i][1]).append("\n");
        }
        return result.toString();
    }
}
