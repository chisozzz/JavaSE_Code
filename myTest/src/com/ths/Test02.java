package com.ths;
/*
    案例；逢七过
    需求：朋友聚会的时候可能会玩一个游戏：逢七过。
    规则是：从任意一个数字开始报数，当你要报的数字包含7或者是7的倍数时都要说：过。
    为了帮助大家更好的玩这个游戏，这里我们直接在控制台打印出1-100之间的
    满足逢七必过规则的数据。这样，大家将来在玩游戏的时候，就知道哪些数据要说：过。

 */
public class Test02 {
    public static void main(String[] args) {
        for (int x = 1; x<=100;x++){
            if (x%10==7 || x/10==7 || x%7 ==0){
                System.out.println(x);
            }
        }
    }
}
