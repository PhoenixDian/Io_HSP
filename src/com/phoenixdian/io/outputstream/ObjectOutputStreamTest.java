package com.phoenixdian.io.outputstream;

import com.phoenixdian.io.entity.Dog;
import org.junit.Test;

import java.io.*;

public class ObjectOutputStreamTest {

    @Test
    public void test01(){

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("d:" + File.separator + "data.txt"))) {
            objectOutputStream.writeInt(100);
            objectOutputStream.writeUTF("测试");
            objectOutputStream.writeChar('a');
            objectOutputStream.writeObject(new Dog("测试", 1));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}

