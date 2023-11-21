package org.backjoon.season1.class2.seunggu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 팰린드롬수 ( 브론즈 1)
 */
public class Main1259 {

    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if(line.equals("0"))break;
                String reverse = new StringBuilder(line).reverse().toString();
                if(reverse.equals(line)) {
                    System.out.println("yes");
                }else {
                    System.out.println("no");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
