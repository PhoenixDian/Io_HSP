package com.phoenixdian.io.printstream;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamTest {
    @Test
    public void test01() throws FileNotFoundException {
        PrintStream printStream=System.out;
        printStream.print('a');
        printStream.write('1');
        System.setOut(new PrintStream("d:"+File.separator+"a.txt"));
        System.out.println("测试");
    }
}
