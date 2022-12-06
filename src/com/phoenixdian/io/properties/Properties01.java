package com.phoenixdian.io.properties;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Properties01 {
    public static void main(String[] args){
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("./src/example.properties"))) {
            String dataLine;
            while ((dataLine = bufferedReader.readLine()) != null) {
                System.out.println(dataLine);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
