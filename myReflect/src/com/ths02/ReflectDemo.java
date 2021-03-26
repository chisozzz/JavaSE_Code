package com.ths02;
/*
    使用类的class属性来获取该类对应的Class对象。举例：Student.class将会返回Student类对应的Class对象
    调用对象的getClass()方法，返回该对象所属类对应的Class对象
        该方法是Object类中的方法，所有的Java对象都可以调用该方法
    使用Class类中的静态方法forName(String className)，该方法需要传入字符串参数，该字符串参数的值是某个类的全路径，也就是完整包名的路径

 */
public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        //使用类的class属性来获取该类对应的Class对象
        Class<Student> c = Student.class;
        System.out.println(c);
        Class<Student> c2 = Student.class;
        System.out.println(c==c2);
        Student s=new Student();
        Class<? extends Student> c3 = s.getClass();
        System.out.println(c==c3);
        Class<?> c4 = Class.forName("com.ths02.Student");
        System.out.println(c==c4);
    }
}
