package com.ths02;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class ObjectInputStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois =new ObjectInputStream(new FileInputStream("myOtherStream\\oos.txt"));
        Object obj = ois.readObject();
        //向下转型
        Student s=(Student)obj;
        System.out.println(s.getName()+","+s.getAge());
        ois.close();
    }
}
