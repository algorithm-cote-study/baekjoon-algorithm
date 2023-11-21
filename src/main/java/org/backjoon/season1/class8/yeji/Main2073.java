package org.backjoon.season1.class8.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 수도배관공사 (골드4)
 */
public class Main2073 {

    private static int[] dy;

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int solution(BufferedReader br) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        dy = new int[n + 1];

        for (int i = 0; i < p; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
            int length = Integer.parseInt(stringTokenizer.nextToken());
            int capacity = Integer.parseInt(stringTokenizer.nextToken());
            for (int j = n; j > length; j--) {
                if (dy[j - length] != 0) {
                    dy[j] = Math.max(dy[j], Math.min(dy[j - length], capacity));
                }
            }
            dy[length] = Math.max(dy[length], capacity);
        }

        return dy[n];
    }

}
