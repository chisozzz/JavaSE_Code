package com.ths06;

public class Student {
    private String sid;
    private String name;
    private int age;
    private String adress;
    public String  show(){
        return sid+","+name+","+age+","+adress;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Student(String sid, String name, int age, String adress) {
        this.sid = sid;
        this.name = name;
        this.age = age;
        this.adress = adress;
    }

    public Student() {
    }
}
