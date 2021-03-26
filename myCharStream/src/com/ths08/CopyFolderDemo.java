package com.ths08;

import java.io.*;

/*
    案例：复制单级文件夹
    需求：把“E:\\itcast”这个文件夹复制到模块目录下
    思路：
    创建数据源目录File对象，路径是E:\\itcast
    获取数据源目录File对象的名称
    创建目的地目录File对象，路径由(模块名+第2步获取的名称)组成
    判断第3步创建的File是否存在，如果不存在，就创建
    获取数据源目录下所有文件的File数组
    遍历File数组，得到每一个File对象，该File对象，其实就是数据源文件
    获取数据源文件File对象的名称
    创建目的地文件File对象，路径由(目的地目录+第7步获取的名称)组成
    复制文件
    由于不清楚数据源目录下的文件都是什么类型的，所以采用字节流复制文件
    采用参数为File的构造方法

 */
public class CopyFolderDemo {
    public static void main(String[] args) throws IOException {
        File srcFolder = new File("D:\\itcast");
        String srcFolderName = srcFolder.getName();
        File destFolder = new File("myCharStream", srcFolderName);
        if (!(destFolder.exists())){
            destFolder.mkdir();
        }
        File[] listFiles = srcFolder.listFiles();
        for (File srcFile:listFiles){
            String srcFileName = srcFile.getName();
            File destFile = new File(destFolder, srcFileName);
            copyFile(srcFile,destFile);
        }
    }
    public static void copyFile(File srcFile,File destFile) throws IOException {
//        FileInputStream fis = new FileInputStream(srcFile.getName());
//        FileOutputStream fos = new FileOutputStream(destFile.getName());
        BufferedInputStream fis = new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream(destFile));
        int by;
        byte[]bys=new byte[1024];
        while ((by=fis.read(bys))!=-1){
            fos.write(bys,0,by);
        }
        fis.close();
        fos.close();

    }
}
