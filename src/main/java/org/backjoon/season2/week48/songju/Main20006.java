package org.backjoon.season2.week48.songju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

// 랭킹전 대기열
public class Main20006 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(solution(br));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String solution(BufferedReader br) throws IOException {
        StringBuffer result = new StringBuffer();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int p = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        ArrayList<Room> rooms = new ArrayList<>();
        for(int i=0;i<p;i++){
            st = new StringTokenizer(br.readLine(), " ");
            Player nPlayer = new Player(Integer.parseInt(st.nextToken()), st.nextToken());
            boolean isEnter = false;
            for(Room r : rooms){
                if(r.players.size() < m && !r.players.isEmpty() && Math.abs(r.players.get(0).level - nPlayer.level) <=10){
                    isEnter = true;
                    r.players.add(nPlayer);
                    break;
                }
            }
            if(!isEnter){
                rooms.add(new Room(nPlayer));
            }
        }
        for(Room r : rooms){
            Collections.sort(r.players);
            result.append(r.players.size() == m ? "Started!\n" : "Waiting!\n");
            r.players.forEach(a -> {
                result.append(a.level).append(" ").append(a.name).append("\n");
            });
        }
        return result.toString();
    }

    static class Player implements Comparable<Player> {
        int level;
        String name;

        Player(int level, String name){
            this.level = level;
            this.name = name;
        }
        @Override
        public int compareTo(Player p) {
            return this.name.compareTo(p.name);
        }
    }

    static class Room {
        ArrayList<Player> players = new ArrayList<>();
        Room(Player p){
            players.add(p);
        }
    }
}
