package com.practice;

import org.junit.Test;

import java.time.LocalDate;
import java.util.Scanner;

public class Test1 {


    @Test
    public void test1() {
        int x = 10;
        int a = x + x++;
        System.out.println("a=" + a);
        System.out.println("x=" + x);
        int b = x + ++x;
        System.out.println("b=" + b);
        System.out.println("x=" + x);
        int c = x + x--;
        System.out.println("c=" + c);
        System.out.println("x=" + x);
        int d = x + --x;
        System.out.println("d=" + d);
        System.out.println("x=" + x);
    }

    @Test
    public void test2() {
        int a = 15;
        int b = 2;
        double c = 2;
        System.out.printf("%d/%d=%d\n", a, b, a / b);
        System.out.println(a + "%" + b + "=" + a % b);
        System.out.printf("%d/%f=%f\n", a, c, a / c);
        System.out.println(a + "%" + c + "=" + a % c);
    }

    /**
     * 编写java程序，用循环结构打印如下的数值列表：
     * <p>
     * 1 10 100 1000
     * <p>
     * 2 20 200 2000
     * <p>
     * 3 30 300 3000
     * <p>
     * 4 40 400 4000
     * <p>
     * 5 50 500 5000
     */
    @org.junit.Test
    public void test3() {
        for (int i = 1; i <= 5; i++) {
            int temp = 1;
            for (int j = 1; j <= 4; j++) {
                System.out.print(i * temp + " ");
                temp *= 10;
            }
            System.out.println();
        }
    }

    // 打印2到10000的所有素数，每行显示8个素数。
    @org.junit.Test
    public void test4() {
        int count=0;
        for (int i = 2; i <= 10000; i++) {
            boolean flag=true;
            for (int j = 2; j < i; j++) {
                if (i%j==0){
                    flag=false;
                    break;
                }
            }
            if (flag){
                count++;
                System.out.print(i+" ");
                if (count%8==0){
                    System.out.println();
                }
            }
        }
    }
    //编写程序，计算5的阶乘
    @org.junit.Test
    public void test5() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入你要求得数，求得阶乘");
//        int x = sc.nextInt();
//        int mul = mul(5);
//        System.out.println(5+"！="+mul);

    }
    //阶乘的递归
    public static int mul(int x){
        if (x==1){
            return 1;
        }else {
            return x*mul(x-1);
        }
    }

    public static void main(String[] args) {
        //计算某数的阶乘
        /*Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要求得数，求得阶乘");
        int x = sc.nextInt();
        int mul = mul(x);
        System.out.println(5+"！="+mul);*/

        //控制台输入年龄，根据年龄输出不同的提示
        /*Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的年龄:");
        int age = sc.nextInt();
        if (age<0 || age>150){
            throw  new RuntimeException("年龄不合法");
        }else if (age<16){
            System.out.println("少年");
        }else if (age<= 28){
            System.out.println("青年");
        } else if ( age < 48) {
            System.out.println("成人");
        }else {
            System.out.println("老年人");
        }*/
        //编写程序实现9*9的菱形
        /*for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 4 - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = 3; i >=0 ; i--) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 4 - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }*/
        //篮球从5米高的地方掉下来，每次弹起的高度是原来的30%，经过几次弹起，篮球的高度是0.1米。
        /*int pop = pop(5.0, 0.1, 0);
        System.out.println(pop);*/

        //编写程序，模拟用户登录功能，程序开始运行时先在DOS命令窗口中初始化登录页面，
        // 提醒用户输入用户名和密码，当用户输入用户名为admin，密码为123的时候登录成功，打印欢迎信息，
        // 当用户输入的用户名和密码不正确打印错误提示信息并退出系统。
        /*init();*/


        /*通过方法重载、方法重复利用完成以下功能：
            1、定义一个方法，该方法可以选出2个int类型较大的数据，返回值是较大的数据。

            2、再定义一个方法，该方法可以选出3个int类型中较大的数据，返回值是较大的数据。

            3、要求使用方法重载机制，要求代码体现出重复利用。*/
//        System.out.println(max(1,3));
    }
    //设计日期类，每个日期对象都可以描述年月日信息。
    class MyDate{
        public int year;
        public int mouth;
        public int day;
    }
    //设计男人类，每个男人都有身份证号、姓名、性别、女人。设计女人类，每个女人都有身份证号、姓名、性别、男人
    class MyMan{
        public String idCard;//身份证号
        public String mName;//姓名
        public boolean sexy;//true为男，false为女
        public MyWoman woman;//妻子
    }
    class MyWoman{
        public String idCard;//身份证号
        public String wName;//姓名
        public boolean sexy;//true为男，false为女
        public MyMan man;//丈夫
    }
    //设计银行账户类，每个账户都有账号、密码、余额等信息。
    class Account{
        public String bankId;
        public String password;
        public double money;
    }
    //设计微信账号类，每个微信账号都有微信号、手机号、昵称等信息。
    class wxAccount{
        public String wxId;
        public String tel;
        public String name;
    }
    //求最大值的重载
    public static int max(int a,int b,int c) {
        int d = max(a,b);
        return max(d,c);
    }
    public static int max(int a, int b){
        return a>b?a:b;
    }
    //登录的初始化方法
    private static void init() {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------请登入!!!-------");
        System.out.println("请输入登入的姓名：");
        String name = sc.next();
        System.out.println("请输入登入的密码：");
        String password = sc.next();
        login(name,password);
    }
    //登录的方法，
    private static void login(String name, String password) {
        if (name.equals("admin") && password.equals("123")){
            System.out.println(name+"，欢迎您！");
            return;
        }
        System.out.println("用户名或密码错误，系统退出");
        System.exit(0);
    }

    /**
     * 篮球从5米高的地方掉下来，每次弹起的高度是原来的30%，经过几次弹起，篮球的高度是0.1米。
     * @param len 初始高度
     * @param key 最后的高度
     * @param count 弹起的次数
     * @return 弹起的次数
     */
    public static int pop(double len,double key,int count){
        if (len <= key) {
            return count;
        }else {
            count++;
            return pop(0.3*len,key,count);
        }
    }
    @org.junit.Test
    public void test6(){
        String text="456";
        int num=Integer.parseInt(text);//将字符串转换成基本数据类型int
        text=num+"";
        System.out.println(text);
        text=String.valueOf(num);//将基本数据类型包装成包装类
        System.out.println(text);
        text=Integer.toString(num);//将基本数据类型int装换为字符串
        System.out.println(text);
    }
    @org.junit.Test
    public void test7(){
        //LocalDate,LocalTime,LocalDateTime的使用
        //使用ZoneId.of设置时区
//        LocalDate date= LocalDate.now(ZoneId.of("Asia/Shanghai"));
        LocalDate date=LocalDate.now();
        System.out.println(date.getDayOfYear());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getYear());
        LocalDate date1= date.withDayOfMonth(1);
        date1.minusDays(1);
        System.out.println(date1);
    }
}
