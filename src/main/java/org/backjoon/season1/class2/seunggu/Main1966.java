package org.backjoon.season1.class2.seunggu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Main1966 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(solution(reader));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static String solution(BufferedReader reader) throws IOException {
        int count = Integer.parseInt(reader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < count; i++) {
            Deque<Document> deque = new LinkedList<>();

            int idx = getIdxAndSetDeque(reader, deque);
            int cnt = 0;
            while (!deque.isEmpty()) {
                Document poppedDoc = deque.pop();
                int len = deque.size();
                boolean isUp = false;
                for (int k = 0; k < len; k++) {
                    Document pop = deque.pop();
                    if (!isUp) {
                        isUp = pop.number > poppedDoc.number;
                    }
                    deque.offer(pop);
                }
                if (isUp) {
                    deque.offer(poppedDoc);
                } else {
                    cnt++;
                    if (poppedDoc.index == idx) break;
                }
            }
            stringBuilder.append(cnt).append("\n");
        }
        return stringBuilder.toString();
    }

    private static int getIdxAndSetDeque(BufferedReader reader, Deque<Document> deque) throws IOException {
        int[] array = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int idx = array[1];
        array = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int j = 0; j < array.length; j++) {
            deque.offer(Document.of(j, array[j]));
        }
        return idx;
    }

    static class Document {

        private final int index;
        private final int number;

        private Document(int index, int number) {
            this.index = index;
            this.number = number;
        }

        public static Document of(int index, int number) {
            return new Document(index, number);
        }

    }


}
