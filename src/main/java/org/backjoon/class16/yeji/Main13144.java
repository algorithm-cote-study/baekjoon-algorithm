package org.backjoon.class16.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * List of Unique Numbers
 */
public class Main13144 {


    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static long solution(BufferedReader reader) throws IOException {
        int n = Integer.parseInt(reader.readLine());
        int[] arr = new int[n + 1];
        StringTokenizer st = new StringTokenizer(reader.readLine());
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int l = 1;
        int r = 0;
        long answer = 0;
        int[] ct = new int[100_001];
        while (l <= n) {
            while (r + 1 <= n && ct[arr[r + 1]] == 0) {
                r++;
                ct[arr[r]]++;
            }

            answer += r - l + 1;
            ct[arr[l++]]--;
        }
        return answer;
    }
}
