package org.backjoon.common;

import java.io.*;
import java.util.Objects;

public class TestFileUtil {

    private TestFileUtil() {
        throw new AssertionError();
    }

    private static File getFile(Class<?> className, String fileName) {
        ClassLoader classLoader = className.getClassLoader();
        return new File(Objects.requireNonNull(classLoader.getResource(fileName)).getFile());
    }

    public static BufferedReader getReader(Class<?> className, String fileName) throws FileNotFoundException {
        return new BufferedReader(new FileReader(getFile(className, fileName)));
    }

    public static String getAnswer(Class<?> className, String fileName) throws IOException {
        BufferedReader reader = getReader(className, fileName);
        StringBuilder stringBuilder = new StringBuilder();
        String readLine = "";
        while (readLine != null) {
            readLine = reader.readLine();
            if (readLine != null)
                stringBuilder.append(readLine).append("\n");
        }
        return stringBuilder.toString().trim();
    }

}
