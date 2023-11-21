package org.backjoon.season1.class10.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//등차수열
public class Main1994 {
    private static int N;
    private static int [] nums;
    private static int [][] dpArr;
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(solution(br));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int solution(BufferedReader br) throws IOException {
        N = Integer.parseInt(br.readLine());
        nums = new int [N];
        dpArr = new int [N][N];
        for(int i=0;i<N;i++){
            nums[i]= Integer.parseInt(br.readLine());
        }
        Arrays.sort(nums);

        int result = 1;
        for (int i = 1; i < N; i++) {
            if (nums[i] == nums[i - 1]) result++;
        }
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (dpArr[i][j] == 0)   dpArr[i][j] = dp(i, j);
                if (dpArr[i][j] > result) result = dpArr[i][j];
            }
        }
        return result;
    }

    private static int dp(int i, int j){
        if (dpArr[i][j] > 0) {
            return dpArr[i][j];
        }
        int diff = nums[j] - nums[i];
        int next = nums[j] + diff;
        for (int k = j + 1; k < N; k++) {
            int tmp = nums[k];
            if (tmp == next) {
                dpArr[i][j] = dp(j, k) + 1;
                return dpArr[i][j];
            } else if (tmp > next) {
                break;
            }
        }
        dpArr[i][j] = 2;
        return dpArr[i][j];
    }
}
