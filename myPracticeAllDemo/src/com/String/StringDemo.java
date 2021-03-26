package com.String;

import java.util.Scanner;

//需求：已知用户名和密码，请用程序实现模拟用户登录。总共给三次机会，登录之后，给出相应的提示
public class StringDemo {
    public static void main(String[] args) {
        String name="ths";
        String passage="123";
        for (int i = 0; i < 3; i++) {
            Scanner sc=new Scanner(System.in);
            System.out.println("请输入你的用户名：");
            String aName = sc.nextLine();
            System.out.println("请输入你的密码：");
            String aPassage=sc.nextLine();
            if (name.equals(aName)&&passage.equals(aPassage)){
                System.out.println("登入成功");
                break;
            }else {
                if (i==2){
                    System.out.println("你的账号已被锁定");
                    continue;
                }
                System.out.println("用户名或密码错误，请重新输入，你还有"+(2-i)+"机会");
            }
        }
    }
}
