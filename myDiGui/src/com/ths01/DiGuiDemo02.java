package com.ths01;
/*
    案例：递归求阶乘
    需求：用递归求5的阶乘，并把结果在控制台输出
    思路：
    定义一个方法，用于递归求阶乘，参数为一个int类型的变量
    在方法内部判断该变量的值是否是1
        是：返回1
        不是：返回n*(n-1)!
    调用方法
    输出结果
 */
public class DiGuiDemo02 {
    public static void main(String[] args) {
        int f = f(5);
        System.out.println(f);
    }
    public static int f(int n){
        if (n==1){
            return 1;
        }else {
            return n*f(n-1);
        }
    }
}
