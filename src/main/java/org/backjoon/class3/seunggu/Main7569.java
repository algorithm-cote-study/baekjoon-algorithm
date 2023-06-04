package org.backjoon.class3.seunggu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/**
 * 토마토
 */
public class Main7569 {

    private static final int[] dx = new int[]{-1, 0, 1, 0, 0, 0};
    private static final int[] dy = new int[]{0, 1, 0, -1, 0, 0};
    private static final int[] dz = new int[]{0, 0, 0, 0, -1, 1};

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(solution(reader));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static int solution(BufferedReader reader) throws IOException {
        int[] numbers = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[][][] box = new int[numbers[2]][numbers[1]][numbers[0]];

        for (int i = 0; i < numbers[2]; i++) {
            for (int j = 0; j < numbers[1]; j++) {
                box[i][j] = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            }
        }
        Deque<Point> tomatoDeque = new LinkedList<>();
        int undercookedCount = makeTomatoDequeAndGetUndercookedCount(box, tomatoDeque);
        int days = 0;
        while (undercookedCount > 0 && !tomatoDeque.isEmpty()) {
            int size = tomatoDeque.size();
            for(int i = 0; i < size; i++){
                Point point = tomatoDeque.pop();
                int x = point.x;
                int y = point.y;
                int z = point.z;

                for (int j = 0; j < 6; j++) {
                    int nx = x + dx[j];
                    int ny = y + dy[j];
                    int nz = z + dz[j];

                    if (nz >= 0 && ny >= 0 && nx >= 0 && nz < numbers[2] && ny < numbers[1] && nx < numbers[0] && box[nz][ny][nx] == 0) {
                        undercookedCount--;
                        box[nz][ny][nx] = 1;
                        tomatoDeque.add(Point.of(nx, ny, nz));
                    }

                }
            }
            days++;
        }
       return undercookedCount == 0 ? days : -1;
    }

    private static int makeTomatoDequeAndGetUndercookedCount(int[][][] box, Deque<Point> tomatoDeque) {
        int undercookedCount = 0;
        for (int i =0; i < box.length; i++) {
            int[][] firstBox = box[i];
            for (int j= 0; j< firstBox.length; j++) {
                int[] secondBox = firstBox[j];
                for (int k = 0; k <secondBox.length; k++) {
                    int number = secondBox[k];
                    if (number == 0) undercookedCount++;
                    else if(number == 1) tomatoDeque.offer(Point.of(k, j, i));
                }
            }
        }
        return undercookedCount;
    }

    static class Point {

        private final int x;
        private final int y;
        private final int z;

        private Point(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        public static Point of(int x, int y, int z) {
            return new Point(x, y, z);
        }

    }

}
