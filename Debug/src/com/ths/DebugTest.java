package com.ths;
/*
    查看求的1-10偶数和的执行过程
 */
public class DebugTest {
    public static void main(String[] args) {
        //定义总和变量
        int sum = 0;
        //循环相加，依次递增
        for (int i =1;i< 11;i++){
            //逢偶数相加
            if (i%2==0){
                sum +=i;
            }
        }
        System.out.println(sum);
    }
}
