package org.backjoon.season1.class8.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.SimpleTimeZone;
import java.util.StringTokenizer;

//비밀번호 찾기
public class Main17219 {
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
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Map<String, String> sitePW = new HashMap<>();
        String [] findSite = new String[M];
        for(int i=0;i<N ;i++){
            String [] siteInfo = br.readLine().split(" ");
            sitePW.put(siteInfo[0], siteInfo[1]);
        }
        for(int i=0;i<M ;i++){
            findSite[i] = br.readLine();
        }
        for(String site : findSite){
            result.append(sitePW.get(site)).append("\n");
        }
        return result.toString();
    }
}
