package com.phoenixdian.io.outputstream;

import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class OutputStreamTest {

    /**
     * 使用FileOutputStream 将hello 写入 d:\a.txt
     * 如果文件不存在 则创建文件
     */
    @Test
    public void test01() {
        File file = new File("d:" + File.separator + "a.txt");

        try (FileOutputStream fileOutputStream = new FileOutputStream(file)) {
            fileOutputStream.write("hello 你好".getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    /**
     * 使用FileOutputStream 将hello 追加 d:\a.txt
     * 如果文件不存在 则创建文件
     */
    @Test
    public void test02() {
        File file = new File("d:" + File.separator + "a.txt");

        try (FileOutputStream fileOutputStream = new FileOutputStream(file,true)) {
            //取消换行
            fileOutputStream.write("\\n".getBytes(StandardCharsets.UTF_8));
            fileOutputStream.write("hello 你好".getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
