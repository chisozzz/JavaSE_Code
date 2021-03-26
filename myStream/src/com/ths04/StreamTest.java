package com.ths04;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*
    现在有两个ArrayList集合，分别存储6名男演员名称和6名女演员名称，要求完成如下的操作
    男演员只要名字为3个字的前三人
    女演员只要姓林的，并且不要第一个
    把过滤后的男演员姓名和女演员姓名合并到一起
    把上一步操作后的元素作为构造方法的参数创建演员对象,遍历数据
    演员类Actor已经提供，里面有一个成员变量，一个带参构造方法，以及成员变量对应的get/set方法

 */
public class StreamTest {
    public static void main(String[] args) {
        List<String> manList = new ArrayList<>();
        List<String> womanList = new ArrayList<>();
        manList.add("周星驰");
        manList.add("刘德华");
        manList.add("吴京");
        manList.add("周润发");
        manList.add("郭富城");
        manList.add("黎明");
        womanList.add("林心如");
        womanList.add("张曼玉");
        womanList.add("林青霞");
        womanList.add("王祖贤");
        womanList.add("貂蝉");
        womanList.add("林黛玉");
//        Stream<String> manStream = manList.stream().filter(s -> s.length() == 3).limit(3);
//        Stream<String> womanStream = womanList.stream().filter(s -> s.startsWith("林")).skip(1);
//        Stream<String> stream = Stream.concat(manStream, womanStream);
//        stream.map(Actor::new).forEach(name-> System.out.println(name.getName()));

        Stream.concat(manList.stream().filter(s -> s.length() == 3).limit(3),
                womanList.stream().filter(s -> s.startsWith("林")).skip(1)).map(Actor::new).
                forEach(s -> System.out.println(s.getName()));

    }
}
