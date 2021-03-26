package com.ths_02;
/*
    案例：运动员和教练
    需求：我们现在有乒乓球运动员和篮球运动员，乒乓球教练和篮球教练。为了出国交流，跟乒乓球相关的人员都需要
          学习英语。请用所有知识分析，这个案例中有哪些具体类，哪些抽象类，哪些接口，并用代码实现
 */
public class PersonDemo {
    public static void main(String[] args) {
        PingPangCoach ppc  = new PingPangCoach("张教练", 55);
        ppc.show();
        ppc.eat();
        ppc.teach();
        ppc.speak();
        System.out.println("-----------");
        PingPangPlayer ppp =new PingPangPlayer();
        ppp.setName("马龙");
        ppp.setAge(25);
        ppp.show();
        ppp.eat();
        ppp.study();
        ppp.speak();
        System.out.println("-----------");
        BasketballCoach bc = new BasketballCoach("王教练", 54);
        bc.show();
        bc.eat();
        bc.teach();
//        bc.speak();没有接口
        System.out.println("-----------");
        BasketballPlayer bp =new BasketballPlayer("姚明",26);
        bp.show();
        bp.eat();
        bp.study();

    }
}
