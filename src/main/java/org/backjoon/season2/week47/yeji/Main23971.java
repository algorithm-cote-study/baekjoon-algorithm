package org.backjoon.season2.week47.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * ZOAC 4
 *
 */
public class Main23971 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected static int solution(BufferedReader br) throws IOException{
        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int height = input[0];
        int width = input[1];
        int n = input[2];
        int m = input[3];

        return ((height-1)/(n+1)+1) * ((width-1)/(m+1)+1);
    }
}
