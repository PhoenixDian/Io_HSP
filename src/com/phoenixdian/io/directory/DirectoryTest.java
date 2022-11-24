package com.phoenixdian.io.directory;

import org.junit.Test;

import java.io.File;

public class DirectoryTest {
    /**
     * 判断 d:\\test1.txt是否存在，如果存在就删除
     */
    @Test
    public void test01(){
        File file = new File("d:" + File.separator + "test1.txt");
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("删除成功");
            }else {
                System.out.println("删除失败");
            }
        }else {
            System.out.println(file.getAbsolutePath()+" 不存在");
        }
    }

    /**
     * 判断d:\\demo02是否存在，如果存在则删除，否则提示不存在  (一切皆文件)
     */
    @Test
    public void test02(){
        File file = new File("d:" + File.separator + "demo02");
        if (file.exists()){
            if (file.delete()) {
                System.out.println("删除成功");
            }
        }else {
            System.out.println("文件不存在");
        }
    }


    /**
     * 判断   d:\\demo\a\b\c\d目录是否存在 如果存在就提示已存在 否则创建
     */
    @Test
    public void test03(){
        File file = new File("d:" + File.separator + "demo" + File.separator + "a" + File.separator + "b" + File.separator + "c" + File.separator + "d");
        if (file.exists()){
            System.out.println(file.getAbsolutePath()+" 已存在");
        }else{
            if (file.mkdirs()) {
                System.out.println("创建成功");
            }
        }
    }

}
