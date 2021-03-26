package com.ths08;

public class Student implements Comparable<Student> {
    private String name;
    private int chinese;
    private int math;

    @Override
    public int compareTo(Student o) {
        int num=o.getSum()-this.getSum();
        int num2= num==0?o.getChinese()-this.getChinese():num;
        int num3= num2==0?this.name.compareTo(o.name):num2;
        return num3;
    }

    public int getSum(){
        return chinese+math;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", chinese=" + chinese +
                ", math=" + math +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public Student(String name, int chinese, int math) {
        this.name = name;
        this.chinese = chinese;
        this.math = math;
    }

    public Student() {
    }
}
