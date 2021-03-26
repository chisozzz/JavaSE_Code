package com.ths07;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/*
    案例：集合到文件(数据排序改进版)
    需求：键盘录入5个学生信息(姓名,语文成绩,数学成绩,英语成绩)。要求按照成绩总分从高到低写入文本文件
          格式：姓名,语文成绩,数学成绩,英语成绩	举例：林青霞,98,99,100

    思路：
    定义学生类
    创建TreeSet集合，通过比较器排序进行排序
    键盘录入学生数据
    创建学生对象，把键盘录入的数据对应赋值给学生对象的成员变量
    把学生对象添加到TreeSet集合
    创建字符缓冲输出流对象
    遍历集合，得到每一个学生对象
    把学生对象的数据拼接成指定格式的字符串
    调用字符缓冲输出流对象的方法写数据
    释放资源

 */
public class TreeSetToFileDemo {
    public static void main(String[] args) throws IOException {
//        TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                int num = o2.getSum() - o1.getSum();
//                int num2 = num == 0 ? o2.getChinese() - o1.getChinese() : num;
//                int num3 = num2 == 0 ? o2.getMath() - o1.getMath() : num2;
//                int num4 = num3 == 0 ? o1.getName().compareTo(o2.getName()) : num3;
//                return num4;
//            }
//        });
        TreeSet<Student>ts=new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
               int num=s2.getSum()-s1.getSum();//先比较总分
               int num2= num==0?s2.getChinese()-s1.getChinese():num;//总分相同比较语文
               int num3= num2==0?s2.getMath()-s1.getMath():num2;//以上都同，比较数学
               int num4= num3==0?s2.getName().compareTo(s1.getName()):num3;//以上都同，按姓名首字母排序
               return num4;//数字为正则顺序，反之为逆序
            }
        });

        for (int i = 0; i < 5; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入第" + (i + 1) + "个学生的信息");
            System.out.println("姓名：");
            String name = sc.nextLine();
            System.out.println("语文成绩：");
            int chiness = sc.nextInt();
            System.out.println("数学成绩：");
            int math = sc.nextInt();
            System.out.println("英语成绩：");
            int english = sc.nextInt();
            Student s = new Student();
            s.setName(name);
            s.setChinese(chiness);
            s.setMath(math);
            s.setEnglish(english);
            ts.add(s);
        }

        BufferedWriter bw = new BufferedWriter(new FileWriter("myCharStream\\students'scort.txt"));
        for (Student s : ts) {
            bw.write(s.show());
            bw.newLine();
            bw.flush();
        }

        bw.close();
    }
}
