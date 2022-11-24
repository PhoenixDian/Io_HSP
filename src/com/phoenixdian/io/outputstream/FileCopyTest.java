package com.phoenixdian.io.outputstream;

import org.junit.Test;

import java.io.*;

public class FileCopyTest {
    /**
     * copy 文件
     */
    @Test
    public void test01() {
        byte[] bytes = new byte[1024];
        int fileLength;
        try (FileInputStream fileInputStream = new FileInputStream("d:" + File.separator + "a.jpg");
             FileOutputStream fileOutputStream = new FileOutputStream("d:" + File.separator + "b.jpg")) {
            while ((fileLength=fileInputStream.read(bytes))!=-1){
                fileOutputStream.write(bytes,0,fileLength);//必须用这个 否则可能出现无法正常显示
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
