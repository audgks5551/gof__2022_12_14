package io.mhan.adapter.question;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class FileProperties implements FileIO {
    private Properties properties;

    private String path;

    public FileProperties(String path) {
        this.properties = new Properties();
        this.path = path;
    }

    @Override
    public void readFromFile(String filename) throws IOException {
        properties.load(new FileReader(path + filename));
    }

    @Override
    public void writeToFile(String filename) throws IOException {
        String comments = "written by FileProperties";
        properties.store(new FileWriter(path + filename), comments);
    }

    @Override
    public void setValue(String key, String value) {
        properties.setProperty(key, value);
    }

    @Override
    public String getValue(String key) {
        return properties.getProperty(key);
    }
}
