package org.backjoon.class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main2920 {

    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(solution(reader));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static String solution(BufferedReader reader) throws IOException {
        int[] array = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        if(array[0] == 1) {
            for(int i=1; i<array.length; i++) {
                if(i != array[i-1]) return "mixed";
            }
            return "ascending";
        } else if(array[0] == 8) {
            for(int i=0; i<array.length; i++) {
                if(array[i] != 8-i) return "mixed";
            }
            return "descending";
        }
        return "mixed";
    }

}
