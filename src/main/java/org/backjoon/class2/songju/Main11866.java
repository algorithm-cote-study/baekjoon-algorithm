package org.backjoon.class2.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

//요세푸스 문제 0
public class Main11866 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(solution(br));
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static String solution(BufferedReader br) throws IOException {
        StringBuilder result = new StringBuilder();
        int [] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Queue<Integer> queue = new LinkedList<>();

        for(int i=1;i<=arr[0];i++){
            queue.offer(i);
        }

        result.append("<");
        while(queue.size() >1){
            for(int i=0;i<arr[1]-1;i++){
                queue.offer(queue.poll());
            }
            result.append(queue.poll()).append(", ");
        }
        result.append(queue.poll()).append(">");
        return result.toString();
    }
}
