package org.backjoon.season1.class2.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

//수 정렬하기 2
public class Main2751 {
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
        int[] arr = new int[N];

        for(int i =  0 ; i < N ; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        for(int num : arr) {
            result.append(num).append("\n");
        }
        return result.toString();
    }
}
