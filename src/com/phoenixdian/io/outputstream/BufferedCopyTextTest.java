package com.phoenixdian.io.outputstream;

import org.junit.Test;

import java.io.*;

public class BufferedCopyTextTest {

    @Test
    public void test01(){
        String readLine;
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("d:" + File.separator + "c.txt"));
             BufferedReader bufferedReader = new BufferedReader(new FileReader("d:" + File.separator + "a.txt"))) {
            while ((readLine=bufferedReader.readLine())!=null){
                bufferedWriter.write(readLine);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
