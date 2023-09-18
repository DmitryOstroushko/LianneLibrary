package com.lianne.lianne.IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesLoader {

    /**
     * A method loads a properties file and return a Properties object
     * @param fileName is a file name with properties
     * @return a Properties object
     * @throws IOException if a file processing exception occurs
     */
    public static Properties propertiesLoad(String fileName) throws IOException {
        FileInputStream fIS = new FileInputStream(fileName);
        Properties properties = new Properties();
        properties.load(fIS);
        return properties;
    }
}
