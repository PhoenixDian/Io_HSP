package com.phoenixdian.io.properties;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Properties02 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.load(new BufferedReader(new FileReader("./src/example.properties")));
        properties.list(System.out);
        String name = properties.getProperty("name");
        System.out.println(name);
    }
}
