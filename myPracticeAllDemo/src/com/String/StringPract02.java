package com.String;

import java.util.Arrays;
import java.util.Scanner;

//需求：定义一个方法，把 int 数组中的数据按照指定的格式拼接成一个字符串返回，调用该方法，
//并在控制台输出结果。例如，数组为 int[] arr = {1,2,3}; ，执行方法后的输出结果为：[1, 2, 3]
public class StringPract02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一组数字(中间用空格分开)：");
        String num = sc.nextLine();
        String[] nums = num.split(" ");
        System.out.println(printInt(nums));

    }

    private static String printInt(String[] nums) {
        String s="";
        s+="[";

        for (String num:nums){
            if (num.equals(nums[nums.length-1])){
                s+=num;
                break;
            }
            s+=num;
            s+=", ";
        }
        s+="]";
        return s;
    }
}
