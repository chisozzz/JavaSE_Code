package com.ths01;

import java.io.File;

/*
    案例：遍历目录
    需求：给定一个路径(E:\\itcast)，请通过递归完成遍历该目录下的所有内容，并把所有文件的绝对路径输出在控制台
    思路：
    根据给定的路径创建一个File对象
    定义一个方法，用于获取给定目录下的所有内容，参数为第1步创建的File对象
    获取给定的File目录下所有的文件或者目录的File数组
    遍历该File数组，得到每一个File对象
    判断该File对象是否是目录
        是：递归调用
        不是：获取绝对路径输出在控制台
    调用方法

 */
public class DiGuiDemo03 {
    public static void main(String[] args) {
        File genFile = new File("D:\\01.20年6月新东方四级");
        getAllFile(genFile);
    }
    public static void getAllFile(File fileList){
        File[] listFiles = fileList.listFiles();
        if (listFiles!=null){
        for (File list:listFiles){
            if (list.isDirectory()){
                getAllFile(list);
            }else {
                System.out.println(list.getAbsolutePath());
            }
            }
        }
    }
}
