package org.backjoon.season1.class9.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.SimpleTimeZone;
import java.util.StringTokenizer;

//걷기
public class Main1459 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(solution(br));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static long solution(BufferedReader br) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        long X = Long.parseLong(st.nextToken());
        long Y = Long.parseLong(st.nextToken());
        long W = Long.parseLong(st.nextToken());
        long S = Long.parseLong(st.nextToken());

        long timeHorizental, timeDiagonal, timeMix;

        timeHorizental = (X + Y) * W;
        timeDiagonal = (X + Y) % 2 == 0 ? Math.max(X, Y) * S : (Math.max(X, Y) - 1) * S + W;
        timeMix = (Math.min(X, Y) * S) + (Math.abs(X - Y) * W);

        return Math.min(timeHorizental, Math.min(timeDiagonal, timeMix));
    }
}
