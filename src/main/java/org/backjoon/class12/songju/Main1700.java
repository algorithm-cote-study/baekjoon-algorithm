package org.backjoon.class12.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

//멀티탭 스케줄링
public class Main1700 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(solution(br));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int solution(BufferedReader br) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        boolean[] used = new boolean[K + 1];
        int[] electronics = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int useCnt = 0, result = 0;
        for (int i = 0; i < K; i++) {
            if (!used[electronics[i]]) {
                if (useCnt < N) {
                    used[electronics[i]] = true;
                    useCnt++;
                } else {
                    int[] visited = new int[K + 1];
                    ArrayList<Integer> soonUseList = new ArrayList<>();
                    for (int j = i; j < K; j++) { // 현재 꽂혀 있는 콘센트가 나중에도 사용되는지 확인.
                        if (used[electronics[j]] && !soonUseList.contains(electronics[j])) {
                            soonUseList.add(electronics[j]);
                        }
                    }
                    if (soonUseList.size() == N) { // 현재 꽂힌 모든 콘센트가 나중에 모두 사용될 경우
                        int remove = soonUseList.get(soonUseList.size() - 1);
                        used[remove] = false;
                    } else { // 나중에 사용하는 콘센트가 구멍의 개수랑 같지 않을때. 즉, 일부만 나중에 사용될 때
                        for (int j = 0; j < used.length; j++) {
                            if (used[j] && !soonUseList.contains(j)) {
                                used[j] = false;
                                break;
                            }
                        }
                    }
                    used[electronics[i]] = true;
                    result++;
                }

            }
        }
        return result;
    }
}
