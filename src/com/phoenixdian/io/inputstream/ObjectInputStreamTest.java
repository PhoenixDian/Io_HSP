package com.phoenixdian.io.inputstream;


import com.phoenixdian.io.entity.Dog;
import org.junit.Test;

import java.io.*;

public class ObjectInputStreamTest {

    /**
     * 读写顺序要一致
     * 要求实现序列化或反序列化对象，需要实现serializable
     * 序列胡的类建议添加serializationUID，为了提高版本的和兼容性
     * 序列化对象时 默认将里面的所有属性都进行序列化 但除了 static和transient修饰的成员
     * 序列化对象时 要求里面对象的属性也需要实现序列化接口
     * 序列化具备可继承性 也就是说如果某类实现了序列化 则它的所有子类已经默认实现了序列化
     */

    @Test
    public void test01(){
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("d:" + File.separator + "data.txt"))) {
            System.out.println(objectInputStream.readInt());
            System.out.println(objectInputStream.readUTF());
            System.out.println(objectInputStream.readChar());
            Object o = objectInputStream.readObject();
            Dog dog=(Dog)o;
            System.out.println(dog);
            System.out.println(dog.getAge());
            System.out.println(dog.getName());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
