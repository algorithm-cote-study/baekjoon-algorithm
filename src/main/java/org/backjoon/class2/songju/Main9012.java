package org.backjoon.class2.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//괄호
public class Main9012 {
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
        int N = Integer.parseInt(br.readLine());

        for(int i=0;i<N;i++){
            String parentheses = br.readLine();
            result.append(isParentheses(parentheses)).append("\n");
        }
        return result.toString();
    }

    public static String isParentheses(String parentheses) {
        Stack<Character> stack = new Stack<>();
        for(int j=0;j<parentheses.length();j++){
            char c = parentheses.charAt(j);
            if(c =='(')
                stack.push(c);
            else if(stack.isEmpty()){
                return "NO";
            } else {
                stack.pop();
            }
        }
        return stack.empty() ? "YES" : "NO";
    }
}
