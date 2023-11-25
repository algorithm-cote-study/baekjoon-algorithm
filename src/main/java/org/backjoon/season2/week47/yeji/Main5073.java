package org.backjoon.season2.week47.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Objects;

/**
 * 5073. 삼각형과 세 변
 * Equilateral :  세 변의 길이가 모두 같은 경우
 * Isosceles : 두 변의 길이만 같은 경우
 * Scalene : 세 변의 길이가 모두 다른 경우
 * Invalid : 조건을 만족하지 못하는 경우 (가장긴변 > 나머지 두 변의 길이)
 */
public class Main5073 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print(solution(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    protected static String solution(BufferedReader br) throws IOException {
        StringBuilder answer = new StringBuilder();
        String input;
        while (!Objects.equals(input = br.readLine(), "0 0 0")) {
            int[] bases = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
            int firstBase = bases[0];
            int secondBase = bases[1];
            int thirdBase = bases[2];

            if(firstBase + secondBase <= thirdBase){
                answer.append("Invalid");
            }else if(firstBase == secondBase && firstBase == thirdBase){
                answer.append("Equilateral");
            }else if(firstBase != thirdBase && firstBase == secondBase || firstBase != secondBase && secondBase == thirdBase){
                answer.append("Isosceles");
            }else{
                answer.append("Scalene");
            }
            answer.append("\n");
        }

        return answer.toString();
    }
}
