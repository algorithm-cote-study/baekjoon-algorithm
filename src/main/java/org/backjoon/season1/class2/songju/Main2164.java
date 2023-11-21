package org.backjoon.season1.class2.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

//카드2
public class Main2164 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(solution(br));
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static int solution(BufferedReader br) throws IOException {
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new LinkedList<>();
        for(int i=0;i<N;i++){
            deque.offer(i+1);
        }
        boolean isRemove = true;
        int front = 0;
        while(!deque.isEmpty()){
            front = deque.pollFirst();
            if(!isRemove){
                deque.offer(front);
            }
            isRemove = !isRemove;
        }
        return front;
    }
}
