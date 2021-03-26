package com.ths_02;

public class PingPangCoach extends Coach implements SpeakEnglish{
    public PingPangCoach() {
    }

    public PingPangCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("乒乓球教练吃小白菜，喝小米粥");
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练教发球和接球");
    }

    @Override
    public void speak() {
        System.out.println("英语");
    }
}
