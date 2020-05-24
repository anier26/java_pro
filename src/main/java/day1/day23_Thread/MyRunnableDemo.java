package day1.day23_Thread;

public class MyRunnableDemo {
    public static void main(String[] args){
        MyRunnable myRunnable = new MyRunnable();
//
//        Thread t1 = new Thread(myRunnable);
//        Thread t2 = new Thread(myRunnable);
//
//        t1.setName("aha");
//        t2.setName("yian");

        //方式二:

        Thread t1 = new Thread(myRunnable,"aha");
        Thread t2 = new Thread(myRunnable,"yian");

        t1.start();
        t2.start();
    }
}
