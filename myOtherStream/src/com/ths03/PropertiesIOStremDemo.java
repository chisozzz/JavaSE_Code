package com.ths03;

import java.io.*;
import java.util.Properties;

public class PropertiesIOStremDemo {
    public static void main(String[] args)throws IOException {
        myStore();
//        myLoad();
    }

    private static void myLoad()throws IOException {
        Properties prop =new Properties();
        FileReader fw =new FileReader("myOtherStream\\fw.txt");
//        FileInputStream fw =new FileInputStream("myOtherStream\\fw.txt");//对字节进行转换，字符乱码
        prop.load(fw);
        fw.close();
        System.out.println(prop);
    }

    private static void myStore()throws IOException {
        Properties prop =new Properties();
        FileWriter fw =new FileWriter("myOtherStream\\fw.txt");
//        FileOutputStream fw =new FileOutputStream("myOtherStream\\fw.txt");//对字节进行转换，字符乱码
        prop.setProperty("ths01","赵云");
        prop.setProperty("ths02","张飞");
        prop.setProperty("ths03","关羽");
        prop.store(fw,null);
        fw.close();
    }
}
