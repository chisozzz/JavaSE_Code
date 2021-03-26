package com.ths02;

import java.util.Arrays;

/*
    测试类：字符串中数据排序
    需求：有一个字符串：“91 27 46 38 50”，请写程序实现最终输出结果是：“27 38 46 50 91”


 */
public class IntegerTest {
    public static void main(String[] args) {
        String s="91 27 46 38 50";
        //使用split创建String[]数组ss
        String[] ss= s.split(" ");
        int[]arr=new int[ss.length];
//        for (int i=0;i<ss.length;i++){
//            System.out.println(ss[i]);
//        }
        for (int i=0;i<arr.length;i++){
            //String ---- int
            arr[i]=Integer.parseInt(ss[i]);
        }
        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<arr.length;i++){
            if (i==arr.length-1){
                sb.append(arr[i]);
            }else {
                sb.append(arr[i]).append(" ");
            }
        }
        System.out.println(sb.toString());
    }

}
