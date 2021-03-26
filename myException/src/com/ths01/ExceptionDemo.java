package com.ths01;

public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("开始");
        method();
        System.out.println("结束");
    }
    public static void method(){
        try {
            int []arr={1,2,3};
//        int i=arr[1];
            int i=arr[3];//ArrayIndexOutOfBoundsException
            System.out.println(i);
        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("你访问的数组元素不存在，请修改代码");
//            e.printStackTrace();返回全部信息在控制台

            //Exception --getMessage返回错误原因
//            System.out.println(e.getMessage());
//            Index 3 out of bounds for length 3

            //Exception中toString返回简短描述错误地址和原因
//            System.out.println(e.toString());
//            java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3


        }


    }
}
