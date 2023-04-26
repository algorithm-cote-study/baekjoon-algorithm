package org.backjoon.class2.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

//덱
public class Main10866 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(solution(br));
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static String solution(BufferedReader br) throws IOException{
        Deque<Integer> queue = new LinkedList<Integer>();
        StringBuilder result = new StringBuilder();

        int val = 0;
        int num = Integer.parseInt(br.readLine());
        for(int i=0;i<num;i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String command = st.nextToken();

            switch (command){
                case "push_front":
                    val = Integer.parseInt(st.nextToken());
                    queue.offerFirst(val); break;
                case "push_back":
                    val = Integer.parseInt(st.nextToken());
                    queue.offerLast(val); break;
                case "pop_front":
                    if(queue.isEmpty()) result.append(-1);
                    else result.append(queue.pollFirst()); break;
                case "pop_back":
                    if(queue.isEmpty()) result.append(-1);
                    else result.append(queue.pollLast()); break;
                case "size":
                    result.append(queue.size()); break;
                case "empty":
                    result.append(queue.isEmpty() ? "1" : "0"); break;
                case "front":
                    if(queue.isEmpty()) result.append(-1);
                    else result.append(queue.peekFirst()); break;
                case "back":
                    if(queue.isEmpty()) result.append(-1);
                    else result.append(queue.peekLast()); break;
            }
            if(!command.startsWith("push"))result.append("\n");
        }
        return result.toString();
    }
}
