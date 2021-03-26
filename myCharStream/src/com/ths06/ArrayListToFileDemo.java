package com.ths06;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
    案例：集合到文件(改进版)
    需求：把ArrayList集合中的学生数据写入到文本文件。要求：每一个学生对象的数据作为文件中的一行数据
          格式：学号,姓名,年龄,居住地	举例：itheima001,林青霞,30,西安
    思路：
    定义学生类
    创建ArrayList集合
    创建学生对象
    把学生对象添加到集合中
    创建字符缓冲输出流对象
    遍历集合，得到每一个学生对象
    把学生对象的数据拼接成指定格式的字符串
    调用字符缓冲输出流对象的方法写数据
    释放资源

 */
public class ArrayListToFileDemo {
    public static void main(String[] args) throws IOException {
        ArrayList<Student> array = new ArrayList<>();
        Student s1 = new Student("ths01", "赵云", 21, "庐陵");
        Student s2 = new Student("ths02", "刘备", 25, "蜀国");
        Student s3 = new Student("ths03", "诸葛亮", 23, "蜀国");
        Student s4 = new Student("ths04", "关羽", 24, "蜀国");
        Student s5 = new Student("ths05", "张飞", 22, "蜀国");

        array.add(s1);
        array.add(s2);
        array.add(s3);
        array.add(s4);
        array.add(s5);
        BufferedWriter bw = new BufferedWriter(new FileWriter("myCharStream\\student.txt"));
        for (Student s:array){
            bw.write(s.show());
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }
}
