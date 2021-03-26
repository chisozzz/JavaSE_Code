package com.ths02;

import java.io.FileInputStream;
import java.io.IOException;

/*

 */
public class FileInputStreamDemo02 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis  = new FileInputStream("myOutputStream\\fos.txt");
        byte[] bytes = fis.readAllBytes();
        System.out.println(new String(bytes,0,bytes.length));
    }
}
