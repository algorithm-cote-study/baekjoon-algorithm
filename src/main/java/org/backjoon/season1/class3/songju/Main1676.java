package org.backjoon.season1.class3.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//팩토리얼 0의 개수
public class Main1676 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(solution(br));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int solution(BufferedReader br) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int countOfTwo = 0;
        int countOfFive = 0;
        //끝자리가 0일경우 10의 배수이므로 2*5의 조합이 되어야함. 소인수 분해하기
        for(int i=1;i<=N;i++){
            int num = i;
            while(num % 2 == 0){
                countOfTwo++;
                num/=2;
            }
            while(num % 5 == 0){
                countOfFive++;
                num/=5;
            }
        }

        return Math.min(countOfTwo, countOfFive);
    }
}
