package com.ths01.test;

import com.ths01.demo.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Junit单元测试单元
 */
public class CalculatorTest {
    /**
     * 测试Calculator类中的add方法
     */
    @Before
    public void builder(){
        System.out.println("创建流处理");
    }
    @After
    public void close(){
        System.out.println("流操作处理关闭");
    }
    @Test
    public void testAdd(){
        System.out.println("testAdd");
        Calculator c=new Calculator();
        int i = c.add(1, 2);
        //Junit提供的断言assert测试期待和实际值的方法
        Assert.assertEquals(3,i);
    }
    @Test
    public void testSub(){
        Calculator c=new Calculator();
        int i = c.sub(2, 1);
        Assert.assertEquals(1,i);
    }
}
