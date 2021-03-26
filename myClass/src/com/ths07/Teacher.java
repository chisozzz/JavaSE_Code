package com.ths07;
/*
    teacher标准类
 */
public class Teacher {
    private String name;
    private int age;
    private String teachKind;

    public Teacher(){}
    public Teacher(String name,int age,String teachKind){
        this.name=name;
        this.age=age;
        this.teachKind=teachKind;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    public void setTeachKind(String teachKind){
        this.teachKind=teachKind;

    }
    public String getTeachKind(){
        return teachKind;
    }
    public void show(){
        System.out.println(name+","+age+","+teachKind);
    }
}
