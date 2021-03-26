package com.ths;

import java.util.Scanner;

/*
    案例：减肥计划
    需求：输入星期数，显示今天的减肥活动
          周一：跑步
          周二：游泳
          周三：慢走
          周四：动感单车
          周五：拳击
          周六：爬山
          周日：好好吃一顿
 */
public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入星期数：");
        int x = sc.nextInt();
//        if (x < 1 || x > 7) {
//            System.out.println("输入错误");
//        } else if (x == 1) {
//            System.out.println("周一：跑步");
//        } else if (x == 2) {
//            System.out.println("周二：游泳");
//        } else if (x == 3) {
//            System.out.println("周三：慢走");
//        } else if (x == 4) {
//            System.out.println("周四：动感单车");
//        } else if (x == 5) {
//            System.out.println("周五：拳击");
//        } else if (x == 6) {
//            System.out.println("周六：爬山");
//        } else {
//            System.out.println("周日：好好吃一顿");
//        }
        switch (x) {
            case 1:
                System.out.println("周一：跑步");
                break;
            case 2:
                System.out.println("周二：游泳");
                break;
            case 3:
                System.out.println("周三：慢走");
                break;
            case 4:
                System.out.println("周四：动感单车");
                break;
            case 5:
                System.out.println("周五：拳击");
                break;
            case 6:
                System.out.println("周六：爬山");
                break;
            case 7:
                System.out.println("周日：好好吃一顿");
                break;
            default:
                System.out.println("输入错误");
        }
    }
}
