package com.phoenixdian.io.writer;

import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {


    @Test
    public void test01(){
        try (FileWriter fileWriter = new FileWriter("d:" + File.separator + "note.txt")) {
            fileWriter.write('x');
            fileWriter.write("我是".toCharArray(),0,2);
            fileWriter.write("PhoenixDian");
            fileWriter.write("haha haha",0,7);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
