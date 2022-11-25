package com.phoenixdian.io.writer;

import org.junit.Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest {
    @Test
    public void test01(){
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("d:" + File.separator + "b.txt"))){
            bufferedWriter.write("test测试");
            bufferedWriter.newLine();
            bufferedWriter.write("test测试");
            bufferedWriter.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
