package com.ths05;
/*
    练习
    定义一个类(Student)，里面有两个成员变量(name,age)
        并提供无参构造方法和带参构造方法，以及成员变量对应的get和set方法
    定义一个接口(StudentBuilder)，里面定义一个抽象方法
        Student build(String name,int age);
    定义一个测试类(StudentDemo)，在测试类中提供两个方法
        一个方法是：useStudentBuilder(StudentBuilder s)
        一个方法是主方法，在主方法中调用useStudentBuilder方法

 */
public class StudentDemo {
    public static void main(String[] args) {
//        useStudentBuilder((String name,int age)->{
//            Student s1 = new Student(name, age);
//            return s1;
//        });
//        useStudentBuilder(((name, age) -> new Student(name,age)));
        useStudentBuilder(Student::new);

    }
    private static void useStudentBuilder(StudentBuilder s){
        Student s1 = s.build("杨紫", 23);
        System.out.println(s1.getName()+","+s1.getAge());
    }
}
