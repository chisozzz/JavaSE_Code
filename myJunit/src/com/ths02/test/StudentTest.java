package com.ths02.test;

import com.ths02.demo.Student;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StudentTest {

    @Before
    public void first(){
        Student s = new Student("zhangsan",22);
        System.out.println(s);

    }
    @After
    public void end(){
        System.out.println("end");
    }
    @Test
    public void testEat(){
        Student s=new Student();
        String str = s.eat();
        Assert.assertEquals("吃大米",str);
    }
}
