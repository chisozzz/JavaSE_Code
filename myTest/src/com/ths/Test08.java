package com.ths;
/*
    案例：反转
    需求：已知一个数组 arr = {19, 28, 37, 46, 50}; 用程序实现把数组中的元素值交换，
          交换后的数组 arr = {50, 46, 37, 28, 19}; 并在控制台输出交换后的数组元素。

 */
public class Test08 {
    public static void main(String[] args) {
        int[]arr={19, 28, 37, 46, 50};

//        for (int star =0,end =arr.length-1;star<=end;star++,end--){
//            int temp =arr[star];
//            arr[star]=arr[end];
//            arr[end]=temp;
//
//        }

//        System.out.print("[");
//        for (int x =0;x<arr.length;x++){
//            if (x == arr.length-1){
//                System.out.print(arr[x]);
//            }else {
//                System.out.print(arr[x]+", ");
//            }
//            //System.out.print(arr[x]);
//        }
//        System.out.println("]");

        resere(arr);
        arrayPrint(arr);

    }
    //数组反转
    public static void resere(int[]arr){
        for (int star =0,end =arr.length-1;star<=end;star++,end--){
            int temp =arr[star];
            arr[star]=arr[end];
            arr[end]=temp;

        }
    }
    //遍历方法
    public static void arrayPrint(int[]arr){
        System.out.print("[");
        for (int x =0;x<arr.length;x++){
            if (x == arr.length-1){
                System.out.print(arr[x]);
            }else {
                System.out.print(arr[x]+", ");
            }
            //System.out.print(arr[x]);
        }
        System.out.println("]");
    }
}
