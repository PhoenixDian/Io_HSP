package com.phoenixdian.io.inputstream;


import org.junit.Test;

import java.io.*;

public class FileInputStreamTest {
    public static void main(String[] args) {

    }


    //try with source 可以自动close


    /**
     * 读取文件read()
     */
    @Test
    public void fileRead01(){
        File file = new File("d:"+File.separator+"test1.txt");
        int readData;
        try (FileInputStream fileInputStream = new FileInputStream(file)){
            while ((readData=fileInputStream.read())!=-1){
                System.out.print((char) readData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 读取文件 read(byte [])
     */
    @Test
    public void read02(){
        File file = new File("d:"+File.separator+"test1.txt");
        int readLength;
        byte[] bytes = new byte[8];
        try (FileInputStream fileInputStream = new FileInputStream(file)){
            while ((readLength=fileInputStream.read(bytes))!=-1){
                System.out.print(new String(bytes,0,readLength));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
