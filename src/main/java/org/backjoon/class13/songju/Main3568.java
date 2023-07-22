package org.backjoon.class13.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// iSharp
public class Main3568 {
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
        String[] varArr = (br.readLine().replaceAll(",|;", "")).split(" ");
        String prefix = varArr[0];

        for (int i = 1; i < varArr.length; i++) {
            result.append(prefix).append(reverseStr(varArr[i])).append(";\n");
        }
        return result.toString();
    }

    private static String reverseStr(String str) {
        StringBuilder fullVar = new StringBuilder();
        char[] varStr = str.toCharArray();
        for (int i = varStr.length - 1; i >= 0; i--) {
            if (varStr[i] != ']') {
                if (varStr[i] == '*' || varStr[i] == '&') {
                    fullVar.append(varStr[i]);
                } else {
                    fullVar.append(" ");
                    for (int j = 0; j <= i; j++) {
                        fullVar.append(varStr[j]);
                    }
                    break;
                }
            } else {
                fullVar.append("[]");
                i--;
            }
        }
        return fullVar.toString();
    }
}
