package org.backjoon.class3.seunggu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2579 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int count = Integer.parseInt(reader.readLine());
            Stair[] stairs = new Stair[count];
            for (int i = 0; i < count; i++) {
                stairs[i] = Stair.of(Integer.parseInt(reader.readLine()));
                if (i == count - 1) stairs[i].visited = true;
            }

            for (int i = count - 3; i >= 0; i--) {
                if (stairs[i - 1].visited && stairs[i - 2].visited) continue;
                if (stairs[i].score + stairs[i - 1].score > stairs[i].score + stairs[i - 2].score) {

                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static class Stair {

        private boolean visited;
        private int score;

        private int sum;

        public Stair(int score) {
            this.visited = false;
            this.score = score;
            this.sum = score;
        }


        public static Stair of(int score) {
            return new Stair(score);
        }

    }

}
