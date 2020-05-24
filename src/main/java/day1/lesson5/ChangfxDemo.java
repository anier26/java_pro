package day1.lesson5;

public class ChangfxDemo {

    public static void main(String[] args){

        Changfx cfx = new Changfx();

        cfx.setLength(100);
        cfx.setWidth(20);

        int zhou = cfx.getZhou();
        int mj = cfx.getMJ();

        System.out.println("周长: " + zhou);
        System.out.println("面积: " + mj);
    }
}
