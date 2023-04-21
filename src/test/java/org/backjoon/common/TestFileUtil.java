package org.backjoon.common;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Objects;

public class TestFileUtil {

    private TestFileUtil() { throw new AssertionError();}
    private static File getFile(Class<?> className, String fileName) {
        ClassLoader classLoader = className.getClassLoader();
        return new File( Objects.requireNonNull( classLoader.getResource( fileName ) ).getFile()) ;
    }

    public static BufferedReader getReader(Class<?> className, String fileName) throws FileNotFoundException {
        return new BufferedReader( new FileReader( getFile( className, fileName ) ) );
    }

}
