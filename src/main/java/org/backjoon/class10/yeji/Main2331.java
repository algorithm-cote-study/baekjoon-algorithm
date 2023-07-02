package org.backjoon.class10.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 반복순열 : 실버4
 */
public class Main2331 {

    private static List<Integer> permutationList;
    private static int answer;

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(solution(br));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int solution(BufferedReader br) throws IOException {
        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        answer = 0;
        permutationList = new ArrayList<>();
        int startingNumber = input[0];
        int exponent = input[1];
        permutationList.add(startingNumber);
        dfs(startingNumber, exponent);
        return answer;
    }

    private static void dfs(int startingNumber, int exponent) {
        int result = 0;
        while (startingNumber > 0) {
            result += Math.pow(startingNumber % 10, exponent);
            startingNumber /= 10;
        }
        if (permutationList.contains(result)) {
            answer = permutationList.indexOf(result);
            return;
        }
        permutationList.add(result);
        dfs(result, exponent);
    }

}
