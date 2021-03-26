package com.ths02;

import java.util.Scanner;

public class TeacherDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入分数：");
        int i = sc.nextInt();
        Teacher t = new Teacher();
        try {
            t.Score(i);
        }catch (ScoreException e){
            e.printStackTrace();
        }
    }
}
