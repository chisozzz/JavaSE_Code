package com.ths02;

import java.io.*;
/*
    用对象序列化流序列化了一个对象后，假如我们修改了对象所属的类文件，读取数据会不会出问题呢？
会出问题，会抛出InvalidClassException异常


如果出问题了，如何解决呢？
重新序列化
给对象所属的类加一个serialVersionUID
private static final long serialVersionUID = 42L;

如果一个对象中的某个成员变量的值不想被序列化，又该如何实现呢？
给该成员变量加transient关键字修饰，该关键字标记的成员变量不参与序列化过程
 */
public class ObjectStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        write();
        read();
    }

    private static void read() throws IOException, ClassNotFoundException {
        ObjectInputStream ois =new ObjectInputStream(new FileInputStream("myOtherStream\\oos.txt"));
        Object obj = ois.readObject();
        //向下转型
        Student s=(Student)obj;
        System.out.println(s.getName()+","+s.getAge());
        ois.close();
    }

    //序列化
    private static void write() throws IOException {
        ObjectOutputStream oos =new ObjectOutputStream(new FileOutputStream("myOtherStream\\oos.txt"));
        Student s =new Student("zhagnsan",33);
        oos.writeObject(s);
        oos.close();
    }
}
