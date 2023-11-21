package org.backjoon.season1.class12.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 부분합 (골드4)
 */
public class Main1806 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int solution(BufferedReader reader) throws IOException {
        int[] input = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = input[0];
        int target = input[1];
        int[] nums = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        return findMinLength(nums, target, n);
    }

    private static int findMinLength(int[] nums, int target, int n) {
        int answer = 100001;
        int left = 0;
        int right = 0;
        int sum = 0;
        while (left <= right) {
            if (sum >= target) {
                answer = Math.min(answer, right - left);
                sum -= nums[left++];
            } else if (right == n) break;
            else {
                sum += nums[right++];
            }
        }

        return answer == 100001 ? 0 : answer;
    }


}
