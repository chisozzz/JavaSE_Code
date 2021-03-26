package com.ths;
/*
    带返回值的方法调用
 */
public class MethodPractice {
    public static void main(String[] args) {
        System.out.println(getMax(44,23));
        System.out.println(isEventNumber(9));
    }
    public static int getMax(int a, int b){
        int max = a>b?a:b;
        return max;

    }
    public static boolean isEventNumber(int x){
        if (x%2==0){
            return true;
        }else {
            return false;
        }
    }

    //void 和return 的作用相似，不需要返回值用void，需要返回值使用return，一般返回值只有一个数
    public static void  getName(){

    }
    public static  void  getAge(){
        return ;
    }
}
