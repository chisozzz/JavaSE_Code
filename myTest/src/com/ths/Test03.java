package com.ths;

/*
    案例：不死神兔
    需求：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，
          假如兔子都不死，问第二十个月的兔子对数为多少？
    规律：
    从第三个数据开始，每一个数据是前两个数据之和。
    第1个，第2个数据是已知的。

 */
public class Test03 {
    public static void main(String[] args) {
        int[] arr = new int[20];
        arr[0] = 1;
        arr[1] = 1;
        for (int x = 2; x < arr.length; x++) {
            arr[x] = arr[x - 2] + arr[x - 1];
        }
        System.out.println(arr[19]);
    }
}
