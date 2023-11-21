package org.backjoon.season1.class2.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

//단어 정렬
public class Main1181 {

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
        int num = Integer.parseInt(br.readLine());
        String[] words = new String[num];

        for(int i =  0 ; i < num ; i++) {
            words[i] = br.readLine();
        }

        Arrays.sort(words, (s1, s2) -> {
            if(s1.length() == s2.length()) {
                return s1.compareTo(s2);
            } else {
                return s1.length() - s2.length();
            }
        });

        result.append(words[0]).append("\n");
        for(int j=1;j<num;j++) {
            if(!words[j].equals(words[j-1]))
                result.append(words[j]).append("\n");
        }
        return result.toString();
    }
}

