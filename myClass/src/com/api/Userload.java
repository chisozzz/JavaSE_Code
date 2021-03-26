package com.api;

import java.util.Scanner;

/*
    案例：用户登录
    需求：已知用户名和密码，请用程序实现模拟用户登录。总共给三次机会，登录之后，给出相应的提示

 */
public class Userload {
    public static void main(String[] args) {
        String username="ths";
        String password="123456";

        for (int i=0;i<3;i++){
            Scanner sc =new Scanner(System.in);
            System.out.println("请输入用户名：");
            String s = sc.nextLine();
            System.out.println("请输入密码：");
            String s1 = sc.nextLine();

            if (s.equals(username)&&s1.equals(password)){
                System.out.println("登陆成功");
                break;
            }else {
                if (i==2){
                    System.out.println("你的账号被锁定，请联系管理员。");
                }else {
                    System.out.println("登录失败，还有"+(2-i)+"次机会");
                }

            }
        }


    }
}
