package com.phoenixdian.io.transformation;

import org.junit.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class OutPutStreamWriterTest {

    @Test
    public void test01(){

        try (BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("d:" + File.separator + "a.txt"), StandardCharsets.UTF_8))) {
            bufferedWriter.write("test测试");
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
