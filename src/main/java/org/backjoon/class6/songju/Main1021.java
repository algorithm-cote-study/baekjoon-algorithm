package org.backjoon.class6.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

//회전하는 큐
public class Main1021 {
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
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        LinkedList<Integer> deque = new LinkedList<>();
        int [] num = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for(int i=1;i<=N;i++){
            deque.offer(i);
        }
        int resultCnt = 0;
        for(int i=0;i<M;i++){
            int pollIdx = deque.indexOf(num[i]);
            int halfIdx = deque.size()/2;
            while(num[i] != deque.getFirst()){
                if(pollIdx > halfIdx)
                    deque.addFirst(deque.removeLast());
                else
                    deque.addLast(deque.removeFirst());
                resultCnt++;
            }
            deque.removeFirst();
        }
        return resultCnt;
    }
}
