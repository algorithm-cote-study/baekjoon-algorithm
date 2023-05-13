package org.backjoon.class3.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//집합의 표현
public class Main1717 {
    static int[] parent;

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
        int[] testCase = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        parent = new int[testCase[0] + 1];
        for (int i = 1; i <= testCase[0]; i++) parent[i] = i;
        for (int i = 0; i < testCase[1]; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int op = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (op == 0)
                union(a, b);
            else if(op == 1)
                result.append(find(a) == find(b) ? "YES" : "NO").append("\n");
        }
        return result.toString();
    }

    static void union(int a, int b) {
        int x = find(a);
        int y = find(b);
        if (x < y)
            parent[y] = x;
        else
            parent[x] = y;
    }

    static int find(int a) {
        if (parent[a] == a)
            return a;
        return parent[a] = find(parent[a]);
    }
}
