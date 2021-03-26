package com.ths03;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/*
    案例：游戏次数
    需求：请写程序实现猜数字小游戏只能试玩3次，如果还想玩，提示：游戏试玩已结束，想玩请充值(www.itcast.cn)
    分析：
    写一个游戏类，里面有一个猜数字的小游戏
    写一个测试类，在测试类调用猜数字小游戏
    玩过几次游戏，次数应该记录下来，用文件保存，而且文件应该一开始就提供，初始次数为0
    每次玩的时候，先从文件中读取，看玩了几次
    如果到3次了，给出提示
    如果不到3次，把次数+1，重新写回文件，开始玩游戏

 */
public class GuessNumberDemo {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        FileReader fr = new FileReader("myOtherStream\\games.txt");
        prop.load(fr);
        String count = prop.getProperty("count");
        int number = Integer.parseInt(count);
        fr.close();
        if (number >= 3) {
            System.out.println("游戏试玩已结束，想玩请充值(www.itcast.cn)");
        } else {
            GuessNumber.star();
            number++;
            prop.setProperty("count",String.valueOf(number));
//            System.out.println(prop);
            FileWriter fw = new FileWriter("myOtherStream\\games.txt");
            prop.store(fw, null);
            fw.close();
        }


    }
}
