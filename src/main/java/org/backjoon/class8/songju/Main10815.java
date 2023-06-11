package org.backjoon.class8.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

//숫자 카드
public class Main10815 {
    private static int N;
    private static int [] hasCardArr;
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(solution(br));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String solution(BufferedReader br) throws IOException {
        StringBuilder result = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        Set<Integer> hasCards = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().boxed().collect(Collectors.toSet());
        int M = Integer.parseInt(br.readLine());
        int[] correctCards = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for(int num : correctCards)
            result.append(hasCards.contains(num) ? "1 " : "0 ");

        return result.toString();
    }

    //이진 탄색 방법
    private static boolean binarySearch(int num) {
        int left = 0;
        int right = N - 1;

        while(left <= right){
            int midIndex = (left + right) / 2;
            int mid = hasCardArr[midIndex];

            if(num < mid) right = midIndex - 1;
            else if(num > mid) left = midIndex + 1;
            else return true;
        }
        return false;
    }
}


