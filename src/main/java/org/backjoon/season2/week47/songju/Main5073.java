package org.backjoon.season2.week47.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 삼각형과 세 변
public class Main5073 {
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
        String str = "";
        while(!(str = br.readLine()).equals("0 0 0")){
            int [] side = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
            Arrays.sort(side);

            if(side[2] >= side[0] + side[1]){
                result.append("Invalid").append("\n");
            } else if(side[0] == side[1] && side[1]== side[2]){
                result.append("Equilateral").append("\n");
            } else if(side[0] == side[1] || side[1] == side[2]){
                result.append("Isosceles").append("\n");
            } else {
                result.append("Scalene").append("\n");
            }
        }
        return result.toString();
    }
}
