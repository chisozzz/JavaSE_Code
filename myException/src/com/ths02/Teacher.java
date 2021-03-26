package com.ths02;

public class Teacher {
    public void Score(int i) throws ScoreException {
        if (i<0||i>100){
           throw  new ScoreException("你输入的分数不在1~100之间，请重新输入");
        }else {
            System.out.println("数据正确");
        }
    }
}
