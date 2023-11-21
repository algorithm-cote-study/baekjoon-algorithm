package org.backjoon.season1.class14.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// A → B
public class Main16953 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(solution(br));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int solution(BufferedReader br) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        long start = Long.parseLong(st.nextToken());
        long end = Long.parseLong(st.nextToken());

        int cnt = 1;
        while (start != end) {
            if (start > end)
                return -1;
            String endStr = String.valueOf(end);
            if (end % 2 == 0) {
                end /= 2;
            } else if (endStr.endsWith("1")) {
                endStr = endStr.substring(0, endStr.length() - 1);
                end = Long.parseLong(endStr);
            } else {
                return -1;
            }
            cnt++;
        }

        return cnt;
    }
}
