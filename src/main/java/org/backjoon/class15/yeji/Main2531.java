package org.backjoon.class15.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 회전초밥 : 2531번
 */
public class Main2531 {

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
        int[] plates = new int[n];

        for (int i = 0; i < n; i++) {
            plates[i] = Integer.parseInt(reader.readLine()) - 1;
        }

        return findMaxSushiCount(n, input[1], input[2], input[3] - 1, plates);
    }

    private static int findMaxSushiCount(int n, int d, int k, int coupon, int[] plates) {
        int max = 0;
        int[] eat = new int[d];
        int cnt = 0;
        for (int i = 0; i < k; i++) {
            if (eat[plates[i]]++ == 0) {
                cnt++;
            }
        }
        for (int i = 0; i < n; i++) {
            max = Math.max(max, eat[coupon] == 0 ? cnt + 1 : cnt);
            int j = (i + k) % n;
            if (eat[plates[j]]++ == 0) cnt++;
            if (--eat[plates[i]] == 0) cnt--;
        }

        return max;
    }

}
