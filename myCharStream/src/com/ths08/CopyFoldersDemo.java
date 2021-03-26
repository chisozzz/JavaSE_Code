package com.ths08;

import java.io.*;

public class CopyFoldersDemo {
    public static void main(String[] args)throws IOException {
        File srcFile = new File("D:\\itcast");
        File destFile = new File("F:\\");
        
        copyFolder(srcFile,destFile);
    }

    private static void copyFolder(File srcFile, File destFile)throws IOException {
        if (srcFile.isDirectory()){
            String srcFileName = srcFile.getName();
            File newFile = new File(destFile, srcFileName);
            if(!newFile.exists()){
                newFile.mkdir();
            }
            File[] fileArray = srcFile.listFiles();
            for (File file:fileArray){
                copyFolder(file,newFile);
            }
        }else {
            File newFile = new File(destFile, srcFile.getName());
            copyFile(srcFile,newFile);
        }
    }

    private static void copyFile(File srcFile,File destFile) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));
        int len;
        byte[]bys=new byte[1024];
        while ((len=bis.read(bys))!=-1){
            bos.write(bys,0,len);
        }
        
        bis.close();
        bis.close();
    }
}
