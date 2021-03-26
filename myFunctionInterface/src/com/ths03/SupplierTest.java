package com.ths03;

import java.util.function.Supplier;

/*
    练习
    定义一个类(SupplierTest)，在类中提供两个方法
        一个方法是：int getMax(Supplier<Integer> sup)   用于返回一个int数组中的最大值
        一个方法是主方法，在主方法中调用getMax方法

 */
public class SupplierTest {
    public static void main(String[] args) {
        int[]arr={11,53,23,23};
        int max1 = getMax(() -> {
            int max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                max = Math.max(max, arr[i]);
            }
            return max;
        });
        System.out.println(max1);
    }
    //Supplier函数式接口使用无参get（）得到一个某个类型的数据，所以Lambda函数中没有参数
    private static int getMax(Supplier<Integer> sup){
        Integer integer = sup.get();
        return integer;
    }
}
