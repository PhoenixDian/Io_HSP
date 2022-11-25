package com.phoenixdian.io.outputstream;

import org.junit.Test;

import java.io.*;

public class BufferedCopyBinaryTest {


    @Test
    public void test01(){
        int readLength;
        byte[] bytes = new byte[1024];
        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("d:" + File.separator + "a.jpg"));
             BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("d:" + File.separator + "d.jpg"))) {
            while ((readLength=bufferedInputStream.read(bytes))!=-1){
                bufferedOutputStream.write(bytes,0,readLength);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
