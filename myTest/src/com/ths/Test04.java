package com.ths;
/*
    案例：百钱百鸡
    需求：我国古代数学家张丘建在《算经》一书中提出的数学问题：鸡翁一值钱五，鸡母一值钱三，鸡雏三值钱一。
          百钱买百鸡，问鸡翁、鸡母、鸡雏各几何？

 */

public class Test04 {
    public static void main(String[] args) {

        for (int x =0;x<21;x++){
            for (int y =0; y< 34;y++){
                int z =100 -x -y;
                if ( (z%3==0) && (5*x+3*y+z/3==100)){
                    System.out.println(x+","+y+","+z);
                }


            }
        }
    }
}
