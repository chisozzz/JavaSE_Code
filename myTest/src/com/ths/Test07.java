package com.ths;

import java.util.Scanner;

/*
    案例：查找
    需求：已知一个数组 arr = {19, 28, 37, 46, 50}; 键盘录入一个数据，查找该数据在数组中的索引，并在控
          制台输出找到的索引值。

 */
public class Test07 {
    public static void main(String[] args) {
        int[]arr={19, 28, 37, 46, 50};
        Scanner sc = new Scanner(System.in);
        System.out.println("输入查找的数字：");
        int number =sc.nextInt();
        //建立一个索引值非常关键，初始化为-1（error）
//        int index=-1;
//        for (int x=0;x<arr.length;x++){
//            if (number ==arr[x]){
//                index =x;
//            }
//        }
        int index =getIndex(number,arr);
        System.out.println(index);

    }

    public static int getIndex(int number,int[]arr){
        int index =-1;
        for (int x=0;x<arr.length;x++){
            if (number ==arr[x]){
                index =x;
            }
        }
        return index;
    }
}
