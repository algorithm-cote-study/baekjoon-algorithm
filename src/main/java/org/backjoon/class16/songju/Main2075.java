package org.backjoon.class16.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

// N번째 큰 수
public class Main2075 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(solution(br));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int solution(BufferedReader br) throws IOException {
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < N; i++) {
            for(String num : br.readLine().split(" ")){
                queue.offer(Integer.parseInt(num));
            }
        }
        for(int i=0; i<N-1; i++){
            queue.poll();
        }
        return queue.poll();
    }
}
