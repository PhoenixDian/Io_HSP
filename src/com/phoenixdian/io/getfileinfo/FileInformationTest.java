package com.phoenixdian.io.getfileinfo;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class FileInformationTest {
    @Test
    public void info(){
        File file = new File("d:" + File.separator + "test1.txt");

        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
        System.out.println(file.getName());
        System.out.println(file.getParentFile());
        System.out.println(file.getParent());
        try {
            System.out.println(file.getCanonicalPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(file.getCanonicalFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(file.getUsableSpace());
        System.out.println(file.getFreeSpace());
        System.out.println(file.getTotalSpace());

        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.exists());
        System.out.println(file.length());
    }
}
