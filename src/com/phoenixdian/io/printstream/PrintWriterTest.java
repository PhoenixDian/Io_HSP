package com.phoenixdian.io.printstream;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterTest {

    @Test
    public void test01(){
        try (PrintWriter printWriter = new PrintWriter("d:" + File.separator + "a.txt")) {
            printWriter.print("ccc");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
