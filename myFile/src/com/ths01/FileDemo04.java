package com.ths01;

import java.io.File;
import java.io.IOException;

public class FileDemo04 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("myFile\\java.txt");
        f1.createNewFile();
        File f2 = new File("myFile\\JavaSE");
        f2.mkdir();
//        f2.delete();
        File f3 = new File("myFile\\JavaSE\\javase.txt");
        f3.createNewFile();
        f3.delete();
        f2.delete();//失败
    }
}
