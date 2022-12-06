package com.phoenixdian.io.properties;

import java.io.*;
import java.util.Properties;

public class Properties03 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.load(new FileReader("./src/example.properties"));
        properties.setProperty("xx","xxx");
        properties.store(new BufferedWriter(new FileWriter("./src/example.properties")),null);
    }
}
