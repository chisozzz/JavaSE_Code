package com.ths;
/*
    练习数组的创建规则，静态初始化和动态初始化
    静态初始化适用于知道数据值和由系统决定元素个数（长度）
    动态初始化则是建立一个元素值默认为0的空数组（定义规定长度）
    初始化时会为存储空间添加默认的值
        int 0 double 0.0
        boolean false
        char  空字符
        引用数据类型 null
    数组元素的使用通过索引来找到元素的地址所包含的数值
    索引从0开始到长度-1
    索引是连续的，并且注意增加1
    数组名 arr 表示数组的首地址
    创建的数组存储在栈内存中，数组元素存储在堆内存中
 */
public class ArrayDemo {
    public static void main(String[] args) {
//        建立数组使用动态初始化
        int[] arr=new int[3];
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        System.out.println("---------");
        //静态初始化
        int[] arr1 = {1,2,3};
        System.out.println(arr1);
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
    }
}
