package com.lianne.lianne.IO;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Files {

    /**
     * A method returns InputStreamReader for a file with a given file name: bytes
     * @param fileName is a file name for processing
     * @return InputStreamReader object
     * @throws FileNotFoundException if a file processing exception occurs
     */
    public static InputStreamReader getInputStreamReader(String fileName) throws FileNotFoundException {
        // InputStream gives bytes
        return new InputStreamReader(new FileInputStream(fileName));
    }

    /**
     * A method returns LineNumberReader for a file with a given file name: characters
     * @param fileName is a file name for processing
     * @return LineNumberReader object
     * @throws FileNotFoundException if a file processing exception occurs
     */
    public static LineNumberReader getLineNumberReader(String fileName) throws FileNotFoundException {
        // Reader gives characters
        return new LineNumberReader(getInputStreamReader(fileName));
    }

    /**
     * A method returns BufferedReader for a file with a given file name: lines
     * @param fileName is a file name for processing
     * @return BufferedReader object
     * @throws FileNotFoundException if a file processing exception occurs
     */
    public static BufferedReader getBufferedReader(String fileName) throws FileNotFoundException {
        // Reader gives lines
        return new BufferedReader(getInputStreamReader(fileName));
    }

    /**
     * A method returns a Map object for a file with a given file name
     * @param fileName is a file name for processing
     * @return Map<Integer, String> object: keys are line numbers, values are lines
     * @throws FileNotFoundException if a file processing exception occurs
     */
    public static Map<Integer, String> readFileNumberLines(String fileName) throws FileNotFoundException {
        Map<Integer, String> lines = new HashMap<>();
        LineNumberReader lineNumberReader = getLineNumberReader(fileName);
        lineNumberReader.lines().forEach(line -> lines.put(lineNumberReader.getLineNumber(), line));
        return lines;
    }

    /**
     * A method returns a List object for a file with a given file name
     * @param fileName is a file name for processing
     * @return List<String> object
     * @throws FileNotFoundException if a file processing exception occurs
     */
    public static List<String> readFileLines(String fileName) throws FileNotFoundException {
        List<String> lines = new ArrayList<>();
        (getBufferedReader(fileName)).lines().forEach(lines::add);
        return lines;
    }

}
