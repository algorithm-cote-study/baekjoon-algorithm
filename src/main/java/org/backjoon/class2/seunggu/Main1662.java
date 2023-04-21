package org.backjoon.class2.seunggu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main1662 {

    public static void main(String[] args) {
        try( BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(solution(reader));
        }  catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int solution2(BufferedReader reader) throws IOException {
        String[] lines = reader.readLine().split("");
        Deque<String> deque = new ArrayDeque<>();
        Deque<String> multiply = new ArrayDeque<>();
        StringBuilder str = new StringBuilder();
        for (String s : lines) {
            if (s.equals("(")) {
                String words = Character.toString(str.charAt(str.length() - 1));
                str.deleteCharAt(str.length() - 1);
                multiply.push(words);
                if(!str.isEmpty()) {
                    deque.push(str.toString());
                    str = new StringBuilder();
                }
            } else if (s.equals(")")) {
                if(!str.isEmpty()){
                    deque.push(str.toString());
                    str = new StringBuilder();
                }
                String multi = multiply.pop();
                String word = deque.isEmpty() ? "" : deque.pop();
                word = word.repeat(Integer.parseInt(multi));
                if (!deque.isEmpty()) {
                    word = deque.pop() + word;
                }
                deque.push(word);
            } else {
                str.append(s);
            }
        }
        if(!str.isEmpty()) {deque.push(str.toString());}
        int len = deque.size();
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i<len; i++) {
            stringBuilder.append(deque.pop());
        }
        return stringBuilder.toString().length();
    }

    static int solution1(BufferedReader reader) throws IOException {
        String[] lines = reader.readLine().split("");
        Deque<String> deque = new ArrayDeque<>();
        for (String line : lines) {
            if (line.equals(")")) {
                String word = deque.pop();
                if(word.equals("(")) {
                    deque.pop();
                    continue;
                }
                StringBuilder stringBuilder = new StringBuilder(word);
                while (!word.equals("(")) {
                    word = deque.pop();
                    if (!word.equals("(")) stringBuilder.append(word);
                }
                word = deque.pop();
                int multi = Integer.parseInt(word);
                deque.push(stringBuilder.toString().repeat(multi));
            } else {
                deque.push(line);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        while(!deque.isEmpty()) {
            stringBuilder.append(deque.pop());
        }
        return stringBuilder.toString().length();
    }

    static int solution3(BufferedReader reader) throws IOException {
        String[] lines = reader.readLine().split("");
        Deque<String> deque = new ArrayDeque<>();
        Deque<String> multiply = new ArrayDeque<>();
        Deque<String> str = new ArrayDeque<>();
        for (String s : lines) {
            if (s.equals("(")) {
                String num = str.pop();
                multiply.push(num);
                appendString(deque, str);
            } else if (s.equals(")")) {
                appendString(deque, str);
                String multi = multiply.pop();
                String word = deque.isEmpty() ? "" : deque.pop();
                word = word.repeat(Integer.parseInt(multi));
                if (!deque.isEmpty()) {
                    word = deque.pop() + word;
                }
                deque.push(word);
            } else {
                str.push(s);
            }
        }
        appendString(deque, str);
        int len = deque.size();
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i<len; i++) {
            stringBuilder.append(deque.pop());
        }
        return stringBuilder.toString().length();
    }

    private static void appendString(Deque<String> deque, Deque<String> str) {
        StringBuilder line = new StringBuilder();
        while (!str.isEmpty()) {
            String pop = str.pop();
            if(!"".equals(pop)) line.insert(0, pop);
        }
        if(!line.isEmpty()) deque.push(line.toString());
    }

    static int solution(BufferedReader reader) throws IOException {
        String[] lines = reader.readLine().split("");
        Deque<Integer> deque = new ArrayDeque<>();
        Deque<Integer> multiply = new ArrayDeque<>();
        int cnt =0;
        for (int i = 0; i < lines.length; i++) {
            String line = lines[i];
            if("(".equals(line)) {
                cnt--;
                deque.push(cnt);
                multiply.push(Integer.parseInt(lines[i-1]));
                cnt = 0;
            } else if(")".equals(line)) {
                int multi = multiply.pop();
                multi *= cnt;
                cnt = deque.pop() + multi;
            }else {
                cnt++;
            }
        }
        return cnt;

    }
}
