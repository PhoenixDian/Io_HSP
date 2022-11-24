package com.phoenixdian.io.createfile;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class FileCreate {

    /**
     * method 1 new File(String pathName)
     */
    @Test
    public void create01(){
        String filePath="d:"+ java.io.File.separator+"test1.txt";
        java.io.File file = new java.io.File(filePath);
        try {
            if (file.createNewFile())
            System.out.println("success");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * method 2 new File(File parentFile, String filePath)
     */
    @Test
    public void create02(){
        File parentFile = new File("d:"+File.separator);
        String path="test2.txt";
        File file = new File(parentFile, path);
        try {
            if (file.createNewFile()) {
                System.out.println("success");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * method 3
     */
    @Test
    public void test03(){

    }

}
