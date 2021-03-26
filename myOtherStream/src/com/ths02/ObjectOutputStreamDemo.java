package com.ths02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
    构造方法：
    ObjectOutputStream(OutputStream out)：创建一个写入指定的OutputStream的ObjectOutputStream

    序列化对象的方法：
    void writeObject(Object obj)：将指定的对象写入ObjectOutputStream

    抛出一个实例需要一个Serializable接口
    类的序列化由实现java.io.Serializable接口的类启用。 不实现此接口的类将不会使任何状态序列化或反序列化。
 */
public class ObjectOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos =new ObjectOutputStream(new FileOutputStream("myOtherStream\\oos.txt"));
        Student s =new Student("zhagnsan",33);
        oos.writeObject(s);
        oos.close();
    }
}
