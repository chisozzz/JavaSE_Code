package com.ths01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
    并发修改异常
    ConcurrentModificationException
    产生原因
    迭代器遍历的过程中，通过集合对象修改了集合中的元素，造成了迭代器获取元素中判断预期修改值和实际修改值不一致

    测试需要：查找和world相同的元素，并添加或修改javase 并输出遍历
 */
public class ListTest {
    public static void main(String[] args) {
        List<String >list=new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("java");
        String s="world";
//        ConcurrentModificationException
//        Iterator<String> it = list.iterator();
//        while (it.hasNext()){
//            String s1 = it.next();
//            if (s1.equals(s)){
//                list.add("javase");
//            }
//        }
        for (int i=0;i<list.size();i++){
            String s1 = list.get(i);
            if (s1.equals("world")){
//                list.set(i,"javase");//不能再遍历中删改元素
                list.remove(i);//不能再遍历中删改元素

//                list.add("javase");
//                System.out.println();
            }
        }
        System.out.println(list);
    }
}
