package org.backjoon.class2.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//큐
public class Main10845 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(solution(br));
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static String solution(BufferedReader br) throws IOException{
        Queue<Integer> queue = new LinkedList<>();
        StringBuilder result = new StringBuilder();
        int val = 0;

        int num = Integer.parseInt(br.readLine());
        for(int i=0;i<num;i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String command = st.nextToken();
            switch (command){
                case "push":
                    val = Integer.parseInt(st.nextToken());
                    queue.offer(val);
                    break;
                case "pop":
                    if(queue.isEmpty()) result.append(-1);
                    else result.append(queue.poll());
                    break;
                case "size":
                    result.append(queue.size());
                    break;
                case "empty":
                    result.append(queue.isEmpty() ? "1" : "0");
                    break;
                case "front":
                    if(queue.isEmpty()) result.append(-1);
                    else result.append(queue.peek());
                    break;
                case "back":
                    if(queue.isEmpty()) result.append(-1);
                    else result.append(val);
                    break;
                default:
                    queue.offer(Integer.parseInt(st.nextToken()));
                    break;
            }
            if(!command.equals("push") && i<num-1) result.append("\n");
        }
        return result.toString();
    }
}
