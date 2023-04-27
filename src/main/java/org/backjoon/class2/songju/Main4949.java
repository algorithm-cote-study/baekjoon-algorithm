package org.backjoon.class2.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//균형잡힌 세상
public class Main4949 {
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
        String line = "";
        while(!(line = br.readLine()).equals(".")){
            result.append(isParentheses(line)).append("\n");
        }
        return result.toString();
    }

    public static String isParentheses(String line) {
        Stack<Character> stack = new Stack<>();
        for(int j=0;j<line.length();j++){
            char c = line.charAt(j);
            if(c =='(' || c =='['){
                stack.push(c);
            } else if (c == ')' || c == ']') {
                if(stack.isEmpty() || (c == ')' && stack.peek() != '(') || (c == ']' && stack.peek() != '['))
                    return "no";
                else
                    stack.pop();
            }
        }
        return stack.empty() ? "yes" : "no";
    }
}
