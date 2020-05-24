package day1.day23_Thread;

public class MyThread1Demo extends Thread {
    public static void main(String[] args){
        MyThread1 my1 = new MyThread1();
        MyThread1 my2 = new MyThread1();

        //设置线程名:
        my1.setName("aha");
        my2.setName("yian");

        my1.start();
        my2.start();
    }
}
