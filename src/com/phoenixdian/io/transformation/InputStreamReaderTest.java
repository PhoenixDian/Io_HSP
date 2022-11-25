package com.phoenixdian.io.transformation;

import org.junit.Test;

import java.io.*;

public class InputStreamReaderTest {


    @Test
    public void test01(){
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("d:" + File.separator + "a.txt"),"GBK"))) {
            String line = bufferedReader.readLine();
            System.out.println(line);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
