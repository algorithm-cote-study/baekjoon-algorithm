package org.backjoon.class3.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

//듣보잡
public class Main1764 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(solution(br));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String solution(BufferedReader br) throws IOException {
        StringBuilder result = new StringBuilder();
        int[] peopleNum = Arrays.stream( br.readLine().split( " " ) ).mapToInt( Integer::parseInt ).toArray();
        HashSet<String> unHeardPoeple = new HashSet<>();
        ArrayList<String> unHeardOf = new ArrayList<>();
        int cnt = 0;

        //듣도못한 사람
        for(int i=0;i<peopleNum[0];i++){
            unHeardPoeple.add(br.readLine());
        }

        for(int i=0;i<peopleNum[1];i++){
            String unSee = br.readLine();
            if(unHeardPoeple.contains(unSee)){
                unHeardOf.add(unSee);
            }
        }

        result.append(unHeardOf.size()).append("\n");

        unHeardOf.sort(Comparator.naturalOrder());
        unHeardOf.stream().forEach(a-> result.append(a).append("\n"));

        return result.toString();
    }
}
