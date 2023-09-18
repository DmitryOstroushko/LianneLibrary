package com.geniusto.tools;

import java.io.File;

public class DirectoryTools {

    public static File[] getFileObjectList(String directoryName) {
        return getFileObjectList(directoryName, "");
    }

    public static File[] getFileObjectList(String directoryName, String fileType) {
        switch (fileType) {
            case "directory" -> {
                return new File(directoryName).listFiles(File::isDirectory);
            }
            case "file" -> {
                return new File(directoryName).listFiles(File::isFile);
            }
            default -> {
                return new File(directoryName).listFiles();
            }
        }
    }

}
