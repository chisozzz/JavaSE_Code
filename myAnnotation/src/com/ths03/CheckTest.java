package com.ths03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;
//案例：简单的测试框架
public class CheckTest {
    public static void main(String[] args) throws IOException {
        Calculator cal = new Calculator();
        Class<? extends Calculator> c = cal.getClass();
        Method[] methods = c.getMethods();

        int number = 0;
        BufferedWriter bw = new BufferedWriter(new FileWriter("myAnnotation\\bug.txt"));
        for (Method method : methods) {
            if (method.isAnnotationPresent(Check.class)) {
                try {
                    method.invoke(cal);
                } catch (Exception e) {
//                    e.printStackTrace();
                    number++;
                    bw.write(method.getName() + "方法出异常了");
                    bw.newLine();
                    bw.write("异常的名称：" + e.getCause().getClass().getSimpleName());
                    bw.newLine();
                    bw.write("异常的原因：" + e.getCause().getMessage());
                    bw.newLine();
                    bw.write("-----------------------------");
                    bw.newLine();

                }
            }

        }
        bw.write("本次测试一共" + number + "个异常");
        bw.newLine();
        bw.flush();
        bw.close();
    }
}
