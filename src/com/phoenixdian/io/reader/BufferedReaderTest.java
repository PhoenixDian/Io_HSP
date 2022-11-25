package com.phoenixdian.io.reader;

import org.junit.Test;

import java.io.*;

public class BufferedReaderTest {


    @Test
    public void test01(){
        String line;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("d:" + File.separator + "a.txt"))) {
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
