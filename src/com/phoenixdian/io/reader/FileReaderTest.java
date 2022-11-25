package com.phoenixdian.io.reader;

import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

    @Test
    public void test01(){
        int readData;
        try (FileReader fileReader = new FileReader("d:" + File.separator + "a.txt")) {
            while ((readData = fileReader.read())!=-1){
                System.out.print((char)readData);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test02(){
        int readLength;
        char[] chars = new char[8];
        try (FileReader fileReader = new FileReader("d:" + File.separator + "a.txt")) {
            while ((readLength = fileReader.read(chars))!=-1){
                System.out.print(new String(chars,0,readLength));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
