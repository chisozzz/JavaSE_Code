package cn.tdy;
/*
    同一类
 */
public class Fu {
    public Fu() {
    }
    private void show1(){
        System.out.println("private");
    }
    void show2(){
        System.out.println("默认");
    }
    protected void show3(){
        System.out.println("protected");
    }
    public void show4(){
        System.out.println("public");
    }

    public static void main(String[] args) {
        Fu f = new Fu();
        f.show1();
        f.show2();
        f.show3();
        f.show4();
    }
}
