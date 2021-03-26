package com.ths03;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void star(){
        Random r =new Random();
        int num = r.nextInt(100)+1;

        while (true){
            Scanner sc =new Scanner(System.in);
            System.out.println("请输入你要猜的数字：");
            int guessNum = sc.nextInt();
            if (guessNum==num){
                System.out.println("恭喜你，猜对了");
                break;
            }else if (guessNum>num){
                System.out.println("你输入的数字大了");
            }else {
                System.out.println("你输入的数字小了");
            }
        }
    }
}
